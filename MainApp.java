/*
Arithos omadas: 063
Arithmoi mhtrown : p3220127-p3220215-p3220304
*/


import java.util.*;

class mainApp{

    public static void main(String Args[]) throws InputMismatchException{

        try{

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
            int option;
            do{
                option = in.nextInt();
            }while(option<0 || option>9);

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

                        System.out.println("Select type: ");
                        System.out.println("1. Printed ");
                        System.out.println("2. Digital ");
                        System.out.println("3. Web ");
                        int codeType;
                        do{
                            codeType = in.nextInt();
                        }while(codeType<0 || codeType>3);

                        System.out.print("Give description: ");
                        String descriptionType = in.nextLine();
                        in.nextLine();

                        System.out.print("Give company AFM: ");
                        String afmComp = in.nextLine();

                        if (codeType == 1){
                            System.out.print("Price per word first page: ");
                            int ppwFirst = in.nextInt();
                            System.out.print("Price per word in between: ");
                            int ppwMid = in.nextInt();
                            System.out.print("Price per word last page: ");
                            int ppwLast = in.nextInt();
                            
                            PrintedType type = new PrintedType(codeType, descriptionType, afmComp, ppwFirst, ppwMid, ppwLast);
                            types.add(type);

                        }else if(codeType == 2){
                            System.out.print("Price per second morning: ");
                            int ppsMor = in.nextInt();
                            System.out.print("Price per second noon: ");
                            int ppsNoon = in.nextInt();
                            System.out.print("Price per second afternoon: ");
                            int ppsAfternoon = in.nextInt();
                            System.out.print("Price per second night: ");
                            int ppsNight = in.nextInt();
                        
                            DigitalType type = new DigitalType(codeType, descriptionType, afmComp, ppsMor, ppsNoon, ppsAfternoon, ppsNight);
                            types.add(type);

                        }else if(codeType == 3){
                            System.out.print("Price per day: ");
                            int ppd = in.nextInt();
                            System.out.print("Auto show cost: ");
                            int cost_auto = in.nextInt();
                            System.out.print("Price per extra page: ");
                            int extrap_cost = in.nextInt();
                            
                            WebType type = new WebType(codeType, descriptionType, afmComp, ppd, cost_auto,extrap_cost);
                            types.add(type);
                        }
                        break;

                    case 3:

                        System.out.println("Select type: ");
                        System.out.println("1. Printed ");
                        System.out.println("2. Digital ");
                        System.out.println("3. Web ");
                        do{
                            codeType = in.nextInt();
                        }while(codeType<0 || codeType>3);

                        System.out.print("Code of product: ");
                        int codeProd = in.nextInt();

                        System.out.print("Product description: ");
                        String description = in.nextLine();
                        in.nextLine();

                        System.out.print("Supplier AFM: ");
                        String afmSup = in.nextLine();

                        Product prod = new Product(codeProd,afmSup,description);
                        products.add(prod);

                        System.out.print("Duration: ");
                        int duration = in.nextInt();

                        System.out.print("Details: ");
                        String details = in.nextLine();
                        in.nextLine();

                        if(codeType == 1){
                            System.out.print("Number of words: ");
                            int words = in.nextInt();
                            in.nextLine();
                            System.out.println("Page position: " + "\nFirst\nMid\nLast");
                            String position;
                            do{
                                position = in.next();
                            }while(position != "First" && position !="Mid" && position != "Last");

                            PrintedAd advert = new PrintedAd(codeType, codeProd, duration, details, words, position);
                            adverts.add(advert);

                        }else if(codeType == 2){
                            System.out.print("Duration(sec): ");
                            int dur_sec = in.nextInt();
                            System.out.println("Timezone: " + "\nMornign\nNoon\nAfternoon\nNight");
                            String timezone;
                            do{
                                timezone = in.next();
                            }while(timezone != "Morning" && timezone != "Noon" && timezone != "Afternoon" && timezone != "Night");

                            DigitalAd advert = new DigitalAd(codeType, codeProd, duration, details, dur_sec, timezone);
                            adverts.add(advert);

                        }else if(codeType == 3){
                            System.out.println("Auto show ad: " + "\n1.Yes\n2.No");
                            int autoshow;
                            do{
                                autoshow = in.nextInt();
                            }while(autoshow !=0 && autoshow != 2);
                            if(autoshow==2){
                                autoshow = 0;
                            }
                            System.out.print("Extra pages: ");
                            int extrap = in.nextInt();
                            
                            WebAd advert = new WebAd(codeType, codeProd, duration, details, autoshow, extrap);
                            adverts.add(advert);

                        }
                        break;

                    case 4:

                        Iterator<Ad> it = adverts.iterator();
                        int i =1;
                        while(it.hasNext()){
                            System.out.print("Ad" + i + ":\n" + it.next().toString() + "\n");
                            i++;
                        }
                        break;

                    case 5:

                        Iterator<CommercialCompany> it2 = company.iterator();
                        i=1;
                        while(it2.hasNext()){
                            System.out.print(i + ". " + it2.next().getName() + "\n");
                            i++;
                        }

                        System.out.print("Select company: ");
                        int select;
                        do{
                            select = in.nextInt();
                        }while(select < 0 || select > company.size());
                        
                        String afm = company.get(select-1).getAfm();

                        i=1;
                        for(Ad advert: adverts){
                            for(AdType type : types){
                                if(advert.getTypeCode()==type.getCode()){
                                    if(type.getAfm().equals(afm)){
                                        System.out.println("Ad" + i + "\n" + advert.toString() + "\n");
                                        i++;
                                    }
                                }
                            }
                                
                        }

                        break;

                    case 6:
                        
                        i = 1;
                        for(CommercialCompany com: company){
                            System.out.println(i + ". " + com.getName());
                            i ++;
                        }

                        System.out.print("Select company: ");
                        do{
                            select = in.nextInt();
                        }while(select < 0 || select > company.size());

                        int total_cost = 0;

                        for (AdType type: types){
                            if(company.get(select-1).getAfm().equals(type.getAfm())){

                                for(Ad advert: adverts){
                                    if (advert.getTypeCode() == type.getCode()){

                                        total_cost += cost(type,advert); //methodos

                                    }
                                
                                }
                         

                            }
                        }      
                        System.out.println("Total cost = " + total_cost);
                        break;

                    case 7:

                        int pl;
                        ArrayList<Integer> ads = new ArrayList<Integer>();
                        HashMap<Integer, Product> adsInProds = new HashMap<Integer, Product>();

                        for(Product prods : products){
                            pl=0;
                            for(Ad ad : adverts){
                                if(ad.getProdCode() == prods.getCode()){
                                    for(AdType type : types){
                                        if(ad.getTypeCode() == type.getCode()){
                                            pl ++;
                                        }
                                    }

                                }
                            }

                        ads.add(pl);
                        adsInProds.put(pl, prods);

                        }
                        
                        ads.sort(Comparator.reverseOrder());
                        i=0;
                        for(int k : ads){
                            System.out.println(adsInProds.get(k));
                        }
                        break;

                    case 8:

                        pl=0;
                        i = 1;
                        for(Product prods: products){
                            System.out.println(i + ". " + prods.getCode());
                            i ++;
                        }

                        System.out.print("Select product: ");
                        do{
                            select = in.nextInt();
                        }while(select < 0 || select > products.size());

                        for(Ad ad : adverts){
                            if(ad.getProdCode() == products.get(select-1).getCode()){
                                for(AdType type : types){
                                    if(ad.getTypeCode() == type.getCode()){

                                        System.out.println(ad.toString() + "\t" + cost(type,ad));
                                    }
                                }

                            }
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
                do{
                    option = in.nextInt();
                }while(option<0 || option>9);

            }
        
        }catch(InputMismatchException e){
        }



    }

    public static int cost(AdType type, Ad advert){

        if(type  instanceof PrintedType){
            PrintedAd ad = (PrintedAd)advert;
            PrintedType typ = (PrintedType)type;
            return typ.cost(ad.getWords(), ad.getPosition(), ad.getDur());

        }else if(type  instanceof DigitalType){
            DigitalAd ad = (DigitalAd)advert;
            DigitalType typ = (DigitalType)type;
            return typ.cost(ad.getDursec(), ad.getTimezone(), ad.getDur());

        }else{
            WebAd ad = (WebAd)advert;
            WebType typ = (WebType)type;
            return typ.cost(ad.getAuto(), ad.getExtra(), ad.getDur());
        }

    }
}
