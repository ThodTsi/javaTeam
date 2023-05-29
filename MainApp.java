import java.util.*;
class mainApp{


    public static void main(String Args[]){

    Scanner in = new Scanner(System.in);
    ArrayList<CommercialCompany> company = new ArrayList<CommercialCompany>();
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<AdType> types = new ArrayList<AdType>();
    ArrayList<Ad> adverts = new ArrayList<Ad>();
    System.out.println("1. Insert new company");
    System.out.println("2. Insert new ad type");
    System.out.println("3. Insert new ad");
    System.out.println("4. Show ads");
    System.out.println("5. Show company's ads");
    System.out.println("6. Calculate company's cost");
    System.out.println("7. Number of products' ads");
    System.out.println("8. Calculate cost of a products' ad");
    System.out.println("9. Show ad cost per product");
    int option = in.nextInt();
    while(option!=0){
        switch(option){
            case 1:
                System.out.print("Give afm: ");
                in.nextLine();
                String afmCom = in.nextLine();
                System.out.print("Give name: ");
                String nameCom = in.nextLine();
                CommercialCompany comp = new CommercialCompany(afmCom,nameCom);
                company.add(comp);
                break;
            case 2:
                System.out.print("Give code: ");
                int codeType = in.nextInt();
                System.out.print("Give description: ");
                String descriptionType = in.nextLine();
                in.nextLine();
                System.out.println("Select type: ");
                System.out.println("1. Printed ");
                System.out.println("2. Digital ");
                System.out.println("3. Web ");
                int afmType = in.nextInt();
                if (afmType == 1){
                    System.out.print("Price per word first page: ");
                    int ppwFirst = in.nextInt();
                    System.out.print("Price per word in between: ");
                    int ppwMid = in.nextInt();
                    System.out.print("Price per word last page: ");
                    int ppwLast = in.nextInt();
                    PrintedType type = new PrintedType(codeType, descriptionType, afmType, ppwFirst, ppwMid, ppwLast);
                    types.add(type);
                }else if(afmType == 2){
                    System.out.print("Price per second morning: ");
                    int ppsMor = in.nextInt();
                    System.out.print("Price per second noon: ");
                    int ppsNoon = in.nextInt();
                    System.out.print("Price per second afternoon: ");
                    int ppsAfternoon = in.nextInt();
                    System.out.print("Price per second night: ");
                    int ppsNight = in.nextInt();
                    DigitalType type = new DigitalType(codeType, descriptionType, afmType, ppsMor, ppsNoon, ppsAfternoon, ppsNight);
                    types.add(type);
                }else if(afmType == 3){
                    System.out.print("Price per day: ");
                    int ppd = in.nextInt();
                    System.out.print("Auto show cost: ");
                    int cost_auto = in.nextInt();
                    System.out.print("Price per extra page: ");
                    int extrap_cost = in.nextInt();
                    WebType type = new WebType(codeType, descriptionType, afmType, ppd, cost_auto,extrap_cost);
                    types.add(type);
                }

                
                break;
            case 3:
                System.out.println("Select type: ");
                System.out.println("1. Printed ");
                System.out.println("2. Digital ");
                System.out.println("3. Web ");
                codeType = in.nextInt();
                System.out.print("Code of product: ");
                int codeProd = in.nextInt();
                System.out.print("Product description: ");
                String description = in.nextLine();
                in.nextLine();
                System.out.print("Supplier AFM: ");
                String afmProd = in.nextLine();
                Product prod = new Product(codeProd,afmProd,description);
                products.add(prod);
                System.out.print("Duration: ");
                int duration = in.nextInt();
                in.nextLine();
                System.out.print("Details: ");
                String details = in.nextLine();
                if(codeType == 1){
                    System.out.print("Number of words: ");
                    int words = in.nextInt();
                    in.nextLine();
                    System.out.print("Page position: ");
                    String position = in.nextLine();
                    PrintedAd advert = new PrintedAd(codeType, codeProd, duration, details, words, position);
                    adverts.add(advert);
                }else if(codeType == 2){
                    System.out.print("Duration(sec): ");
                    int dur_sec = in.nextInt();
                    System.out.print("Timezone: ");
                    int timezone = in.nextInt();
                    DigitalAd advert = new DigitalAd(codeType, codeProd, duration, details, dur_sec, timezone);
                    adverts.add(advert);
                }else if(codeType == 3){
                    System.out.print("Auto show ad: ");
                    int autoshow = in.nextInt();
                    System.out.print("Extra pages: ");
                    int extrap = in.nextInt();
                    WebAd advert = new WebAd(codeType, codeProd, duration, details, autoshow, extrap);
                    adverts.add(advert);
                }


                break;


            case 4:
                Iterator<Ad> it = adverts.iterator();
                while(it.hasNext()){
                    System.out.print(it.next().toString());
                }
                break;

            case 5:
                int i = 1;
                for(CommercialCompany com: company){
                    System.out.println(i + ". " + com.getName());
                    i ++;
                }
                System.out.print("Select company: ");
                int select = in.nextInt();
                String name = company.indexOf(select-1).getName();
                if (select>0 && select<=company.size()){

                }
                break;
                
                
















            default:
                break;

        }
        System.out.println("1. Insert new company");
        System.out.println("2. Insert new ad type");
        System.out.println("3. Insert new ad");
        System.out.println("4. Show ads");
        System.out.println("5. Show company's ads");
        System.out.println("6. Calculate company's cost");
        System.out.println("7. Number of products' ads");
        System.out.println("8. Calculate cost of a products' ad");
        System.out.println("9. Show ad cost per product");
        option = in.nextInt();
        
    }










    }
}
