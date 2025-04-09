public class NumberGroup()
{
    private NumberGroup group1;

    public boolean contains(int number){
        if(group1 == number){
            return true;
        }
        return false;

    }
}