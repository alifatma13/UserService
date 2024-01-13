package dev.fatma.userservicetestfinal.exception;

public class SessionCountExceededException extends Exception{
    @Override
    public String getMessage() {
        return "Cannot have more than 2 active sessions";
    }
}
