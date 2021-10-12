package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class FootballPlayerData implements 
        TableData, Displayable
{
    private ArrayList<FootballPlayer> players;
    private int firstLineToDisplay;
    private int lineToHighlight;
    private int lastLineToDisplay;
    private int linesBeingDisplayed;    

    public FootballPlayerData()
    {
        players = new ArrayList<>();
        loadTable();
    }

    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            InputStream iStream = getClass().getClassLoader().getResourceAsStream("xml/FootballPlayerTable.xml");
            decoder = new XMLDecoder(iStream);
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {xx.printStackTrace();}
    }
    
    // Methods required for TableData
    @Override
    public void loadTable() {
        ReadPlayersFromXML();
    }

    @Override
    public ArrayList<FootballPlayer> getTable() {
        return players;
    }

    @Override
    public ArrayList<String> getHeaders() {
        return players.get(0).getAttributeNames();
    }

    @Override
    public ArrayList<String> getLine(int line) {
        return players.get(line).getAttributes();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        for (int i = firstLine; i <= lastLine; i++) {
            lines.add(getLine(i));
        }
        return lines;
    }
    // Methods required for Displayable
    @Override
    public int getFirstLineToDisplay() {
        return firstLineToDisplay;
    }

    @Override
    public int getLineToHighlight() {
        return lineToHighlight;
    }

    @Override
    public int getLastLineToDisplay() {
        return lastLineToDisplay;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        firstLineToDisplay = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        lineToHighlight = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
        lastLineToDisplay = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
        linesBeingDisplayed = numberOfLines;
    }
}
