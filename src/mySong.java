public class mySong implements Media , Comparable
{
    //Instance Variables
   private String name;
   private String artist;
   private double time; //length of song (min)
   private int tempo;
   private boolean isSingable; //does it have lyrics
   private static int count; //static variable lets me count all songs
    //Constructors
    //mutli-argument constructor
    public mySong(String name, String artist, double time, int tempo, boolean isSingable)
    {
        this.name = name;
        this.artist = artist;
        this.time = validateTime(time);
        this.tempo = tempo;
        this.isSingable = isSingable;

        count++;
    }

    public mySong(String name, String artist, boolean isSingable)
    {
        this.name = name;
        this.artist = artist;
        time = 0.0;
        tempo = 0;
        this.isSingable = isSingable;

        count++;
    }

    public mySong()
    {
        this.name = "unnamed song";
        this.artist = "";
        this.time = 0.0;
        this.tempo = 0;
        this.isSingable = false;

        count++;
    }//end default constructor

    //Getters (accessors)
    public String getName()
    {
        return name;
    }
    //Precondition  0 <= time
    public static int getCount()
    {
        return count;
    }
    public double getTime()
    {
        return time;
    }
   public String getArtist()
   {
       return artist;
   }
   public int getTempo()
   {
       return tempo;
   }
   public boolean getIsSingable()
   {
       return isSingable;
   }

    //Postcondition 0 <= time


    //setters (mutators)
    public void setName(String name)
    {
        this.name = name;
    }

    public void setTime(double time)
    {
        this.time = validateTime(time);
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    public void setTempo(int tempo)
    {
        this.tempo = tempo;
    }
    public void setIsSingable(boolean isSingable)
    {
        this.isSingable = isSingable;
    }

    //brain
    public int lengthInSec()
    {
        int seconds = (int)(60 * time);
        return seconds;

        //int minutes = (int) time;
        //int seconds = (int)(time - minutes) * 60;
        //minutes *= 60;
    }

    private double validateTime(double time)
    {
        double result = 0;
        if(time > 0)
        {
            result = time;
        }
        return result;
    }

    //toString
    @Override
    public int compareTo(Object mS)
    {
        int output = 0;
        if(this.time < ((mySong)mS).getTime())
        {
            output = -1;
        }
        else if(this.time < ((mySong)mS).getTime())
        {
            output = 1;
        }
        return output;
    }

    public String toString()
    {
        String output = "Name: "  + name;
        output += "\nArtist: " + artist;
        output += "\nTime: " + time;
        output += "\nTempo: " + tempo;
        output += "\nis it singable: " + isSingable;
        return output;
    }
}//end object class mySong (reference class)
