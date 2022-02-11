class TwelveDays {
    String verse(int verseNumber) {
        switch(verseNumber)
            {
                case 1    :    return("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n");
                case 2    :    return("On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 3    :    return("On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 4    :     return("On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 5    :    return("On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 6    :    return("On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 7    :    return("On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 8    :    return("On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 9    :     return("On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 10    :    return("On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 11    :    return("On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
                case 12    :    return("On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
            }
         return "abc";
    }

    String verses(int startVerse, int endVerse) {
        int i;
        String str=new String();
        TwelveDays obj=new TwelveDays();
        for(i=startVerse;i<endVerse;i++)
            str=str+obj.verse(i)+"\n";
        str=str+obj.verse(i);
        return str;
    }
    
    String sing() {
        int i;
        String str=new String();
        TwelveDays obj=new TwelveDays();
        for(i=1;i<12;i++)
            str=str+obj.verse(i)+"\n";
        str=str+obj.verse(12);
        return str;  
    }
   

}
