
- Difference between == and equals()
- StringBuilder vs String
- toString()
- why can't we use length() property with primitive data types like int

    For eg: int num = 123 ; 
            int length = num.length() ; 

We can convert the integer to a 'String' and then use the 'length()' method. 

    int num = 123;
    String numStr = Integer.toString(num) ; 
    int length = numStr.length() ; 