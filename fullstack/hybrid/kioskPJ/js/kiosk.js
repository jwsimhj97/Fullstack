var db = null;

// 데이터베이스 생성 및 오픈
function openDB(){
    db = window.openDatabase('kioskDB', '1.0', '카페키오스크DB', 5*1024*1024);
    console.log('1_DB 생성...');
}

// 테이블 생성 트랜잭션 실행
function createTable() {
    db.transaction(function(ps) {
        var createSQL = 'create table if not exists book(bookid integer primary key autoincrement, type text, name text)';
        ps.executeSql(createSQL, [], function(){
            console.log('2_1_테이블생성_sql 실행 성공...');
        }, function(){
            console.log('2_1_테이블생성_sql 실행 실패...');
        });
    },function() {
        console.log('2_2_테이블 생성 트랜잭션 실패...롤백은 자동');
    },function(){
        console.log('2_2_테이블 생성 트랜잭션 성공...');
    });
}

// 데이터 입력 트랜잭션 실행
function insertBook(){
    db.transaction(function(ps){
        var type=$('#bookType1').val();
        var name=$('#bookName1').val();
        var insertSQL = 'insert into book(type, name) values(?,?)';

        ps.executeSql(insertSQL, [type, name], function(ps, rs){
            console.log('3_책 등록...no: ' + rs.insertId);
            alert('도서명 ' + $('#bookName1').val() + ' 이 입력되었습니다');
            $('#bookName1').val('');
            $('#bookType1').val('미정').attr('selected', 'selected');
            $('#bookType1').selectmenu('refresh');
        });
    });
}

// 데이터 수정 트랜잭션 실행
function updateBook(){
    db.transaction(function(ps){
        var type= $('#bookType2').val();
        var new_name = $('#bookName2').val();
        var old_name = $('#sBookName2').val();
        var updateSQL = 'update book set type=?, name=? where name=?';
        ps.executeSql(updateSQL, [type, new_name, old_name], function(ps, rs){
            console.log('5_책 수정...');
            alert('도서명 ' + $('#sBookName2').val() + ' 이 수정되었습니다');
            $('#bookName2').val('');
            $('#sBookName2').val('');
            $('#bookType').val('미정').attr('selected', 'selected');
            $('#bookType2').selectmenu('refresh');
        },
        function(ps, err){
            alert('DB오류 ' + err.message + err.code);
        });
    });
}
// 데이터 삭제 트랜지션 실행
function deleteBook(){
    db.transaction(function(ps){
        var bookid=$('#bookid').val();
        var deleteSQL = 'delete from book where bookid=?';
        ps.executeSql(deleteSQL, [bookid], function(ps, rs){
            console.log('6_책 삭제...');
            alert('도서명 ' + $('#bookid').val() + ' 이 삭제되었습니다');
            $('#bookType3').val('');
            $('#bookName3').val('');
            $('#sBookName3').val('');
        },
        function(ps, err){
            alert('DB오류 ' + err.message + err.code);
        });
    });
}
// 데이터 수정 위한 데이터 검색 트랜잭션 실행
function selectBook2(name){
    db.transaction(function(ps){
        // var selectSQL = 'select type name from book where name=?';
        var selectSQL = "select bookid, type, name from book where name like '%'||?||'%'";
        ps.executeSql(selectSQL, [name], function(ps, rs){
            $('#bookType2').val(rs.rows.item(0).type).attr('selected', 'selected');
            $('#bookType2').selectmenu('refresh');
            $('#bookName2').val(rs.rows.item(0).name);
        });
    });
}
// 데이터 삭제를 위한 데이터 검색 트랜잭션 실행
function selectBook3(name){
    db.transaction(function(ps){
        // var selectSQL = 'select type, name from book where name=?';
        var selectSQL = "select rowid, type, name from book where name like '%'||?||'%'";
        ps.executeSql(selectSQL, [name], function(ps, rs){
            $('#bookType3').val(rs.rows.item(0).type);
            $('#bookName3').val(rs.rows.item(0).name);
            $('#bookid').val(rs.rows.item(0).bookid);
        },
        function(ps, err){
            alert('DB오류 ' + err.message + err.code);
        });
    });
}












// 주문 장바구니
let basket = {};
let tab = "#tab1";

function tabId(id){
    tab = id;
    console.log(id);
}

function add(id){
    if(basket[id] == undefined){
        basket[id] = 0;
    }
    basket[id] = basket[id]+1;
    
    console.log(id);
};


// 결제하기 하단버튼
function btnFnc(num){
    switch(num){
        case 1: location.href="#home"; break;
        default : location.href="#page1";
    }
}


// 팝업창에 주문내역 추가
let orderSum = 0;
let orderMenuListBasket = {};
let orderList = "";

function TestList(menuName_check, menuPrice_check){
    let orderName = menuName_check;
    let orderPrice = parseInt(menuPrice_check);
    // let orderText = orderName + " " + orderPrice;

    let orderSumText = "";
    
    if($(".pop_orderList > ul > li").click){
        $(".pop_orderList > ul > li.no-order").remove();
    }

    // 주문내역 추가
    if(orderMenuListBasket[orderName] == undefined){
        orderMenuListBasket[orderName] = 0;
    }
    orderMenuListBasket[orderName] = orderMenuListBasket[orderName]+1;
    for(let i=0; i<orderMenuListBasket[orderName]; i++){
        console.log(orderName);
    }
    
    
    // orderList = orderList +"<li class='menu-order'><span class='menuName'>"+ orderName + "</span><span class='price'><em class='priceVal'>&#8361; "+ orderPrice +"</em><a href='#' id='orderBtn' class='order-deleteBtn'></a></span></li>"
    // $(".pop_orderList > ul").append(orderList);

    
    orderSum += orderPrice;
    console.log(orderSum);


    // 주문내역버튼클릭시 해당리스트줄 삭제
    $('.order-deleteBtn').click(function(){
        let orderBtnParentLi = $(this).parent().parent();
        orderBtnParentLi.remove();
        orderSum = orderSum - orderPrice;
        // console.log(orderSum);
    });
    // $('.order-deleteBtn').click(orderListDelete(orderPrice, this));
    
    // 주문내역 총합
    orderSumText = orderSumText +"<p class='order_sum'>총합 : "+ orderSum +"</p>"
    $(".orderSum").html(orderSumText);    
}
// function orderListDelete(orderPrice, this){
//     let orderBtnParentLi = $(this).parent().parent();
//     orderBtnParentLi.remove();
//     orderSum = orderSum - orderPrice;
//     console.log(orderSum);
// }


function popupControlOpen(){
    $(".popup").addClass("open");
    // console.log("popup");
}
function popupControlClose(){
    $(".popup").removeClass("open");
    // console.log("popup");

    
}

// .order_content height값
let contHeight_size = (window.innerHeight)-50;
function setDivHeight(){
    $(".order_content").height(contHeight_size);
}


// 스크롤 맨밑감지
function srcollBottomCheck(){
    $(".order_content").scroll(function(){
        var scrollTop = $(this).scrollTop();
        var innerHeight = $(this).innerHeight();
        var scrollHeight = $(this).prop('scrollHeight');
    if (scrollTop + innerHeight >= scrollHeight) {
        
        if($(".pop-close").click){
            // $(".popup").addClass("dfdfdf");
        }
        console.log("맨밑");
        } else {
        // $(".popup").addClass("ㄴㄴㄴㄴ");
        console.log("맨밑아님");
        }
    });
}










