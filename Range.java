public Range implements NumberGroup()
{
    private int min;
    private int max;

    public Range()
    {
        min =0;
        max=0;
    }

    public Range(int mi, int ma)
    {
        min = mi;
        max = ma;
    }

    public contains(int num)
    {
        for(int i=min; i<=max; i++){
            if(i=num){
                return true;
            }
        }
        return false;
    }
}
