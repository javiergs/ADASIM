/**
 * Interface for encoder to standardize andn ensure parse and encode methods implemented
 * @author annonymous
 * @version 2025
 */
public interface EncoderHelper {
    int[] parse(String command);

    String encode(int[] angles);
}
