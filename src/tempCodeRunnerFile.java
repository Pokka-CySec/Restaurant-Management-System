String[] items = {"M", "E", "G", "A", "H", " ", "H", "O", "L", "D", "I", "N", "G"};
            for (String item : items) {
                System.out.print(item);
                                        
            try 
            {
               Thread.sleep(350); // Delay for 1 second 
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }