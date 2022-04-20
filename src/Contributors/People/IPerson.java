package Contributors.People;

public interface IPerson {
    public static Person IMember(int type) {

        if(type==0){
            return new Employee();
        }else if(type==1){
            return new Member();
        }
        else{
            return new Author();
        }
    }
}
