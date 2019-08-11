package za.ac.cput.domain.demography;

public class Race {

    private String RaceId;
    private String description;

    public Race() {
    }

    private Race(Builder builder) {
        this.RaceId = builder.RaceId;
        this.description = builder.description;
    }

    public String getRaceId() {
        return RaceId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Race{" +
                "id='" + RaceId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {

        private String RaceId;
        private String description;

        public Builder id(String RaceId) {
            this.RaceId = RaceId;
            return this;
        }

        public Builder desc(String description) {
            this.description = description;
            return this;
        }
        public Race build(){

            return new Race(this);
        }
        public Builder copy(Race race) {
            this.RaceId = race.RaceId;
            this.description = race.description;

            return this;
        }
    }
}
