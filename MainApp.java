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

            company.add(new CommercialCompany("111","Company1"));
            company.add(new CommercialCompany("222","Company2"));
            company.add(new CommercialCompany("333","Company3"));
            company.add(new CommercialCompany("444","Company4"));

            products.add(new Product(10,"tileorasi","entona xrwmata"));
            products.add(new Product(20,"fournos","mikrhs diastashs"));
            products.add(new Product(30,"kanapes","kanapes-krebati"));
            products.add(new Product(40,"laptop","dynatotha afhs"));
            products.add(new Product(50,"kaltses","poly zestes"));
            products.add(new Product(60,"thlefwno","4 kameres"));

            types.add(new PrintedType(100,"efhmerida prwinh","111",2,2,2));
            types.add(new PrintedType(101,"periodiko","222",4,4,4));
            types.add(new PrintedType(102,"efhmerida bradinh","333",6,6,6));
            types.add(new PrintedType(103,"best seller periodiko","444",8,8,8));

            types.add(new DigitalType(104,"radiofwnikos stathmos boreias elladas","111",10,10,10,10));
            types.add(new DigitalType(105,"bradinh thleoptikh ekpomph","222",15,15,15,15));
            types.add(new DigitalType(106,"prwinh thleoptikh ekpomph","333",20,20,20,20));
            types.add(new DigitalType(107,"radiofwnikos stathmos attikhs","444",25,25,25,25));

            types.add(new WebType(108,"diadiktyakh efhmerida","111",0,2,4));
            types.add(new WebType(109,"facebook","222",1,4,5));
            types.add(new WebType(110,"instagram","333",1,3,6));
            types.add(new WebType(111,"tik tok","444",0,6,7));

            adverts.add(new PrintedAd(101,20,3,"aristera katw",500,"First"));
            adverts.add(new PrintedAd(100,20,2,"aristera panw",550,"Mid"));
            adverts.add(new PrintedAd(103,30,4,"xwris xrwma",600,"Last"));
            adverts.add(new PrintedAd(102,10,5,"sto kentro",650,"First"));

            adverts.add(new DigitalAd(106,40,1,"prin jekinhsei h ekpomph",50,"Morning"));
            adverts.add(new DigitalAd(105,50,2,"molis teleiwsei h ekpomph",52,"Noon"));
            adverts.add(new DigitalAd(104,60,3,"molis teleiwsei to tragoydi",54,"Afternoon"));
            adverts.add(new DigitalAd(107,10,4,"prin arxisei to tragoydi",56,"Night"));

            adverts.add(new WebAd(111,60,1,"meta th 1 to brady",1,1));
            adverts.add(new WebAd(108,50,1,"terma panw",0,2));
            adverts.add(new WebAd(109,30,1,"to meshmeri",1,3));
            adverts.add(new WebAd(110,40,1,"ana 50 story",0,4));

            
            int option = Menu();

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
                        int Type;
                        do{
                            Type = in.nextInt();
                        }while(Type<0 || Type>3);

                        System.out.print("Give code: ");
                        int codeType = in.nextInt();

                        System.out.print("Give description: ");
                        in.nextLine();
                        String descriptionType = in.nextLine();

                        System.out.print("Give company AFM: ");
                        String afmComp = in.nextLine();

                        if (Type == 1){
                            System.out.print("Price per word first page: ");
                            int ppwFirst = in.nextInt();
                            System.out.print("Price per word in between: ");
                            int ppwMid = in.nextInt();
                            System.out.print("Price per word last page: ");
                            int ppwLast = in.nextInt();
                            
                            PrintedType type = new PrintedType(codeType, descriptionType, afmComp, ppwFirst, ppwMid, ppwLast);
                            types.add(type);

                        }else if(Type == 2){
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

                        }else if(Type == 3){
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
                            Type = in.nextInt();
                        }while(Type<0 || Type>3);

                        System.out.print("Code of type: ");
                        codeType = in.nextInt();

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
                        in.nextLine();
                        String details = in.nextLine();

                        if(Type == 1){
                            System.out.print("Number of words: ");
                            int words = in.nextInt();
                            in.nextLine();
                            System.out.println("Page position: " + "\nFirst\nMid\nLast");
                            String position;
                            //do{
                                position = in.next();
                            //}while(position != "First" && position !="Mid" && position != "Last");

                            PrintedAd advert = new PrintedAd(codeType, codeProd, duration, details, words, position);
                            adverts.add(advert);

                        }else if(Type == 2){
                            System.out.print("Duration(sec): ");
                            int dur_sec = in.nextInt();
                            System.out.println("Timezone: " + "\nMornign\nNoon\nAfternoon\nNight");
                            String timezone;
                            //do{
                                timezone = in.next();
                            //}while(timezone != "Morning" && timezone != "Noon" && timezone != "Afternoon" && timezone != "Night");

                            DigitalAd advert = new DigitalAd(codeType, codeProd, duration, details, dur_sec, timezone);
                            adverts.add(advert);

                        }else if(Type == 3){
                            System.out.println("Auto show ad: " + "\n1.Yes\n2.No");
                            int autoshow;
                           // do{
                                autoshow = in.nextInt();
                            //}while(autoshow !=0 && autoshow != 2);
                            
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
                            System.out.println("Ad" + i + ":\t" + it.next().toString());
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
                                        System.out.println("Ad" + i + "\t" + advert.toString());
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
                        
                       /* ads.sort(Comparator.reverseOrder());
                        ArrayList<Product> prodsInOrder = new ArrayList<Product>();

                        for(int k : ads){
                            while( adsInProds.containsKey(k)){

                                prodsInOrder.add(adsInProds.get(k));
                                adsInProds.remove(k, adsInProds.get(k));
                            }
                        }*/
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
                        i=0;

                        for(Ad ad : adverts){
                            if(ad.getProdCode() == products.get(select-1).getCode()){
                                for(AdType type : types){
                                    if(ad.getTypeCode() == type.getCode()){

                                        i++;
                                        System.out.println("Cost of Ad" + i + ": " + cost(type,ad));
                                        pl += cost(type, ad);
                                    }
                                }

                            }
                        }

                        System.out.println("Total cost is:\t" + pl);
                        break;
        
                    default:

                        ArrayList<Integer> costs = new ArrayList<Integer>();
                        HashMap<Integer, Product> prodCost = new HashMap<Integer, Product>();

                        for(Product prods : products){
                            total_cost = 0;

                            for (Ad advert: adverts){

                                if(advert.getProdCode()==prods.getCode()){

                                    for(AdType type: types){

                                        if (type.getCode()==advert.getTypeCode()){

                                            total_cost += cost(type,advert); //methodos

                                        }
                                    
                                    }
                            
                                }
                            } 
                            costs.add(total_cost);
                            prodCost.put(total_cost, prods);  
                        }   

                        costs.sort(Comparator.reverseOrder());
                        i=0;
                        for(int k : costs){
                            System.out.println(prodCost.get(k).toString() + "\tCost of ads:\t" + k);
                        }                        
                        break;

                }

                option = Menu();          

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

    public static int Menu(){

        Scanner sc = new Scanner(System.in);

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
            option = sc.nextInt();
        }while(option<0 || option>9);

        return option;

    }

}
