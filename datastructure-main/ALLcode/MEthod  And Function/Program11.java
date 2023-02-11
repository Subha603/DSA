public class Program11 
{
    public static void main(String[] args) {
        String name="Subhajit kundu";
        changeName(name);
        System.out.println(name);
    }    
    static void changeName(String name)
    {
        name="Subhadip rana";
        /*here also subhadip rana is not print only print subhajit kundu */
        /*Know for this we have know how the vales are actually going to pass  */
    }
}
