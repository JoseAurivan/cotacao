package adapterPackages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author auriv
 */
public class Adapter {
    final String codigoYahoo = "MGLU3.SA";
    final String alphaVantage = "INTL";
    final String quandL = "WIKI/AAPL";
    
    

    
    public void  adapterCotacaoYahoo(){
        Cotacoes.cotacaoUsandoYahooFinance(codigoYahoo);
    }
    public void adapterCotacaoAlphaVantage(){
        Cotacoes.cotacaoUsandoAlphaVantage(alphaVantage);
    }
    public void adapterCotacaoQuandL(){
        Cotacoes.cotacaoUsandoQuandl(quandL);
    }
}
