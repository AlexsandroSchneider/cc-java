public class Main {
    public static int makeConnection(int value) throws ChecksumException, LostSignalException, EthernetException, WirelessException, NetworkException {
        if (value == 0) throw new ChecksumException();
        if (value == 1) throw new LostSignalException();
        if (value == 2) throw new EthernetException();
        if (value == 3) throw new WirelessException();
        if (value == 4) throw new NetworkException();
        return 2*value;
    }
}