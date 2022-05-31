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

function TestList(menuName_check, menuPrice_check){
    let orderList = "";
    let orderName = menuName_check;
    let orderPrice = parseInt(menuPrice_check);
    // let orderText = orderName + " " + orderPrice;

    let orderSumText = "";
    
    if($(".pop_orderList > ul > li").click){
        $(".pop_orderList > ul > li.no-order").remove();
    }

    // 주문내역 추가
    orderList = orderList +"<li class='menu-order'>"+ orderName + "<span class='price'><em class='priceVal'>"+ orderPrice +"</em>원<a href='#' class='order-deleteBtn'>삭제</a></span></li>"
    $(".pop_orderList > ul").append(orderList);

    
    orderSum += orderPrice;
    console.log(orderSum);

    // 주문내역 총합
    orderSumText = orderSumText +"<p class='order_sum'>총합 : "+ orderSum +"</p>"
    $(".orderSum").html(orderSumText); 
}

function popupControlOpen(){
    $(".popup").addClass("open");
    // console.log("popup");
}
function popupControlClose(){
    $(".pop-close").click(function(){
        $(".popup").removeClass("open");
        // console.log("popup");
    });
}






