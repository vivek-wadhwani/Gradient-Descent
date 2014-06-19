import java.util.ArrayList;


public class calculateValueOfA {

	//This method calculates the value of A.
		public double calcA(int i,ArrayList<ArrayList<Double>> al,ArrayList<Double> weights,int size)
		{
			Double a = 0.0;

			for(int j=0;j<size;j++)
			{
				a = a + al.get(i).get(j)*weights.get(j);
			}

			return a;
		}

}
