public class myVideo implements Media
{
    //1 Instances Variables
    private String name;
    private double time;

    //2 Construtors
    public myVideo(String name, double time)
    {
        this.name = name;
        this.time = time;
    }
    public myVideo()
    {
        this.name = "No Name";
        this.time = 0.0;
    }

    //4 getters
    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public double getTime()
    {
        return time;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void setTime(double time)
    {
        this.time = time;
    }

    //3 toString
    public String toString()
    {
        String output = "Name of video: " + name;
        output += "\nLength of Video: " + time;

        return output;
    }
}//end class myVideo
