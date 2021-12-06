ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("myarray.ser")
        );
        out.writeObject(myArray);
        out.flush();
        out.close();