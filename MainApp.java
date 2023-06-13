/*
Arithos omadas: 063
Arithmoi mhtrwwn : p3220127-p3220215-p3220304
*/


import java.io.*;
import java.util.*;
import java.io.*;
class mainApp{

    public static void main(String Args[]) throws InputMismatchException{

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

        Scanner in = new Scanner(System.in);
        int option = Choice(1);

        try{

            while(option!=0){

                switch(option){

                    case 1:

                        System.out.print("Give afm: ");
                        String afmCom = in.nextLine();
                        
                        System.out.print("Give name: ");
                        String nameCom = in.nextLine();

                        CommercialCompany comp = new CommercialCompany(afmCom,nameCom);
                        company.add(comp);
                        WriteCommercialCompany(company, "company.txt");
                        break;

                    case 2:

                        int Type = Choice(2);

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
                        in.nextLine();
                        break;

                    case 3:

                        Type = Choice(2);

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
                            System.out.println("Page position: " + "\nFirst\nMid\nLast");
                            String position = in.nextLine();
                            if((!position.equals("First")) && (!position.equals("Mid")) && (!position.equals("Last"))){
                                while((!position.equals("First")) && (!position.equals("Mid")) && (!position.equals("Last"))){
                                    System.out.print("Give right position: ");
                                    position = in.nextLine();
                                }
                            }

                            PrintedAd advert = new PrintedAd(codeType, codeProd, duration, details, words, position);
                            adverts.add(advert);

                        }else if(Type == 2){
                            System.out.print("Duration(sec): ");
                            int dur_sec = in.nextInt();
                            System.out.println("Timezone: " + "\nMornign\nNoon\nAfternoon\nNight");
                            String timezone = in.nextLine();
                            if((!timezone.equals("Morning")) && (!timezone.equals("Noon")) && (!timezone.equals("Afternoon")) && (!timezone.equals("Night"))){
                                while((!timezone.equals("Morning")) && (!timezone.equals("Noon")) && (!timezone.equals("Afternoon")) && (!timezone.equals("Night"))){
                                    System.out.print("Give right timezone: ");
                                    timezone = in.nextLine();
                                }
                            }

                            DigitalAd advert = new DigitalAd(codeType, codeProd, duration, details, dur_sec, timezone);
                            adverts.add(advert);

                        }else if(Type == 3){
                            System.out.println("Auto show ad: " + "\n1.Yes\n2.No");
                            int autoshow = in.nextInt();
                            while(autoshow !=1 && autoshow != 0){
                                System.out.print("Give 1 for 'Yes' or 2 for 'No': ");
                                autoshow = in.nextInt();
                            }
                            
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
                        
                        String afm = company.get(CompanyChoice(company)-1).getAfm(); //CompanyChoide = methodos

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
                        
                        int select = CompanyChoice(company); //methodos
                        int total_cost = 0;
                        i = 1;

                        for (AdType type: types){
                            if(company.get(select-1).getAfm().equals(type.getAfm())){

                                for(Ad advert: adverts){
                                    if (advert.getTypeCode() == type.getCode()){

                                        System.out.println("Cost of Ad" + i + ": " + Cost(type,advert)); //gia oles tis diafhmiseis
                                        total_cost += Cost(type,advert); //methodos
                                        i++;

                                    }
                                
                                }
                         

                            }
                        }      
                        System.out.println("Total cost = " + total_cost);
                        break;

                    case 7:
                        ProductsAdsAndCosts(products, adverts, types, 1);
                        break;

                    case 8:

                        int pl;
                        i=1;
                        for(Product prods: products){
                            System.out.println(i + ". " + prods.getCode());
                            i ++;
                        }

                        System.out.print("Select product: ");
                        select = in.nextInt();
                        while(select < 0 || select > products.size()){
                            System.out.print("Give right product number: ");
                            select = in.nextInt();
                        }
                        
                        pl=0;
                        i=1;

                        for(Ad ad : adverts){
                            if(ad.getProdCode() == products.get(select-1).getCode()){
                                for(AdType type : types){
                                    if(ad.getTypeCode() == type.getCode()){
                                        
                                        i++;
                                        System.out.println("Cost of Ad" + i + ": " + Cost(type,ad)); //gia oles tis daifhmiseis
                                        pl += Cost(type, ad);
                                    }
                                }

                            }
                        }

                        System.out.println("Total cost is:\t" + pl); //synolo apo oles tis diafhmiseis
                        break;
        
                    case 9:

                        ProductsAdsAndCosts(products, adverts, types, 2);
                        break;

                }

                option = Choice(1);          

            }

        //-------------------------------------part2----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            WriteCommercialCompany(company, "C:/Users/30698/Desktop/javateam2/company.txt");
            WriteProducts(products, "C:/Users/30698/Desktop/javateam2/product.txt");
            WriteTypes(types, "C:/Users/30698/Desktop/javateam2/types.txt");
            WriteAds(adverts, "C:/Users/30698/Desktop/javateam2/adverts.txt");
        
        }catch(InputMismatchException e){
            System.out.print("Give an integer");
        }catch(ClassCastException e2){
            
        }

    }

    public static int Cost(AdType type, Ad advert){

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

    public static int Choice(int purpose){

        Scanner sc = new Scanner(System.in);

        if(purpose == 1){

            System.out.println("1. Insert new company");
            System.out.println("2. Insert new ad type");
            System.out.println("3. Insert new ad");
            System.out.println("4. Show ads");
            System.out.println("5. Show company's ads");
            System.out.println("6. Calculate company's cost");
            System.out.println("7. Number of products' ads");
            System.out.println("8. Calculate cost of a products' ad");
            System.out.println("9. Show ad cost per product");
            System.out.println("0. Exit");

            int option = sc.nextInt();
            if(option < 0 || option > 9){ //to pairne ws <0 || >9 alliws
                while(option < 0 || option > 9);{
                    System.out.print("Give right option: ");
                    option = sc.nextInt();
                }
            }

            return option;

        }else{

            System.out.println("Select type: ");
            System.out.println("1. Printed ");
            System.out.println("2. Digital ");
            System.out.println("3. Web ");
            int type = sc.nextInt();
            while(type<0 || type>3){
                System.out.print("Give right type: ");
                type = sc.nextInt();
            }

            return type;

        }
        
    }

    public static int CompanyChoice(ArrayList<CommercialCompany> company){

        Scanner sc = new Scanner(System.in);


        int i = 1;
        for(CommercialCompany com: company){
            System.out.println(i + ". " + com.getName());
            i ++;
        }

        System.out.print("Select company: ");
        int select = sc.nextInt();
        while(select < 0 || select > company.size()){
            System.out.print("Give right company number: ");
            select = sc.nextInt();

        }

        return select;
    }

    //htan sthn oydsia o idios kwdikas...
    public static void ProductsAdsAndCosts(ArrayList<Product> products, ArrayList<Ad> adverts, ArrayList<AdType> types, int AdsCosts){

        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>(); //HashMap me key ton kwdiko/plhtos diafhmisewn toy proiontos kai value to plhthos daifhmisewn toy proiontos

        //gemisma hashMap
        int x;

        for(Product prods : products){
           x=0;

            for(Ad ad : adverts){
                if(ad.getProdCode() == prods.getCode()){
                    for(AdType type : types){
                        if(ad.getTypeCode() == type.getCode()){

                            if(AdsCosts==1){
                                x++;
                            }else{
                                x += Cost(type, ad);
                            }

                        }
                    }
                }
            }

            hashmap.put(prods.getCode(), x); 
        }

        //lista kwdikwn parallhlh me to neo tajinomhmeno HashMap poy paragetai apo to hdh yparxwn HashMap
        ArrayList<Integer> codes = new ArrayList<Integer>();
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();

        int max, p;
        int size = hashmap.size(); //epeidh allazei to size me to remove


        for(int i= 0; i < size; i++){

            //arxikopoihsh max kai p gia na trejei thn prwth fora
            max = -1; //etsi kai alliws to plhthos h to kostos den mporoyn na einai -1 opote sigoyra tha allajei to max(mpakalistikh taktikh)
            p = products.get(0).getCode(); //arxikopoihsh me tyxaio kwdiko proiontos mias kai den exei shmasia afoy opws eipame sigoyra tha allajei meta thn prwth fora

            for(Product prods : products){
                if(hashmap.get(prods.getCode())!= null){ //NullPointerException
                    if (hashmap.get(prods.getCode()) > max){
                        p = prods.getCode();
                        max = hashmap.get(prods.getCode());
                    }
                }
            }

            hashmap.remove(p); //to afairei giati an kapoia proionta exoyn idio plhthos h to idio kostos tote to prwto poy tha brei tha to emfanizei kathe fora
            codes.add(p); //tajinomei toys kwdikes bash to plhthos diafhmisewn toys
            num.put(p, max); //to neo tajinomhmeno HashMap parallhlo me to codes
        }

        //parallhla codes me num, eykolh h emfanish
        for(Integer code: codes){
            if (AdsCosts ==1 ){
                System.out.println("Product: " + code + "\tNumber of ads: "  + num.get(code));
            }else{
                System.out.println("Product: " + code + "\tCost of ads: " + num.get(code));
            }
        }
        
    }

   //-------------------------------------part2------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public static void WriteCommercialCompany(ArrayList<CommercialCompany> company, String filePath){

        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for ( CommercialCompany c : company){
                writer.write(c.toString());
                writer.newLine();
            }
            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void WriteProducts(ArrayList<Product> products, String filePath){

        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for ( Product p : products){
                writer.write(p.toString());
                writer.newLine();
            }
            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void WriteTypes(ArrayList<AdType> types, String filePath){

        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for ( AdType t : types){
                writer.write(t.toString());
                writer.newLine();
            }
            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void WriteAds(ArrayList<Ad> adverts, String filePath){

        try{

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for ( Ad a : adverts){
                writer.write(a.toString());
                writer.newLine();
            }
            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void ReadComcomp(ArrayList<CommercialCompany> company, String filePath){
        BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(filePath+".txt"));
			String line = reader.readLine();

			while (line != null) {
				line = reader.readLine();
                    if (line.trim().equals("Company")) {
                        line = reader.readLine();
                        if (line.trim().equals("{")) {
                            if(line.trim().startsWith("AFM")){

                            }
                            if(line.trim.startsWith("Name")){
                                
                            }

			            }
                    }
            }
			reader.close();
		    catch (IOException e) {
			    e.printStackTrace();
		    }
        }
    }

    public static void ReadProd(ArrayList<Product> products, String filePath){
        BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(filePath+".txt"));
			String line = reader.readLine();

			while (line != null) {
				line = reader.readLine();
                    if (line.trim().equals("Product")) {
                        line = reader.readLine();
                        if (line.trim().equals("{")) {
                            if(line.trim().startsWith("AFM")){

                            }

			            }
                    }
            }
			reader.close();
		    catch (IOException e) {
			    e.printStackTrace();
		    }
        }
    }

            
            
    
}
