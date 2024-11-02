 try{
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }