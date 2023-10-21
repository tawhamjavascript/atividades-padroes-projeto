import java.util.List;

public interface State {
    
    public void changeState();
    public String validate(List<String> input);
    public List<String> input();

}
