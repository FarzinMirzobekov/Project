package renderer;

import org.w3c.dom.Text;

import static org.lwjgl.opengl.GL11.*;

public class Texture {
    private String filepath;
    private int textID
    public Texture (String filepath){
        this.filepath = filepath;

        // Generate texture on GPU
        textID = glGenTextures();
        glBindTexture(GL_TEXTURE_2D, textID);

        // Set texture parameters
        // Repeat image in both directions
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
        // When stretching the image, pixelate
    }
}
