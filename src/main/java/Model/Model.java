package Model;

import java.util.ArrayList;

public class Model
{
    // attributes
    FootballPlayerData fpData;
    ArrayList<ArrayList<String>> lines;

    public Model()
    {
        fpData = new FootballPlayerData();

        // set data for displayable interface in fpData
        fpData.setFirstLineToDisplay(0);
        fpData.setLastLineToDisplay(20);
        fpData.setLinesBeingDisplayed(20);

        lines = fpData.getLines(fpData.getFirstLineToDisplay(),
                fpData.getLastLineToDisplay());
    }


    public FootballPlayerData getFpData() {
        return fpData;
    }

    public ArrayList<ArrayList<String>> getLines() {
		lines = fpData.getLines(fpData.getFirstLineToDisplay(),
                fpData.getLastLineToDisplay());
        return lines;
    }

}
