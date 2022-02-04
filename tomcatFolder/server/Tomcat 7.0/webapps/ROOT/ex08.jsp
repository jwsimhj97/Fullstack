<html>
    <head>
        <meta charset="utf-8">
    </head>
    <body>
        <h1>java code</h1>
        <table border="1">
            <% 
                String[] arr1={"java1","java2","java3","java4"};
                String[] arr2={"web1","web2","web3","web4"};
                String[] arr3={"db1","db2","db3","db4"};
                String[] arr4={"framework1","framewor2","framewor3","framewor4"};

                String[][] arr=new String[][]{arr1, arr2, arr3, arr4};
                for(int i=0; i<arr.length; i++){
             %>
                <tr>
                    <td>row<%=arr[i][1]%></td>
                    <td>row<%=arr[i][3]%></td>
                    <td>row<%=arr[i][0]%></td>
                </tr>
            <% } %>
        </table>
        
    </body>
</html>