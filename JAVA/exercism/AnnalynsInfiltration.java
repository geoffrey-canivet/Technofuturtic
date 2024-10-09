class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
        return true;
    } else {
        return false;
    }
}

public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    if (archerIsAwake == false && prisonerIsAwake == true) {
        return true;
    } else {
        return false;
    }
}

public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    if (petDogIsPresent == true && archerIsAwake == true && knightIsAwake == true && prisonerIsAwake == true) {
        return false;
    } else if (petDogIsPresent == false && archerIsAwake == true && knightIsAwake == true && prisonerIsAwake == true) {
        return false;
    } else if (petDogIsPresent == true && archerIsAwake == false && knightIsAwake == false && prisonerIsAwake == false) {
        return true;
    } else if (petDogIsPresent == true && archerIsAwake == false && knightIsAwake == false && prisonerIsAwake == true) {
        return true;
    } else if (petDogIsPresent == false && archerIsAwake == false && knightIsAwake == false && prisonerIsAwake == true) {
        return true;
    } else if (petDogIsPresent == true && archerIsAwake == false && knightIsAwake == true && prisonerIsAwake == false) {
        return true;
    } else if (petDogIsPresent == true && archerIsAwake == false && knightIsAwake == true && prisonerIsAwake == true) {
        return true;
    } else {
        return false;
    }
}
    
}