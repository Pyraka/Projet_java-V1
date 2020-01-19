import javax.swing.*;

public class Panneaux {

    private Board boardPanel;
    private JPanel contentPane;
    private JPanel contentPaneLeft;
    private JPanel contentPaneRight;
    private JPanel turnPane;
    private JPanel cardsPane;
    private JPanel movesPane;
    private JPanel wallsPane;

    public Panneaux (){
        boardPanel = new Board();
        contentPane = new JPanel();
        contentPaneLeft = new JPanel();
        contentPaneRight = new JPanel();
        turnPane = new JPanel();
        cardsPane = new JPanel();
        movesPane = new JPanel();
        wallsPane = new JPanel();

    }

    public Board getBoardPanel() {
        return boardPanel;
    }

    public void setBoardPanel(Board boardPanel) {
        this.boardPanel = boardPanel;
    }

    public JPanel getContentPane() {
        return contentPane;
    }

    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }

    public JPanel getContentPaneLeft() {
        return contentPaneLeft;
    }

    public void setContentPaneLeft(JPanel contentPaneLeft) {
        this.contentPaneLeft = contentPaneLeft;
    }

    public JPanel getContentPaneRight() {
        return contentPaneRight;
    }

    public void setContentPaneRight(JPanel contentPaneRight) {
        this.contentPaneRight = contentPaneRight;
    }

    public JPanel getTurnPane() {
        return turnPane;
    }

    public void setTurnPane(JPanel turnPane) {
        this.turnPane = turnPane;
    }

    public JPanel getCardsPane() {
        return cardsPane;
    }

    public void setCardsPane(JPanel cardsPane) {
        this.cardsPane = cardsPane;
    }

    public JPanel getMovesPane() {
        return movesPane;
    }

    public void setMovesPane(JPanel movesPane) {
        this.movesPane = movesPane;
    }

    public JPanel getWallsPane() {
        return wallsPane;
    }

    public void setWallsPane(JPanel wallsPane) {
        this.wallsPane = wallsPane;
    }
}
