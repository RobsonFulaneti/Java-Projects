//package controller;
//
//import model.Passageiro;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ContPax {
//
//    public static class PaxController {
//
////        List<Passageiro> passageiros = new ArrayList();
//
//        public String adicionarPax(String pax, int numeroTel, int codigo) {
//            try {
//                Passageiro passageiro = new Passageiro();
//
//                passageiro.setPax(pax);
//                passageiro.setNumeroTel(numeroTel);
//                passageiro.setCodigo(codigo);
//
//                passageiros.add(passageiro);
//                return "Passageiro cadastrado \n";
//            } catch (Exception e) {
//                e.printStackTrace();
//                return "Erro";
//            }
//        }
//
//        public Passageiro buscarPax(int codigo){
//
//            for (int j = 0; j < passageiros.size(); j ++){
//                if (codigo == passageiros.get(j).getCodigo()){
//                    return passageiros.get(j);
//                }
//            }
//            return null;
//        }
//    }
//}