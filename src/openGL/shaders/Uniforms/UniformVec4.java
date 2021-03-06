package openGL.shaders.Uniforms;

import org.lwjgl.opengl.GL20;
import org.lwjgl.util.vector.Vector4f;

public class UniformVec4 extends Uniform {

	private float currentX;
	private float currentY;
	private float currentZ;
	private float currentW;

	/**
	 * Create a new Uniform of type vec4
	 * @param name name of the uniform, must be the same as in the Shader program
	 */
	public UniformVec4(String name) {
		super(name);
	}

	/**
	 * Load a vector in GPU RAM
	 * @param vector vector to load
	 */
	public void loadVec4(Vector4f vector) {
		loadVec4(vector.x, vector.y, vector.z, vector.w);
	}

	/**
	 * Load a vector in GPU RAM
	 * @param x x component of the vector
	 * @param y y component of the vector
	 * @param z z component of the vector
	 * @param w x component of the vector
	 */
	public void loadVec4(float x, float y, float z, float w) {
		if (x != currentX || y != currentY || z != currentZ || w != currentW) {
			this.currentX = x;
			this.currentY = y;
			this.currentZ = z;
			this.currentW = w;
			GL20.glUniform4f(super.getLocation(), x, y, z, w);
		}
	}

}
