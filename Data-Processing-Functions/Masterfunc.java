/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datasortingnanalysis;

/**
 *
 * @author Mehul,Nimish & Ajit
 */
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Masterfunc {
    
    public static void searcharray()                     // function to search within an ArrayList the specified element type= "Integer" and returning the index of element 
    {  
        int n = 0,s=0;
        ArrayList<Integer> num;
        num = new ArrayList<Integer>();
        Scanner S= new Scanner(System.in);                                               //   Scanner "S" intialized 
        System.out.println("Hey there please enter the elements:");
        System.out.println("Just Enter '0' to end the process of accepting numbers ");                // end process of entering numbers type= "Integer"
            while(1==1)
            {
                n=S.nextInt();
                num.add(n);                       // Dynamically creating array and storing the elements into ArrayList 
                if(n==0)
                {    
                    break;
                }
            }
        System.out.println("Please enter the element you want to search");         //Searching algorithm
        s=S.nextInt();
        
        for(int i=0; i<=num.size(); i++)                          // index driving variable to be "less than" num.size()= size of the ArrayList
        {
            if(s==num.get(i))
            {
                System.out.println("The Element found at: "+i+" Position");          // printing the index of ArrayList element; i as a variabe to denote index
                break;
            }
        }
        
    }              //end of search function..
    
    
    public static void sortarray()                               // Fucntion to sort an array either in "Ascending order" || "Descending order"
    {   
        int n = 0,l=0;
        String ans;
        ArrayList<Integer> num;                                             // empty ArrayList of type="Integer" intialized 
        num = new ArrayList<Integer>();
        Scanner S= new Scanner(System.in);
        System.out.println("Hey please enter the elements you want to sort: ");
        System.out.println("Just Enter '0' to end the process of accepting numbers ");              // terminating variable '0' to stop taking the input from user 
        
            while(1==1)                              // to continue the input process from the user until the termination detector '0' is entered 
            {
                n=S.nextInt();
                num.add(n);                       //dynamically creating array and storing the elements 
                if(n==0)
                {    
                    break;                                         // breaking point based on detecting '0' as a end to get out of the while loop 
                }
            }
            
        Collections.sort(num);                   // function ot sort the numbers in ascending order
        
        System.out.println("The Sorted Numbers are:");
        System.out.println(num);                              // displaying the sorted numbers in ascending order sorted by the Collections.sort(num) fucntion
        
        System.out.println("Do you want it descending order \nEnter Yes or No?");
        ans=S.nextLine();
        
            if("Yes".equals(ans) || "yes".equals(ans))                                       // string comparison; detecting and comparing string stored in ans= " -*- "
            {
                l=num.size();                               // ArrayList function that store the value of size of arraylist into intialized l 
                for(int i=(l-1) ; i>=0 ; i--)
                {
                  System.out.println(num.get(i));      // prints in descending order according to list   
                }

            }
            else if("No".equals(ans) || "no".equals(ans))   
            {
                System.out.println("Byee!!");
            }
            
        
    }          //end of sort function..
     
    
    public static void addmatrix()                        //Function to add two matrices of type A[x][y] & B[u][v] ;input values of u,v,x & y specified by user of program
    {
        int p, q, m, n;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        n = s.nextInt();
        
        if (p == m && q == n) 
            {
                int a[][] = new int[p][q];      // First matrix
                int b[][] = new int[m][n];      // Second matrix
                int c[][] = new int[m][n];      // addition matrix c 
                
            System.out.println("Enter all the elements of first matrix:");              
                
                for (int i = 0; i < p; i++) 
                {
                    for (int j = 0; j < q; j++) 
                    {
                        a[i][j] = s.nextInt();                            // taking input type= "Integer" from user for matrix/ 2d array "a" 
                    }
                }
                
            System.out.println("Enter all the elements of second matrix:");
            
                for (int i = 0; i < m; i++) 
                {
                    for (int j = 0; j < n; j++) 
                    {
                        b[i][j] = s.nextInt();                               // taking input type= "Integer" from user for matrix/ 2d array "b"
                    }
                }
            
            System.out.println("First Matrix:");                                                                      // }
                                                                                                                     // } 
                for (int i = 0; i < p; i++)                                                                         // }
                {                                                                                                  // }
                    for (int j = 0; j < q; j++)                                                                   //     printing 2d Array / Matrix "a" to confirm with user 
                    {                                                                                            // }
                        System.out.print(a[i][j]+" ");                                                          // }
                    }                                                                                          // }
                    System.out.println("");                                                                   // }
                }                                                    
            
            System.out.println("Second Matrix:");                                                      // }
                                                                                                      // }
                for (int i = 0; i < m; i++)                                                          // }
                {                                                                                   // }
                    for (int j = 0; j < n; j++)                                                    // }
                    {                                                                             //    printing 2d Array / Matrix "b" to confirm with user
                        System.out.print(b[i][j]+" ");                                           //
                    }                                                                           //
                    System.out.println("");                                                    //
                }
            
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];                 // adding each element of 2D arrays "a" & "b" to get the result in 2D array "c"
                    }
                }
            }
            
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(c[i][j]+" ");                            // printing the end result of addition stored in 2d array / matrix  "c" type= "Integer" 
                }
                System.out.println("");
            }
        
            
        }
            
        else
        {
            System.out.println("Addition would not be possible");
        }
            
    }                 //end of add matrix function..
    
    
    public static void transposematrix()             // function to find the transopse of a given matrix where matrix dimensions to be specified by user 
    {
	int i, j;
	System.out.println("Enter total rows and columns: ");
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int column = s.nextInt();
	int array[][] = new int[row][column];
	System.out.println("Enter matrix:");
        
 	for(i = 0; i < row; i++)
  	{
   	    for(j = 0; j < column; j++) 
     	    {
        	array[i][j] = s.nextInt();
        	System.out.print(" ");
            }
  	}
        
	System.out.println("The above matrix before Transpose is ");
        
  	for(i = 0; i < row; i++)
    	{
      	    for(j = 0; j < column; j++)
            {
          	System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
        
 	System.out.println("The above matrix after Transpose is ");
        
  	for(i = 0; i < column; i++)
    	{
      	    for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    
    
   }            //end of transpose matrix function
    

 
     public static float Mean( ArrayList<Float> temp1, int n)                // mean calculating parameters ( Array list . type= "Float" ; "Integer" )
    { 

        int sum = 0;                                               // sum to store values intialized to '0'
        
        for (int i = 0; i < n; i++)  

            sum +=temp1.get(i); 

        return (float)sum / (float)n; 

    } 

  

    // Function for calculating median 

    public static float Median(ArrayList<Float> temp2,int n)              // median calculating parameters ( Array List . type= "Float" ; "Integer" )

    { 

        // First we sort the array 

        Collections.sort(temp2);                                                                // check for even case & sorting array 

        if (n % 2 != 0) 

        return (float)temp2.get(n/2); 

      return (float)(temp2.get(n - 1) / 2) + temp2.get(n / 2) /(float)2;               // median calculation step getting values from ArrayList for index [n-1/2] & [n/2]

    } 

  

    // Calling Program or Driver Program

    public static void meanmedian()                                      // main function of mean and median where both functions are called with parameters passed into function

    { 
        Scanner S = new Scanner(System.in);
        float g;
        int n;
        ArrayList<Float> num;
        num = new ArrayList<Float>();
        
        System.out.println("Enter the elements:");
        System.out.println("Just Enter '0.0' to end the process of accepting numbers ");                // to determine end point of ArrayList type = "Float"
            while(1==1)
            {
                g=S.nextFloat();
                num.add(g);                       // Dynamically creating array and storing the element; input of type = "float" stored temporarily into var "g" type="Float"
                if(g==0.0f)
                {    
                    break;
                }
            }
            
        n=num.size();
        System.out.println("Mean = " +Mean(num, n));                        // calling function Mean() with parameters value specified by user
        
        System.out.println("Median = " +Median(num, n));                  //  calling fucntion Median() with parameter values specified by user 
    
    
    
    }           //end of mean&median function.
    
    
    public static void stringcase()                               // function to convert a string into either upper or lower & even invert case according to user input 
    {   
        String tmp;
        
        Scanner S = new Scanner(System.in);                       // intializing Scanner 
        
        ArrayList<String> inputstring;                                              // ArrayList of type="String" initialized 
        inputstring = new ArrayList<String>();                                              
        
        System.out.println("Hey there looks like you want to do some case conversion of strings");        // accepting String array from user ; using ArrayList
        System.out.println("Please first enter the strings to get started ");
        System.out.println("to stop entering strings please type oo to terminate the input");             // to stop accepting values type="String" from user
        
        while(1==1)
        {
            tmp=S.nextLine();                                          // Accepting values into variable tmp type="String"
            
            if("oo".equals(tmp) || "OO".equals(tmp))                              // Entering "oo" or "OO" to terminate the loop
            {
                System.out.println("Thanks");
                break;                                            // terminating the loop and closing or ending the ArrayList type= "String"
            }
            else
            {
                inputstring.add(tmp);                     // adding new entry to ArrayList type="String" until loop is terminated
            }
            
        }
        int l=inputstring.size(),i=0,choice=0;                           // "l" type= "Integer" initialized to value of size returned by inputstring.size(); type="Integer"
        while(i<=l)
        {
            
            System.out.println("Plase choose action for this element:"+inputstring.get(i));                  // confirming with user on particular action on string at index "i"

            System.out.println("Enter \n1. Convert to Upper Case \n2. Convert to Lower Case");
            choice=S.nextInt();                                                                   // accepting either 1 or 2 and accordingly doing the conversion
            switch(choice)
            {
                case 1:
                    System.out.println("Converting to upper case");
                    System.out.println("Upper Case:"+inputstring.get(i).toUpperCase());                  // converting the given string at ArrayList index to Uppercase()
                    break;                                                           // to terminate the case 1 
                case 2:
                    System.out.println("Converting to lower case");
                    System.out.println("Lower Case:"+inputstring.get(i).toLowerCase());                 // converting the given string at ArrayList index to Lowercase()
                    break;                                                          // to terminate the case 2 
            }                      

        }
        
        
    }                 // end of stringcase function 
    
    
    public static void stringsearch()                         // function to search a particular word in a string with added functionality of searching through multiple strings 
    {
        String tmp;
        
        Scanner in = new Scanner(System.in);                       // intializing Scanner 
        
        ArrayList<String> inputstring;                                              // ArrayList of type="String" initialized 
        inputstring = new ArrayList<String>();                                              
        
        System.out.println("Hey there looks like you want to do some case conversion of strings");        // accepting String array from user ; using ArrayList
        System.out.println("Please first enter the strings to get started ");
        System.out.println("to stop entering strings please type oo to terminate the input");             // to stop accepting values type="String" from user
        
        while(1==1)
        {
            tmp=in.nextLine();                                          // Accepting values into variable tmp type="String"
            
            if("oo".equals(tmp) || "OO".equals(tmp))                              // Entering "oo" or "OO" to terminate the ArrayList value accepting algorithm
            {
                System.out.println("Thanks");                                        
                break;                                  // on entering "oo" or "OO" terminating the loops and closing the ArrayList
            }
            else
            {
                inputstring.add(tmp);                         // adding new entry to ArrayList type="String" Dynamically 
            }
            
        }
        int i=0;
        while(i<inputstring.size())                // while loop with condition to terminate loop at value i=> inputstring.size(); returns length of string type= "Integer"
        {
         
            System.out.println("What word do you want to search for in string:"+inputstring.get(i));       // displaying string array one by one to confirm with user 
            tmp=in.nextLine();
            System.out.println("The Index is:"+inputstring.get(i).indexOf(tmp));                // searching algorithm that returns index type="Integer" if matching string sequence is found
            i++;                                                 // increasing value of "i" to cover all strings in ArrayList type="String"
        
        }
        
       }               // end of stringsearch function 
    
    
    public static void matrixmult()
    {
        //**************** pending hai yaar 
    }
    

}
            
    
    

