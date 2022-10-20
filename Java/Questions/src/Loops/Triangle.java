import java.io.*;

class GFG {

	static float area(float r, float s, float t)
	{

		if (r < 0 || s < 0 || t < 0 || (r + s <= t)
			|| r + t <= s || s + t <= r)



		{

			System.out.println("Not a valid input");
			System.exit(0);
		}


		float S = (r + s + t) / 2;


		float A = (float)Math.sqrt(S * (S - r) * (S - s)
								* (S - t));


		return A;
	}


	public static void main(String[] args)
	{

		float r = 5.0f;
		float s = 6.0f;
		float t = 7.0f;


		System.out.println("Area of the triangle: "
						+ area(r, s, t));
	}
}
