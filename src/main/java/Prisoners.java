import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Table (name = "prisoners")

public class Prisoners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cell_number")
    private Integer cell_number;

    @Column(name = "alias")
    private String alias;

    @Column(name = "date_in")
    private Date date_in;

    @Column(name = "execution_date")
    private Date execution_date;

    @Column(name = "final_meal")
    private Integer final_meal;

    public Set<FinalMeal> getMeals() {return meals;}

    public void setMeals(Set<FinalMeal> meals) {this.meals = meals;}

    @ManyToMany
    @JoinTable(
            name = "bandit_buffet",
            joinColumns = {@JoinColumn(name = "prisoner_id")},
            inverseJoinColumns = {@JoinColumn(name = "meal_id")}
    )

    private Set<FinalMeal> meals;

    public Prisoners () {
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

    public Integer getCellNumber() {
        return cell_number;
    }

    public void setCellNumber(Integer cell_number) {
        this.cell_number = cell_number;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Date getDate_in() {
        return date_in;
    }

    public void setDate_in(Date date_in) {
        this.date_in = date_in;
    }

    public Date getExecution_date() {
        return execution_date;
    }

    public void setExecution_date(Date execution_date) {
        this.execution_date = execution_date;
    }

    public Integer getFinalMeal() {
        return final_meal;
    }

    public void setFinalMeal(Integer final_meal) {
        this.final_meal = final_meal;
    }

    @Override
    public String toString() {
        return "Prisoners{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cell_number=" + cell_number +
                ", alias='" + alias + '\'' +
                ", date_in=" + date_in +
                ", execution_date=" + execution_date +
                ", final_meal=" + final_meal +
                ", meals=" + meals +
                '}';
    }
}
