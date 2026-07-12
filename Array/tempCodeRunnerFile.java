int [] arr = {2,3,4,5,6};
        int [] x = arr; //x is shallow  copy of arr actual mai copy nhi banani ab uska name change kiya
        x[0]=100;
        System.out.println(arr[0]);