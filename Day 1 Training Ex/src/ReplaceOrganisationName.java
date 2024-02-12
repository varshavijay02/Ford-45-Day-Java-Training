import java.util.Scanner;

public class ReplaceOrganisationName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String document = sc.nextLine();
        System.out.println("Enter the old name of the company");
        String oldName = sc.nextLine();
        System.out.println("Enter the new name of the company");
        String newName = sc.nextLine();
        System.out.println();

        System.out.println("The content of the modified document is");
        System.out.println(document.replace(oldName,newName));
    }
}

//This program is to illustrate the use of the method replace() defined in the string API.
//Two companies enter into a Marketing Agreement and they prepare an Agreement Draft. After that one of the companies changes its name.
//The name changes need to be made in the Agreement Draft as well. Write a program to perform the name changes in the agreement draft.

//Input and Output Format:
//Refer sample input and output for formatting specifications.
//All text in bold corresponds to input and the rest corresponds to output.

//Sample Input and Output:
//Enter the content of the document
//ITT is a private organisation. ITT is a product based company. DBox is a ITT product
//Enter the old name of the company
//        ITT
//Enter the new name of the company
//TTT
//The content of the modified document is
//TTT is a private organisation. TTT is a product based company. DBox is a TTT product

