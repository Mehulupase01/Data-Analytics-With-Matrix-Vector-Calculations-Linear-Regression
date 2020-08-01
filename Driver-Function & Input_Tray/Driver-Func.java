import java.util.Scanner;
public class MainClass 
{

    public static void main(String[] args)
    {
        int choice;
        MainFunc mn = new MainFunc();
        Scanner in = new Scanner(System.in);
        
        System.out.println("*******Welcome To Data Analytics System*******\n");
        System.out.println("Please Choose what you would like to do:\n");
        System.out.println("1.Seach Array\n2.Sort Array\n3.Addition Of Matrix\n4.Transpose of matrix\n5.Mean Median and mode");
        
        choice = in.nextInt();
        switch(choice)
                {
            case 1:
                mn.searcharray();
                break;
            case 2:
                mn.sortarray();
                break;
            case 3:
                mn.addmatrix();
                break;
            case 4:
                mn.transposematrix();
                break;
            case 5:
                mn.meanmedian();
                break;
            default:
                System.out.println("Please Choose the correct option!!");
                break;
                }
        
        }
    }
