/* Q->  Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.*/

public class Program7 
{
    public static void main(String[] args) {
        int[]nums={12,345,2,6,7896};
        System.out.println(findnumber(nums));
        // if you want to find the number of digits in number then write
        System.out.println(digits(46746464));
        
    }
    static int findnumber(int[]nums)
    {
        int count=0;
        for(int num:nums)
        {
        if(Even(num))
        {
          count++;  
        }
    }
        
        return count;
    }
    //function to chack the whether a number contains even or not 
    static boolean Even(int num) {
        int numberofDigits=digits(num);
        if(numberofDigits%2==0)
        {
            return true;
        }
        return false;
    }
    
    //count number of digits in a number
    static int digits(int num)
    { 
        if(num<0)
        {
            num=num*(-1);
        }
        if(num==0)
        {
            return 1;
        }
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;//num/=10
        }
        return count;
    }
}