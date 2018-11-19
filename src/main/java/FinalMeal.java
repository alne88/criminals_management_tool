
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "final_meal")

public class FinalMeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column(name = "vegan")
    private Boolean vegan;

    @Column(name = "calories")
    private Double calories;

    @Column(name = "dessert")
    private Boolean dessert;

    @ManyToMany(mappedBy = "meals")
    private Set<Prisoners> prisoners;

    public void setPrisoners(Set<Prisoners> prisoners) {
        this.prisoners = prisoners;
    }

    public FinalMeal(){
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Boolean getDessert() {
        return dessert;
    }

    public void setDessert(Boolean dessert) {
        this.dessert = dessert;
    }

    public Set<Prisoners> getPrisoners() {
        return prisoners;
    }

    @Override
    public String toString() {
        return "FinalMeal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", vegan=" + vegan +
                ", calories=" + calories +
                ", dessert=" + dessert +
                '}';
    }
}
