package model;

import model.interfaces.GameEngineCLI;

import java.util.Scanner;

public class GameEngineCLI2Players implements GameEngineCLI {
    private GameBoard gameBoard;
    private Player player1;
    private Player player2;

    public GameEngineCLI2Players(String playerName1, String playerName2){
        gameBoard = new GameBoard(2);
        player1 = new Player(1, playerName1);
        player2 = new Player(2, playerName2);
    }

    public void playGame(){
        Scanner keyboard = new Scanner(System.in);
        while(!checkEndGame()){
            for(int playerNo=1;playerNo<3;playerNo++){
                int opponentNo;
                if(playerNo==1){
                    opponentNo=2;
                }else {
                    opponentNo=1;
                }
                boolean flag=false;
                do {
                    clearScreen();
                    printOpponentDeck(opponentNo);
                    System.out.println("");
                    gameBoard.printGameBoard();
                    System.out.println("\n");
                    printPrivateBoard(playerNo);
                    String input;

                    do {
                        System.out.println("");
                        System.out.println("Your turn: (tip: help)");
                        System.out.print(">");
                        input = keyboard.nextLine();
                        flag=true;
                    } while (!processInput(input ,playerNo));

                    if(input.toLowerCase().equals("help")){
                        String helpInput="";
                        drawHelp();
                        do{
                            System.out.println("Input 'back' to go back");
                            System.out.print(">");
                            input = keyboard.nextLine();
                        } while(!input.equals("back"));
                        flag=false;
                    }
                } while(flag==false);
            }
        }

        //End of game
        clearScreen();
        System.out.println("===  E N D   O F   G A M E ===" +
                         "\n==============================" +
                       "\n\nResult:" +
                         "\n-------\n" +
                       printResults(player1) +
                         "\n-------\n" +
                       printResults(player2));

        PlayerDeck player1Deck = player1.getPlayerDeck();
        PlayerDeck player2Deck = player2.getPlayerDeck();
        String winner = "";
        //If player 1 has more prestige
        if(player1Deck.getPrestige() > player2Deck.getPrestige()){
            winner = player1.getName();
        }
        //If both player has equal prestige
        else if(player1Deck.getPrestige() == player2Deck.getPrestige()){
            //If player 1 purchased less developments
            if(player1Deck.getDevelopments().size() < player2Deck.getDevelopments().size()){
                winner = player1.getName();
            }
            //If player 2 purchased less developments
            else if(player1Deck.getDevelopments().size() > player2Deck.getDevelopments().size()){
                winner = player2.getName();
            }
            else{
                winner = "draw";
            }
        }
        //If player 2 has more prestige
        else{
            winner = player2.getName();
        }

        if(!winner.equals("draw")){
            System.out.println("\nAnd the winner is ... " + winner.toUpperCase() + " !!" +
                    "\n\n *Note: Player with the most prestige wins. If both player appears to have equal" +
                    "\n number of prestige, then player with the least developments wins.");
        }
        else{
            System.out.println("\nIt appears to be a draw !!" +
                    "\n\n *Note: Player with the most prestige wins. If both player appears to have equal" +
                    "\n number of prestige, then player with the least developments wins.");
        }
        System.out.println("");
    }

    protected void cheatCode(String code, PlayerDeck playerDeck){
        if(code.equals("cheatone")) {
            playerDeck.setPermanentGems(new int[]{1,3,1,1,2});
            playerDeck.setPrestige(3);
        }
        else if(code.equals("cheattwo")){
            playerDeck.setPermanentGems(new int[]{3,2,3,2,1});
            playerDeck.setPrestige(8);
        }
        else if(code.equals("cheatthree")){
            playerDeck.setPermanentGems(new int[]{4,2,4,1,0});
            playerDeck.setPrestige(11);
        }
        else if(code.equals("cheatfour")){
            playerDeck.setPermanentGems(new int[]{4,4,4,4,4});
            playerDeck.setPrestige(12);
        }
        else if(code.equals("cheatendgame")){
            playerDeck.setPermanentGems(new int[]{4,4,4,4,4});
            playerDeck.setPrestige(15);
        }
    }

    protected String printResults(Player player){
        return " Player " + player.getName().toUpperCase() + " :" +
                "\n  Developments purchased: " + player.getPlayerDeck().getDevelopments().size() +
                "\n  Total prestige: " + player.getPlayerDeck().getPrestige();
    }

    protected boolean processInput(String inputRaw, int playerNo){
        String input = inputRaw.toLowerCase();
        boolean retVal=false;

        if(input.toLowerCase().equals("help")){
            retVal = true;
        }
        else if(input.contains(" ")){
            if(input.substring(0, input.indexOf(" ")).equals("take")){
                return processInputTake(playerNo, input);
            }
            else if(input.substring(0, input.indexOf(" ")).equals("buy")){
                return processInputBuy(playerNo, input);
            }
            else if(input.substring(0, input.indexOf(" ")).equals("reserve")){
                return processInputReserve(playerNo, input);
            }
            else if(input.substring(0, input.indexOf(" ")).equals("pay")){
                return processInputPay(playerNo, input);
            }
            else{
                System.out.println("** Invalid command. Please look up the help page **");
                retVal = false;
            }
        }
        else{
            if(input.equals("take")){
                System.out.println("** Please specify the gems **");
                return false;
            }
            else if(input.equals("buy")){
                System.out.println("** Please specify the development you'd like to buy **");
                return false;
            }
            else if(input.equals("reserve")){
                System.out.println("** Please specify the development you'd like to reserve **");
                return false;
            }
            else if(input.equals("pay")){
                System.out.println("** Please specify the reserved you'd like to pay **");
                return false;
            }
            else if(input.equals("cheatone")){
                cheatCode("cheatone", getPlayer(playerNo).getPlayerDeck());
                return true;
            }
            else if(input.equals("cheattwo")){
                cheatCode("cheattwo", getPlayer(playerNo).getPlayerDeck());
                return true;
            }
            else if(input.equals("cheatthree")){
                cheatCode("cheatthree", getPlayer(playerNo).getPlayerDeck());
                return true;
            }
            else if(input.equals("cheatfour")){
                cheatCode("cheatfour", getPlayer(playerNo).getPlayerDeck());
                return true;
            }
            else if(input.equals("cheatendgame")){
                cheatCode("cheatendgame", getPlayer(playerNo).getPlayerDeck());
                return true;
            }
            else{
                System.out.println("** Invalid command. Please look up the help page **");
                return false;
            }
        }
        return retVal;
    }

    protected boolean processInputPay(int playerNo, String input){
        String inputSubstring = input.substring(4, input.length());
        PlayerDeck playerDeck = getPlayer(playerNo).getPlayerDeck();

        int retValBuyReserve = playerDeck.checkBuyReserve(inputSubstring);
        if(retValBuyReserve>-20){
            if(retValBuyReserve>=0){
                int[] payment = playerDeck.buyReserve(inputSubstring);
                gameBoard.receiveGemPayment(payment, false);
                return true;
            }
            else if(retValBuyReserve==-1 && playerDeck.getGold()>0){
                boolean retValUseGold = useGold();
                if(retValUseGold){
                    int[] payment = playerDeck.buyReserve(inputSubstring);
                    gameBoard.receiveGemPayment(payment, true);
                    playerDeck.takeGold();
                    return true;
                }
                else{
                    System.out.println("** Purchase cancelled **");
                    return false;
                }
            }
            else{
                printErrorMessageTakeGems(12);
                return false;
            }
        }
        else{
            if(retValBuyReserve==-33){
                printErrorMessageTakeGems(14);
            }
            else{
                printErrorMessageTakeGems(13);
            }
            return false;
        }
    }

    protected boolean processInputReserve(int playerNo, String input){
        String inputSubstring = input.substring(8, input.length());
        PlayerDeck playerDeck = getPlayer(playerNo).getPlayerDeck();

        if(gameBoard.checkDevelopment(inputSubstring)){
            Card developmentToReserve = gameBoard.getDevelopment(inputSubstring);
            if(playerDeck.checkReserve()==2){
                playerDeck.reserve(gameBoard.takeDevelopment(inputSubstring), gameBoard.getGold());
                gameBoard.takeGold();
                return true;
            }
            else{
                printErrorMessageTakeGems(11);
                return false;
            }
        }
        else{
            printErrorMessageTakeGems(9);
            return false;
        }
    }

    protected boolean processInputBuy(int playerNo, String input){
        String inputSubstring = input.substring(4, input.length());
        PlayerDeck playerDeck = getPlayer(playerNo).getPlayerDeck();

        if(gameBoard.checkDevelopment(inputSubstring)){
            Card developmentToTake = gameBoard.getDevelopment(inputSubstring);
            int retVal = playerDeck.checkDevelopment(developmentToTake);
            //If gems are sufficient
            if(retVal >= 0){
                int[] payment = playerDeck.addDevelopment(gameBoard.takeDevelopment(inputSubstring));
                gameBoard.receiveGemPayment(payment, false);
                return true;
            }
            //If -1 gem and player has a gold gem (wild card)
            else if(retVal == -1 && playerDeck.getGold()>0){
                boolean retValUseGold = useGold();
                if(retValUseGold){
                    int[] payment = playerDeck.addDevelopment(gameBoard.takeDevelopment(inputSubstring));
                    gameBoard.receiveGemPayment(payment, true);
                    playerDeck.takeGold();
                    return true;
                }
                else{
                    System.out.println("** Purchase cancelled **");
                    return false;
                }
            }
            //If insufficient gems
            else{
                printErrorMessageTakeGems(10);
                return false;
            }
        }
        //If invalid development code
        else{
            printErrorMessageTakeGems(9);
            return false;
        }
    }

    protected boolean useGold(){
        Scanner scanner = new Scanner(System.in);
        boolean useGem = false;
        int flag=-1;
        do {
            System.out.print("You need 1 more gem. Use gold? (Y/N) >");
            String yesOrNo = scanner.nextLine();
            if(yesOrNo.toLowerCase().equals("y")){
                useGem=true;
                flag=0;
            }
            else if(yesOrNo.toLowerCase().equals("n")){
                useGem=false;
                flag=0;
            }
            else{
                flag=-1;
            }
        } while(flag==-1);
        return useGem;
    }

    protected boolean processInputTake(int playerNo, String input){
        String inputSubstring = input.substring(5, input.length()).toUpperCase();
        PlayerDeck playerDeck = getPlayer(playerNo).getPlayerDeck();
        int returnErrorNo = gameBoard.checkInputTakeGems(inputSubstring);

        if(returnErrorNo == 200){
            int[] rawInputArray = gameBoard.convertRawInputToArray(inputSubstring);
            if(playerDeck.checkGems(rawInputArray)){
                gameBoard.takeGems(rawInputArray);
                playerDeck.addHandGems(rawInputArray);
                return true;
            }
            else{
                printErrorMessageTakeGems(8);
                return false;
            }
        }
        else{
            printErrorMessageTakeGems(returnErrorNo);
            return false;
        }
    }

    protected void printErrorMessageTakeGems(int errorNo){
        String errorMessage="";
        if(errorNo==1){
            errorMessage = "You can't take the gold gem. Please try again";
        }
        else if(errorNo==2){
            errorMessage = "Invalid take gem format. Please look up the help page ";
        }
        else if(errorNo==22){
            errorMessage = "You can't take only 1 gem";
        }
        else if(errorNo==3){
            errorMessage = "Invalid gem code. (must be one of the following: W,R,G,O,B)";
        }
        else if(errorNo==4){
            errorMessage = "Invalid format, please look up the help page for take gem format";
        }
        else if(errorNo==5){
            errorMessage = "You must take 2 same coloured gems OR 3 different coloured gems";
        }
        else if(errorNo==6){
            errorMessage = "You must take 3 different coloured gems OR 2 same coloured gems";
        }
        else if(errorNo==7){
            errorMessage = "Not enough gems to take";
        }
        else if(errorNo==75){
            errorMessage = "You can't take 2 same coloured gems from a tile with less than 2 gems after taking";
        }
        else if(errorNo==8){
            errorMessage = "You can't have more than 10 gems on your hand!";
        }
        else if(errorNo==9){
            errorMessage = "Invalid development number. (Dev no can be seen on the card)";
        }
        else if(errorNo==10){
            errorMessage = "Insufficient gems";
        }
        else if(errorNo==11){
            errorMessage = "You can't have more than 3 reserves!";
        }
        else if(errorNo==12){
            errorMessage = "You don't have enough gems to pay";
        }
        else if(errorNo==13){
            errorMessage = "Invalid reserve number. Please choose 1/2/3 from your reserves";
        }
        else if(errorNo==14){
            errorMessage = "Can't find the reserve card. Please choose 1/2/3 from your reserves";
        }
        System.out.println("** " + errorMessage + " **");
    }

    protected void clearScreen(){
        for(int i=0;i<100;i++){
            System.out.println("");
        }
    }

    protected void drawHelp(){
        clearScreen();
        System.out.println("This is help");
    }

    protected void printPrivateBoard(int playerNo){
        getPlayer(playerNo).getPlayerDeck().printPersonalDeck();
        System.out.println("");
    }

    protected void printOpponentDeck(int opponentNo){
        getPlayer(opponentNo).getPlayerDeck().printPublicDeck();
        System.out.println("");
    }

    protected boolean checkEndGame(){
        return player1.getPlayerDeck().getPrestige()>=15 || player2.getPlayerDeck().getPrestige()>=15;
    }

    protected Player getPlayer(int no){
        if(no==1){
            return player1;
        }
        else{
            return player2;
        }
    }
}
