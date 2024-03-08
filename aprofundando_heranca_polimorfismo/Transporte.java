package aprofundando_heranca_polimorfismo;

interface Flutuante {};
interface Voador{};
interface Terrestre {};
interface Anfibio extends Terrestre, Flutuante {};

public class Transporte {}

class Carro extends Transporte implements Terrestre {}
class Aviao extends Transporte implements Voador {}
class HidroAviao extends Aviao implements Flutuante {}
class Drozd extends Carro implements Anfibio {}