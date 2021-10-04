package UE1;

public enum Combattype {
    MELEE, RANGED, NONE;

    @Override
    public String toString() {
        if (Combattype.values().equals(MELEE)){
            return "MELEE";
        }else if (Combattype.values().equals(RANGED)){
            return "RANGED";
        }
        return "NONE";
    }
}
