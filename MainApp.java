/*
Arithos omadas: 063
Arithmoi mhtrwwn : p3220127-p3220215-p3220304
*/

import java.io.*;
import java.util.*;

class mainApp {

    public static void main(String Args[]) throws InputMismatchException {

        ArrayList<CommercialCompany> company = new ArrayList<CommercialCompany>();
        ArrayList<Product> products = new ArrayList<Product>();
        ArrayList<AdType> types = new ArrayList<AdType>();
        ArrayList<Ad> adverts = new ArrayList<Ad>();

        // -------------------------------------part2----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        ReadCom(company, "company.txt");
        ReadTypes(types, "types.txt");
        ReadProd(products, "products.txt");
        ReadAdverts(adverts, "adverts.txt");
        WriteCommercialCompany(company, "company.txt");
        WriteTypes(types, "types.txt");
        WriteProducts(products, "products.txt");
        WriteAds(adverts, "adverts.txt");
        // -------------------------------------end
        // part2----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Scanner in = new Scanner(System.in);
        int option = Choice(1);

        try {

            while (option != 0) {

                switch (option) {

                    case 1:

                        System.out.print("Give afm: ");
                        String afmCom = in.nextLine();

                        System.out.print("Give name: ");
                        String nameCom = in.nextLine();

                        CommercialCompany comp = new CommercialCompany(afmCom, nameCom);
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

                        if (Type == 1) {
                            System.out.print("Price per word first page: ");
                            int ppwFirst = in.nextInt();
                            System.out.print("Price per word in between: ");
                            int ppwMid = in.nextInt();
                            System.out.print("Price per word last page: ");
                            int ppwLast = in.nextInt();

                            PrintedType type = new PrintedType(codeType, descriptionType, afmComp, ppwFirst, ppwMid,
                                    ppwLast);
                            types.add(type);

                        } else if (Type == 2) {
                            System.out.print("Price per second morning: ");
                            int ppsMor = in.nextInt();
                            System.out.print("Price per second noon: ");
                            int ppsNoon = in.nextInt();
                            System.out.print("Price per second afternoon: ");
                            int ppsAfternoon = in.nextInt();
                            System.out.print("Price per second night: ");
                            int ppsNight = in.nextInt();

                            DigitalType type = new DigitalType(codeType, descriptionType, afmComp, ppsMor, ppsNoon,
                                    ppsAfternoon, ppsNight);
                            types.add(type);

                        } else if (Type == 3) {
                            System.out.print("Price per day: ");
                            int ppd = in.nextInt();
                            System.out.print("Auto show cost: ");
                            int cost_auto = in.nextInt();
                            System.out.print("Price per extra page: ");
                            int extrap_cost = in.nextInt();

                            WebType type = new WebType(codeType, descriptionType, afmComp, ppd, cost_auto, extrap_cost);
                            types.add(type);
                        }
                        WriteTypes(types, "types.txt");
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

                        Product prod = new Product(codeProd, afmSup, description);
                        products.add(prod);
                        WriteProducts(products, "products.txt");

                        System.out.print("Duration: ");
                        int duration = in.nextInt();

                        System.out.print("Details: ");
                        in.nextLine();
                        String details = in.nextLine();

                        if (Type == 1) {
                            System.out.print("Number of words: ");
                            int words = in.nextInt();
                            System.out.println("Page position: " + "\nFirst\nMid\nLast");
                            String position = in.nextLine();
                            if ((!position.equals("First")) && (!position.equals("Mid"))
                                    && (!position.equals("Last"))) {
                                while ((!position.equals("First")) && (!position.equals("Mid"))
                                        && (!position.equals("Last"))) {
                                    System.out.print("Give right position: ");
                                    position = in.nextLine();
                                }
                            }

                            PrintedAd advert = new PrintedAd(codeType, codeProd, duration, details, words, position);
                            adverts.add(advert);

                        } else if (Type == 2) {
                            System.out.print("Duration(sec): ");
                            int dur_sec = in.nextInt();
                            System.out.println("Timezone: " + "\nMornign\nNoon\nAfternoon\nNight");
                            String timezone = in.nextLine();
                            if ((!timezone.equals("Morning")) && (!timezone.equals("Noon"))
                                    && (!timezone.equals("Afternoon")) && (!timezone.equals("Night"))) {
                                while ((!timezone.equals("Morning")) && (!timezone.equals("Noon"))
                                        && (!timezone.equals("Afternoon")) && (!timezone.equals("Night"))) {
                                    System.out.print("Give right timezone: ");
                                    timezone = in.nextLine();
                                }
                            }

                            DigitalAd advert = new DigitalAd(codeType, codeProd, duration, details, dur_sec, timezone);
                            adverts.add(advert);

                        } else if (Type == 3) {
                            System.out.println("Auto show ad: " + "\n1.Yes\n2.No");
                            int autoshow = in.nextInt();
                            while (autoshow != 1 && autoshow != 0) {
                                System.out.print("Give 1 for 'Yes' or 2 for 'No': ");
                                autoshow = in.nextInt();
                            }

                            if (autoshow == 2) {
                                autoshow = 0;
                            }
                            System.out.print("Extra pages: ");
                            int extrap = in.nextInt();

                            WebAd advert = new WebAd(codeType, codeProd, duration, details, autoshow, extrap);
                            adverts.add(advert);

                        }
                        WriteAds(adverts, "adverts.txt");
                        break;

                    case 4:

                        Iterator<Ad> it = adverts.iterator();
                        int i = 1;
                        while (it.hasNext()) {
                            System.out.println("Ad" + i + ":\t" + it.next().toString());
                            i++;
                        }
                        break;

                    case 5:

                        String afm = company.get(CompanyChoice(company) - 1).getAfm(); // CompanyChoide = methodos

                        i = 1;
                        for (Ad advert : adverts) {
                            for (AdType type : types) {
                                if (advert.getTypeCode() == type.getCode()) {
                                    if (type.getAfm().equals(afm)) {
                                        System.out.println("Ad" + i + "\t" + advert.toString());
                                        i++;
                                    }
                                }
                            }

                        }

                        break;

                    case 6:

                        int select = CompanyChoice(company); // methodos
                        int total_cost = 0;
                        i = 1;

                        for (AdType type : types) {
                            if (company.get(select - 1).getAfm().equals(type.getAfm())) {

                                for (Ad advert : adverts) {
                                    if (advert.getTypeCode() == type.getCode()) {

                                        System.out.println("Cost of Ad" + i + ": " + Cost(type, advert)); // gia oles
                                                                                                          // tis
                                                                                                          // diafhmiseis
                                        total_cost += Cost(type, advert); // methodos
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
                        i = 1;
                        for (Product prods : products) {
                            System.out.println(i + ". " + prods.getCode());
                            i++;
                        }

                        System.out.print("Select product: ");
                        select = in.nextInt();
                        while (select < 0 || select > products.size()) {
                            System.out.print("Give right product number: ");
                            select = in.nextInt();
                        }

                        pl = 0;
                        i = 1;

                        for (Ad ad : adverts) {
                            if (ad.getProdCode() == products.get(select - 1).getCode()) {
                                for (AdType type : types) {
                                    if (ad.getTypeCode() == type.getCode()) {

                                        i++;
                                        System.out.println("Cost of Ad" + i + ": " + Cost(type, ad)); // gia oles tis
                                                                                                      // daifhmiseis
                                        pl += Cost(type, ad);
                                    }
                                }

                            }
                        }

                        System.out.println("Total cost is:\t" + pl); // synolo apo oles tis diafhmiseis
                        break;

                    case 9:

                        ProductsAdsAndCosts(products, adverts, types, 2);
                        break;

                }

                option = Choice(1);

            }

        } catch (InputMismatchException e) {
            System.out.print("Give an integer");
        } catch (ClassCastException e2) {

        }
        // -------------------------------------part2----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        WriteCommercialCompany(company, "C:/Users/30698/Desktop/javateam2/companies.txt");
        WriteProducts(products, "C:/Users/30698/Desktop/javateam2/products.txt");
        WriteTypes(types, "C:/Users/30698/Desktop/javateam2/types.txt");
        WriteAds(adverts, "C:/Users/30698/Desktop/javateam2/adverts.txt");

        // -------------------------------------end
        // part2----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    }

    public static int Cost(AdType type, Ad advert) {

        if (type instanceof PrintedType) {

            PrintedAd ad = (PrintedAd) advert;
            PrintedType typ = (PrintedType) type;
            return typ.cost(ad.getWords(), ad.getPosition(), ad.getDur());

        } else if (type instanceof DigitalType) {

            DigitalAd ad = (DigitalAd) advert;
            DigitalType typ = (DigitalType) type;
            return typ.cost(ad.getDursec(), ad.getTimezone(), ad.getDur());

        } else {

            WebAd ad = (WebAd) advert;
            WebType typ = (WebType) type;
            return typ.cost(ad.getAuto(), ad.getExtra(), ad.getDur());
        }
    }

    public static int Choice(int purpose) {

        Scanner sc = new Scanner(System.in);

        if (purpose == 1) {

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
            if (option < 0 || option > 9) { // to pairne ws <0 || >9 alliws
                while (option < 0 || option > 9)
                    ;
                {
                    System.out.print("Give right option: ");
                    option = sc.nextInt();
                }
            }

            return option;

        } else {

            System.out.println("Select type: ");
            System.out.println("1. Printed ");
            System.out.println("2. Digital ");
            System.out.println("3. Web ");
            int type = sc.nextInt();
            while (type < 0 || type > 3) {
                System.out.print("Give right type: ");
                type = sc.nextInt();
            }

            return type;

        }

    }

    public static int CompanyChoice(ArrayList<CommercialCompany> company) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        for (CommercialCompany com : company) {
            System.out.println(i + ". " + com.getName());
            i++;
        }

        System.out.print("Select company: ");
        int select = sc.nextInt();
        while (select < 0 || select > company.size()) {
            System.out.print("Give right company number: ");
            select = sc.nextInt();

        }

        return select;
    }

    // htan sthn oydsia o idios kwdikas...
    public static void ProductsAdsAndCosts(ArrayList<Product> products, ArrayList<Ad> adverts, ArrayList<AdType> types,
            int AdsCosts) {

        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>(); // HashMap me key ton kwdiko/plhtos
                                                                             // diafhmisewn toy proiontos kai value to
                                                                             // plhthos daifhmisewn toy proiontos

        // gemisma hashMap
        int x;

        for (Product prods : products) {
            x = 0;

            for (Ad ad : adverts) {
                if (ad.getProdCode() == prods.getCode()) {
                    for (AdType type : types) {
                        if (ad.getTypeCode() == type.getCode()) {

                            if (AdsCosts == 1) {
                                x++;
                            } else {
                                x += Cost(type, ad);
                            }

                        }
                    }
                }
            }

            hashmap.put(prods.getCode(), x);
        }

        // lista kwdikwn parallhlh me to neo tajinomhmeno HashMap poy paragetai apo to
        // hdh yparxwn HashMap
        ArrayList<Integer> codes = new ArrayList<Integer>();
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();

        int max, p;
        int size = hashmap.size(); // epeidh allazei to size me to remove

        for (int i = 0; i < size; i++) {

            // arxikopoihsh max kai p gia na trejei thn prwth fora
            max = -1; // etsi kai alliws to plhthos h to kostos den mporoyn na einai -1 opote sigoyra
                      // tha allajei to max(mpakalistikh taktikh)
            p = products.get(0).getCode(); // arxikopoihsh me tyxaio kwdiko proiontos mias kai den exei shmasia afoy
                                           // opws eipame sigoyra tha allajei meta thn prwth fora

            for (Product prods : products) {
                if (hashmap.get(prods.getCode()) != null) { // NullPointerException
                    if (hashmap.get(prods.getCode()) > max) {
                        p = prods.getCode();
                        max = hashmap.get(prods.getCode());
                    }
                }
            }

            hashmap.remove(p); // to afairei giati an kapoia proionta exoyn idio plhthos h to idio kostos tote
                               // to prwto poy tha brei tha to emfanizei kathe fora
            codes.add(p); // tajinomei toys kwdikes bash to plhthos diafhmisewn toys
            num.put(p, max); // to neo tajinomhmeno HashMap parallhlo me to codes
        }

        // parallhla codes me num, eykolh h emfanish
        for (Integer code : codes) {
            if (AdsCosts == 1) {
                System.out.println("Product: " + code + "\tNumber of ads: " + num.get(code));
            } else {
                System.out.println("Product: " + code + "\tCost of ads: " + num.get(code));
            }
        }

    }

    // -------------------------------------part2------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void WriteCommercialCompany(ArrayList<CommercialCompany> company, String filePath) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("COMPANY_LIST\n{\n");
            for (CommercialCompany c : company) {
                writer.write(c.toStringFile());
                writer.newLine();
            }
            writer.write("}");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteProducts(ArrayList<Product> products, String filePath) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("ITEMS_LIST\n{\n");
            for (Product p : products) {
                writer.write(p.toStringFile());
                writer.newLine();
            }
            writer.write("}");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteTypes(ArrayList<AdType> types, String filePath) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("ADVTYPE_LIST\n{\n");
            for (AdType t : types) {
                writer.write(t.toStringFile());
                writer.newLine();
            }
            writer.write("}");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteAds(ArrayList<Ad> adverts, String filePath) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("ADV_LIST\n{\n");
            for (Ad a : adverts) {
                writer.write(a.toStringFile());
                writer.newLine();
            }
            writer.write("}");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadCom(ArrayList<CommercialCompany> company, String filePath) {
        String name = null, afm = null;
        BufferedReader reader;
        String line;
        try {

            reader = new BufferedReader(new FileReader(new File(filePath)));
            line = reader.readLine();
            while (line != null) {
                if (line.toLowerCase().trim().equals("company")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        if (line.toLowerCase().trim().startsWith("name ")) {
                            name = line.trim().substring(5).trim();
                            line = reader.readLine();
                        }
                        if (line.toLowerCase().trim().startsWith("afm ")) {
                            afm = line.trim().substring(4).trim();
                            line = reader.readLine();
                        }
                        if (line.trim().startsWith("}")) {
                            CommercialCompany comp = new CommercialCompany(afm, name);
                            company.add(comp);

                        }

                    }

                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void ReadProd(ArrayList<Product> products, String filePath) {
        String descr = null, sup_afm = null;
        int code = 0;
        BufferedReader reader;
        String line;
        try {

            reader = new BufferedReader(new FileReader(new File(filePath)));
            line = reader.readLine();
            while (line != null) {
                if (line.toLowerCase().trim().equals("item")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        if (line.toLowerCase().trim().startsWith("code ")) {
                            code = Integer.parseInt(line.trim().substring(5).trim());
                            line = reader.readLine();
                        }

                        if (line.toLowerCase().trim().startsWith("descr ")) {
                            descr = line.trim().substring(6).trim();
                            line = reader.readLine();
                        }

                        if (line.toLowerCase().trim().startsWith("supplier_afm ")) {
                            sup_afm = line.trim().substring(13).trim();
                            line = reader.readLine();
                        }
                        if (line.trim().startsWith("}")) {
                            Product prod = new Product(code, descr, sup_afm);
                            if (!(products.contains(prod))) {
                                products.add(prod);
                            }

                        }

                    }
                }
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void ReadTypes(ArrayList<AdType> types, String filePath) {
        int code = 0, a = 0, b = 0, c = 0, d = 0;
        String descr = null, afm = null, type = null;
        BufferedReader reader;
        String line;

        try {
            reader = new BufferedReader(new FileReader(new File(filePath)));
            line = reader.readLine();
            while (line != null) {
                if (line.toLowerCase().trim().equals("advtype")) {
                    line = reader.readLine();
                    if (line.trim().startsWith("{")) {
                        line = reader.readLine();
                        if (line.toLowerCase().trim().startsWith("code ")) {
                            code = Integer.parseInt(line.trim().substring(5).trim());
                            line = reader.readLine();
                        }

                        if (line.toLowerCase().trim().startsWith("descr ")) {
                            descr = line.trim().substring(6).trim();
                            line = reader.readLine();
                        }

                        if (line.toLowerCase().trim().startsWith("afm ")) {
                            afm = line.trim().substring(4).trim();
                            line = reader.readLine();
                        }

                        if (line.toLowerCase().trim().startsWith("type ")) {
                            if (line.toLowerCase().trim().substring(5).trim().equals("print")) {
                                line = reader.readLine();
                                if (line.toLowerCase().trim().startsWith("price_per_word_first_page ")) {
                                    a = Integer.parseInt(line.trim().substring(26).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("price_per_word_mid_pages ")) {
                                    b = Integer.parseInt(line.trim().substring(25).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("price_per_word_last_page ")) {
                                    c = Integer.parseInt(line.trim().substring(25).trim());
                                    line = reader.readLine();
                                }
                                if (line.trim().startsWith("}")) {
                                    PrintedType Adtype = new PrintedType(code, descr, afm, a, b, c);
                                    types.add(Adtype);
                                }

                            } else if (line.toLowerCase().trim().substring(5).trim().equals("digital")) {
                                line = reader.readLine();
                                if (line.toLowerCase().trim().startsWith("price_per_second_morning ")) {
                                    a = Integer.parseInt(line.trim().substring(25).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("price_per_second_noon ")) {
                                    b = Integer.parseInt(line.trim().substring(22).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("price_per_second_afternoon ")) {
                                    c = Integer.parseInt(line.trim().substring(27).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("price_per_second_night ")) {
                                    d = Integer.parseInt(line.trim().substring(23).trim());
                                    line = reader.readLine();
                                }
                                if (line.trim().startsWith("}")) {
                                    DigitalType Adtype = new DigitalType(code, descr, afm, a, b, c, d);
                                    types.add(Adtype);
                                }

                            } else if (line.toLowerCase().trim().substring(5).trim().equals("web")) {
                                line = reader.readLine();
                                if (line.toLowerCase().trim().startsWith("price_per_day ")) {
                                    a = Integer.parseInt(line.trim().substring(13).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("autoshow_cost ")) {
                                    b = Integer.parseInt(line.trim().substring(14).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("extra_pages_cost ")) {
                                    c = Integer.parseInt(line.trim().substring(17).trim());
                                    line = reader.readLine();
                                }
                                if (line.trim().startsWith("}")) {
                                    WebType Adtype = new WebType(code, descr, afm, a, b, c);
                                    types.add(Adtype);
                                }

                            }
                        }
                    }
                }
                line = reader.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void ReadAdverts(ArrayList<Ad> ads, String filePath) {

        String det = null, type = null, position = null, timezone = null;
        int code_type = 0, code_prod = 0, dur = 0, words = 0, dursec = 0, autoshow = 0, extrap = 0;
        BufferedReader reader;
        String line;

        try {

            reader = new BufferedReader(new FileReader(new File(filePath)));
            line = reader.readLine();
            while (line != null) {
                if (line.toLowerCase().trim().equals("adv")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        if (line.toLowerCase().trim().startsWith("advtype_code ")) {
                            code_type = Integer.parseInt(line.trim().substring(13).trim());
                            line = reader.readLine();
                        }

                        if (line.toLowerCase().trim().startsWith("item_code ")) {
                            code_prod = Integer.parseInt(line.trim().substring(10).trim());
                            line = reader.readLine();
                        }
                        if (line.toLowerCase().trim().startsWith("duration ")) {
                            dur = Integer.parseInt(line.trim().substring(9).trim());
                            line = reader.readLine();
                        }
                        if (line.toLowerCase().trim().startsWith("justification ")) {
                            det = line.trim().substring(14).trim();
                            line = reader.readLine();
                        }
                        if (line.toLowerCase().trim().startsWith("type ")) {

                            if (line.toLowerCase().trim().substring(5).trim().equals("print")) {
                                line = reader.readLine();
                                if (line.toLowerCase().trim().startsWith("words ")) {
                                    words = Integer.parseInt(line.trim().substring(6).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("position ")) {
                                    position = line.trim().substring(9).trim();
                                    line = reader.readLine();
                                }
                                if (line.trim().startsWith("}")) {
                                    PrintedAd adv = new PrintedAd(code_type, code_prod, dur, det, words, position);
                                    ads.add(adv);
                                }

                            } else if (line.toLowerCase().trim().substring(5).trim().equals("digital")) {
                                line = reader.readLine();
                                if (line.toLowerCase().trim().startsWith("duration_in_seconds ")) {
                                    dursec = Integer.parseInt(line.trim().substring(21).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("timezone ")) {
                                    timezone = line.trim().substring(10).trim();
                                    line = reader.readLine();
                                }
                                if (line.trim().startsWith("}")) {
                                    DigitalAd adv = new DigitalAd(code_type, code_prod, dur, det, dursec, timezone);
                                    ads.add(adv);
                                }

                            } else if (line.toLowerCase().trim().substring(5).trim().equals("web")) {
                                line = reader.readLine();
                                if (line.toLowerCase().trim().startsWith("autoshow ")) {
                                    autoshow = Integer.parseInt(line.trim().substring(9).trim());
                                    line = reader.readLine();
                                }

                                if (line.toLowerCase().trim().startsWith("extra_pages ")) {
                                    extrap = Integer.parseInt(line.trim().substring(12).trim());
                                    line = reader.readLine();
                                }
                                if (line.trim().startsWith("}")) {
                                    WebAd adv = new WebAd(code_type, code_prod, dur, det, autoshow, extrap);
                                    ads.add(adv);
                                }

                            }
                        }

                    }
                }
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}