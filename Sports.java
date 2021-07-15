import java.util.*;
import java.io.*;
//Sarthak shah
//10 C


//SATURDAY BATCH
public class Sports
{
    int ch=0;char chh=' ';int price=0;int kk=0;
    int mem=0;int count =25;int start=0;int cart=0;
    public Scanner sc=new Scanner(System.in);
    
    int s_id[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,0,0,0,0,0};
    String s_type[]={"cri","cri","cri","cri","cri","foo","foo","foo","foo","foo",
            "bas","bas","bas","bas","bas","vol","vol","vol","vol","vol","tab","tab","tab",
            "tab","tab","","","","",""};

    String s_name[]={"bat          ","ball         ","stumps       ","pads         ","kit          ","football     ","jersey       ","shoes        ",
            "socks        ","shinpads     ","basketball   ","hoop         ","net          ","shorts       ","jersey set   "
        ,"volleyball   ","big net      ","pump         ","stands       ","trainers     ","full set TT  ","ball set     ","rackets      ",
            "table and net","spare net    ","","","","",""};
            
    int s_price[]={990,100,250,100,900,750,500,900,200,100,700,500,200,150,350,400,500,
            100,350,500,900,100,200,550,250,0,0,0,0,0};

    int s_qty[]={10,100,25,20,50,20,70,50,40,40,60,40,60,70,70,10,30,30,70,100,20,70,90,80,70,0,0,0,0,0};

    char s_remove[]={'n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n','n'
        ,'n','n','n','n','n'};

    String basket_name[]={"","","","","","","","","","","","","","","","","","","",""};    
    int basket_price[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int basket_qty[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    //transaction file

    int c_id[]={1,2,3,0,0,0,0,0,0,0};
    String c_type[]={"cri","cri","cri","","","","","","",""};

    String c_name[]={"bat","ball","stumps","","","","","","",""};

    int c_qty[]={1,2,3,0,0,0,0,0,0,0};
    //transaction ends

    public static void main()
    {

        Sports ob=new Sports();
        System.out.println("w       w      w  ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("w       w      w  ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("w       w      w  ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("w       w      w  ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("wwwwwwwww      w    ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("w       w      w       ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("w       w      w      ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("w       w      w      ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("w       w      w      ");
        
         System.out.println("\f");
        System.out.println("########################################################");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("#           ###          ###     #####     ####     ####  ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("#   ###########   ####   ## ###### ### #### ##### ######  ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("###   #########         # ######## ### ##  ###### #### ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("######   ######   ####### ######## ###  ######### ###");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("########  #####   ####### ######## ###  # ####### ###");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("######   ######   ####### ####### #### ### ###### ###  ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("        #######   #######        ##### #### ##### ###");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("###################################### ##### #### ###");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        
        do
        {
            System.out.println("\f");
            char ch;
            System.out.println("+++++LOADING");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("\f");
            System.out.println(">>>>¦ LOADING  ");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("\f");
            System.out.println("<<<<<LOADING");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            System.out.println("\f");
            System.out.println("    LOADED ");
            
            System.out.println("press 1 to display all the productsÂ©");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 2 to display the products CATEGORY WISE");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 3 to BUY products");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 4 to add products");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 5 to modify products");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 6 to delete products");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 7 to print bill");
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 8 to exit");

            ch=ob.sc.next().charAt(0);

            while(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'&&ch!='7'&&ch!='8')
            {
                System.out.println("\f");
                for(double j=-99999.999;j<=199999.999;j=j+0.01);
                System.out.println("RE ENTER");
                ch=ob.sc.next().charAt(0);   
            }            
            
            
            switch(ch)
            {
                case '1':
                {
                    ob.display();
                    break;

                }
                
                case '2':
                {
                    ob.displaycategory();
                    break;

                }
                
                case '3':
                {
                    ob.buy();
                    break;

                }
                
                case '4':
                {
                    ob.add();
                    break;

                }
                
                case '5':
                {
                    System.out.println("THANK YOU FOR VISITING");
                    System.out.println("PLEASE DO ");
                    break;

                }
                
                case '6':
                {
                    ob.delete();
                    break;

                }
                case '7':
                {
                    ob.printbill();
                    break;

                }
                case '8':
                {
                    System.out.print("THANK");
                    
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    System.out.print("YOU");
                    
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    System.out.print("FOR");
                    
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    System.out.print("VISITING");
                    
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    System.out.println("US");
                    
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    for(double j=-99999.999;j<=199999.999;j=j+0.01);
                    break;
                    
                }
            }
        }while(ob.ch!='8');
    }

    void display()
    {
        System.out.println("\f");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);   
        System.out.println("ID      TYPE        NAME        PRICE          QTY");
        for(int i=0;i<s_id.length;i++)
        {

            if(s_qty[i]!=0&&s_id[i]<10)
            {
                System.out.println(s_id[i]+"  |   "+s_type[i] +"  |    "+ s_name[i]+"    |     "+s_price[i]+"     |      "+s_qty[i]);   
            }
            
            if(s_qty[i]!=0&&s_id[i]>=10)
            {
                System.out.println(s_id[i]+"  |  "+s_type[i] +"  |    "+ s_name[i]+"    |     "+s_price[i]+"     |      "+s_qty[i]);   
            }
            
            if(s_qty[i]==0)
                continue;
        }
        System.out.println("WAIT OR PRESS ANY KEY TO EXIT");
        char contd=sc.next().charAt(0);
    }
    

    void displaycategory()
    {
        char ch=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("\f");    

        do
        {
            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            System.out.println("press 1 to display Cricket products");

            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            System.out.println("press 2 to display Football products");

            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            System.out.println("press 3 to display Basketball products");

            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            System.out.println("press 4 to display volleyball products");

            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            System.out.println("press 5 to display table tennis products");  

            for(double j=-99999.999;j<=199999.999;j=j+0.01);
            
            System.out.println("press 6 to EXIT");  
            System.out.println("");  
            System.out.println("ENTER"); 
            ch=sc.next().charAt(0);

            while(ch!='1'&&ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6')
            {
                System.out.println("\f");

                for(double j=-99999.999;j<=199999.999;j=j+0.01);

                System.out.println("RE ENTER");
                ch=sc.next().charAt(0);   
            }

            switch(ch)
            {
                case '1':
                {

                    System.out.println("displaying Cricket products");

                    for(int i=0;i<5;i++)
                    {
                        System.out.println(s_id[i]+" "+s_type[i] +" "+ s_name[i]+" "+s_price[i]+" "+s_qty[i]);  
                    }

                    System.out.println("wait or press any key to continue");
                    String temp=sc.nextLine();

                    break;    
                }
                case '2':
                {

                    
                    System.out.println("displaying FOOTBALL products");

                    for(int i=5;i<10;i++)
                    {
                        System.out.println(s_id[i]+" "+s_type[i] +" "+ s_name[i]+" "+s_price[i]+" "+s_qty[i]);  
                    }

                    System.out.println("wait or press any key to continue");
                    String temp=sc.nextLine();

                    break;   
                }
                case '3':
                {

                    System.out.println("displaying BASKETBALL products");

                    for(int i=10;i<15;i++)
                    {
                        System.out.println(s_id[i]+" "+s_type[i] +" "+ s_name[i]+" "+s_price[i]+" "+s_qty[i]);  
                    }
                    System.out.println("wait or press any key to continue");
                    String temp=sc.nextLine();
                    break;   
                }
                case '4':
                {
                    System.out.println("displaying VOLLEYBALL products");
                    for(int i=15;i<20;i++)
                    {
                        System.out.println(s_id[i]+" "+s_type[i] +" "+ s_name[i]+" "+s_price[i]+" "+s_qty[i]);  
                    }
                    System.out.println("wait or press any key to continue");
                    String temp=sc.nextLine();
                    break;   
                }
                case '5':
                {
                    System.out.println("displaying TABlE TENNIS products");
                    for(int i=20;i<25;i++)
                    {
                        System.out.println(s_id[i]+" "+s_type[i] +" "+ s_name[i]+" "+s_price[i]+" "+s_qty[i]);  
                    }
                    System.out.println("wait or press any key to continue");
                    String temp=sc.nextLine();
                    break;   
                }
                case '6':
                {
                    System.out.println("EXIT");
                    break;   
                }
            }
        }while(ch!='6');
    }

    void buy()
    {
        mem++;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ID      TYPE        NAME        PRICE          QTY");
        
        for(int i=0;i<s_id.length;i++)
        {
            if(s_qty[i]!=0)
            {
                System.out.println(s_id[i]+"    "+s_type[i] +"      "+ s_name[i]+"         "+s_price[i]+"           "+s_qty[i]);   
            }
            if(s_qty[i]<=0)
                continue;
        }
        while(chh!='e')
        {
            System.out.println("ENTER THE ID");
            ch=sc.nextInt();
            int len=s_id.length;
            cart++;
            basket_name[ch-1]=s_name[ch-1];
            System.out.println("ENTER THE QUANTITY");
            int amt=0;
            amt=sc.nextInt();
            basket_qty[ch-1]=amt;s_qty[ch-1]=s_qty[ch-1]-amt;
            basket_price[cart-1]=s_price[s_id[ch-1]];
            for(int i=0;i<s_id.length;i++)
            {
                if(s_qty[i]!=0&&s_qty[i]>0)
                {
                    System.out.println(s_id[i]+"    "+s_type[i] +"      "+ s_name[i]+"         "+s_price[i]+"           "+s_qty[i]); 
                }
            }
            System.out.println("YOU PURCHASED "+cart+" items");

            price =price+s_price[ch-1]*amt;   
            System.out.println(" NAME of item  "+s_name[ch-1]+"     TOTAL PRICE IS "+price);

            System.out.println("PRESS \" e \" to exit");
            chh=sc.next().charAt(0);  
            kk++;
        }
    }

    void add()
    {
        Scanner sc=new Scanner( System.in);char exit=' ';String temp="";
        do
        {
            count++;start++;
            s_id[count]=25+start;
            System.out.println("NEW ID "+s_id[(count)]);
            System.out.println("enter the category of the product you want add");
            System.out.println("ENTER : cri, foo, bas, vol, tab");
            System.out.println("enter here");
            s_type[count]=sc.nextLine();

            System.out.println("ENTER PRODUCT NAME");
            String tempname=sc.nextLine();
            if(tempname.length()<13)
            {
                for(int i=0;i<=13-tempname.length();i++)
                {
                    temp=temp+" ";   
                }
                s_name[count]=tempname+temp;
            }
            System.out.println("ENTER PRODUCT PRICE");
            s_price[count]=sc.nextInt();
            System.out.println("ENTER QUANTITY");
            s_qty[count]=sc.nextInt();
            
            System.out.println("press e to exit");
            exit=sc.next().charAt(0);
        }while(exit!='e');
    }

    void modify()
    {
        Scanner sc=new Scanner(System.in);char ccch;
        do
        {
            System.out.println("\f");   
            
            for(int i=0;i<s_id.length;i++)
            {
                if(s_qty[i]!=0&&s_qty[i]>0)
                {
                    System.out.println(s_id[i]+"    "+s_type[i] +"      "+ s_name[i]+"         "+s_price[i]+"           "+s_qty[i]); 
                }
            }
            System.out.println("  YOU CAN MODIFY THE AVAILABLE PRODUCTS");  
            System.out.println("  ENTER THE PRODUCT ID FROM ABOVE WHICH YOU WANT TO MODIFY"); 
            int mod_id=sc.nextInt();
            System.out.println("\f");
            
            System.out.println("NAME OF PRODUCT IS "+s_name[mod_id-1]); 
            System.out.println("press 1 to modify the "+s_name[mod_id-1]+" quantity");
            System.out.println("press 2 to modify the "+s_name[mod_id-1]+" price");
            System.out.print("ENTER HERE ");
            
            char ch=sc.next().charAt(0);
            
            System.out.println(" ");
            while(ch!='1'&&ch!='2')
            {
                System.out.println("wrong input");
                System.out.println("RE ENTER 1,2,3,4 only");
                ch=sc.next().charAt(0);   
                
            }
            System.out.println("\f");
            switch(ch)
            {
                case '1':
                
                {
                    System.out.println("NAME OF PRODUCT IS "+s_name[mod_id-1]);
                    System.out.println("ENTER A NEW QUANTITY FOR THE PRODUCT");
                    s_qty[mod_id-1]=0;
                    s_qty[mod_id-1]=sc.nextInt();
                    break;
                }
                case '2':
                
                {
                    System.out.println("NAME OF PRODUCT IS "+s_name[mod_id-1]);
                    System.out.println("ENTER A NEW PRICE FOR THE PRODUCT");
                    s_price[mod_id-1]=0;
                    s_price[mod_id-1]=sc.nextInt();
                    break;
                }
            }
            System.out.println("Press e to exit any other key to to continue");
            
            ccch=sc.next().charAt(0);
        }while(ccch!='e');
    }

    void delete()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("\f");
        for(int i=0;i<s_id.length;i++)
        {
            
            if(s_qty[i]!=0&&s_qty[i]>0)
            {
                System.out.println(s_id[i]+"    "+s_type[i] +"      "+ s_name[i]+"         "+s_price[i]+"           "+s_qty[i]); 
            }
            
        }
        System.out.println("enter the id you want to delete");
        int temp_id=sc.nextInt();
        
        s_id[temp_id-1]=0;
        s_qty[temp_id-1]=0;
        s_price[temp_id-1]=0;
        s_name[temp_id-1]="";
    }

    void printbill()
    {
        Scanner sc=new Scanner(System.in);   
        System.out.println("NAME    "+" "+" PRICE     "+" "+"   QTY  "+"      total amount");
        for(int i=0;i<20;i++)
        {
            if(basket_name[i]!="")
            {
                System.out.println(basket_name[i]+" | "+basket_price[i]+"  |   "+basket_qty[i]+"   |   "+basket_price[i]*basket_qty[i]);
                
                for(double j=-99999.999;j<=199999.999;j=j+0.01);
                for(double j=-99999.999;j<=199999.999;j=j+0.01);
                for(double j=-99999.999;j<=199999.999;j=j+0.01);
            }

        }
        System.out.println("YOU HAVE TO PAY "+price+" rupees and tax");
        
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.println("TAX RATE IS 4 %");
        
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        double finalbill=price*(4/100.0)+price;
        
        System.out.println("HENCE YOU HAVE TO PAY RUPEES  "+finalbill);
        String temp="";
        
        System.out.print("THANK YOU ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.print(" FOR ");
        
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        System.out.print(" VISITING ");
        
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        
        System.out.println(" HOPE YOU SHOP HERE AGAIN ");
        for(double j=-99999.999;j<=199999.999;j=j+0.01);
        
        System.out.println("PRESS ANY KEY TO EXIT");
        temp=sc.nextLine(); 
    }

}

