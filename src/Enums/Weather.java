package Enums;

public enum Weather {
    CLEAR{
        @Override
        public String str(){
            return "";
        }
    },
    BLIZZARD{
        @Override
        public String str(){
            return "Метель";
        }
    },
    WIND{
        @Override
        public String str(){
            return "Дует ветер";
        }
    },
    FOG{
        @Override
        public String str() {
            return "Туман";
        }
    };
    public abstract String str();
}