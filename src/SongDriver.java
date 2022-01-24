public class SongDriver
{
    public static void main(String[] args)
    {
       // String phrase = new String("Hello"); first String is class, then var name, then new, then lastly, handling method
        mySong lover = new mySong("Lover", "Taylor Swift", 3.6, 120, true);
        mySong twilightZone = new mySong("Twilight Zone", "Box 6", 7.25, 116, false);
        mySong froggyFriend = new mySong("Froggy Friend", "Moss Talkers", true);
        mySong blank = new mySong();
        myVideo cspPt = new myVideo("AP CSP Create PT", 1);
        mySong froggyFriend2 = new mySong("Froggy Friend", "Moss Talkers", true);

        mySong[] playlist = {lover, twilightZone, blank, froggyFriend, froggyFriend2};
        for(mySong s: playlist) //augmented for loop : for-each loop
        {
            System.out.println(s.toString());
        }

/*

        playlist[2].setName("1812 Overture");
        System.out.println("Song at element 2: " + playlist[2].toString());
 */

      //  System.out.println(cspPt.toString());

//        if(lover.compareTo(froggyFriend) == 0)
//        {
//            System.out.println(lover.getName() + " is the same length as " + froggyFriend.getName());
//        }
//        else if(lover.compareTo(froggyFriend) > 0)
//        {
//            System.out.println(lover.getName() + " is longer than " + froggyFriend.getName());
//        }
//        else
//        {
//            System.out.println(lover.getName() + " is shorter than " + froggyFriend.getName());
//        }
/*
        //Alias Practice

        if(froggyFriend == froggyFriend2)
        {
            System.out.println("Yes they are the same");
        }
        else
        {
            System.out.println("No they are different");
        }

        mySong froggyFriend3 = froggyFriend;
        froggyFriend3.setTime(20);
        System.out.println("New Times: " + froggyFriend3.getTime() +  "Old Times: " + froggyFriend.getTime());

        if(froggyFriend == froggyFriend3)
        {
            System.out.println("Yes they are the same 1 3");
        }
        else
        {
            System.out.println("No they are dif 1 3");
        }
        */
//




//        System.out.println(froggyFriend.toString() + "\n");
//        froggyFriend.setTime(10.5);
//        System.out.println("Froggy Friend length: " + froggyFriend.getTime());
//        System.out.println(froggyFriend.toString());

//        froggyFriend.setIsSingable(false);
//        froggyFriend.setTempo(100);
//        froggyFriend.setArtist("not moss talkers");
//        froggyFriend.setName("not froggy friends");
//        System.out.println(froggyFriend.getIsSingable());
//        System.out.println(froggyFriend.getArtist());
//        System.out.println(froggyFriend.getName());
//        System.out.println(froggyFriend.getTempo());
//
//        System.out.println("\n" + froggyFriend.toString());
//        System.out.println(froggyFriend.lengthInSec());



    }
}
