public class Dog {
    private String Name;
    private String Breed;

    public Dog(String Name, String Breed)
    {  this.Name=Name;
        this.Breed=Breed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }
}
