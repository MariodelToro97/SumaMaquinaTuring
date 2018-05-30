/*
* Este programa fue hecho por Mario Josue del Toro Morales
* con Número de Control 15460644
* Estudiante del sexto semestre de la carrera de Ingeniería en Sistemas Computacionales
* del Instituto Tecnológico de Colima
* Materia de Lenguajes y Autómatas I
******Descripción************
* Programa que usa la máquina de Turing para sacar la suma de dos números binarios
 */
package maquinaturing2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario Josue del Toro Morales
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    //Declaración de la matriz de Transición y el vector del alfabeto
    String matrizTransicion[][][] = new String[4][5][3];
    String alfabeto[] = new String[5];

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); //Coloca la ventana al centro de la pantalla

        //Inserción de valores en el vector del alfabeto
        alfabeto[0] = "00";
        alfabeto[1] = "10";
        alfabeto[2] = "01";
        alfabeto[3] = "11";
        alfabeto[4] = "  ";

        //Llenado de la matriz de Transición
        matrizTransicion[0][0][0] = "0";
        matrizTransicion[0][0][1] = "3";
        matrizTransicion[0][0][2] = "1";

        matrizTransicion[0][1][0] = "0";
        matrizTransicion[0][1][1] = "3";
        matrizTransicion[0][1][2] = "1";

        matrizTransicion[0][2][0] = "0";
        matrizTransicion[0][2][1] = "3";
        matrizTransicion[0][2][2] = "1";

        matrizTransicion[0][3][0] = "0";
        matrizTransicion[0][3][1] = "3";
        matrizTransicion[0][3][2] = "1";

        matrizTransicion[0][4][0] = "1";
        matrizTransicion[0][4][1] = "3";
        matrizTransicion[0][4][2] = "-1";

        matrizTransicion[1][0][0] = "1";
        matrizTransicion[1][0][1] = "0";
        matrizTransicion[1][0][2] = "-1";

        matrizTransicion[1][1][0] = "1";
        matrizTransicion[1][1][1] = "1";
        matrizTransicion[1][1][2] = "-1";

        matrizTransicion[1][2][0] = "1";
        matrizTransicion[1][2][1] = "1";
        matrizTransicion[1][2][2] = "-1";

        matrizTransicion[1][3][0] = "2";
        matrizTransicion[1][3][1] = "0";
        matrizTransicion[1][3][2] = "-1";

        matrizTransicion[1][4][0] = "3";
        matrizTransicion[1][4][1] = "3";
        matrizTransicion[1][4][2] = "1";

        matrizTransicion[2][0][0] = "1";
        matrizTransicion[2][0][1] = "1";
        matrizTransicion[2][0][2] = "-1";

        matrizTransicion[2][1][0] = "2";
        matrizTransicion[2][1][1] = "0";
        matrizTransicion[2][1][2] = "-1";

        matrizTransicion[2][2][0] = "2";
        matrizTransicion[2][2][1] = "0";
        matrizTransicion[2][2][2] = "-1";

        matrizTransicion[2][3][0] = "2";
        matrizTransicion[2][3][1] = "1";
        matrizTransicion[2][3][2] = "-1";

        matrizTransicion[2][4][0] = "3";
        matrizTransicion[2][4][1] = "1";
        matrizTransicion[2][4][2] = "1";

        matrizTransicion[3][0][0] = "99";
        matrizTransicion[3][0][1] = "";
        matrizTransicion[3][0][2] = "";

        matrizTransicion[3][1][0] = "99";
        matrizTransicion[3][1][1] = "";
        matrizTransicion[3][1][2] = "";

        matrizTransicion[3][2][0] = "99";
        matrizTransicion[3][2][1] = "";
        matrizTransicion[3][2][2] = "";

        matrizTransicion[3][3][0] = "99";
        matrizTransicion[3][3][1] = "";
        matrizTransicion[3][3][2] = "";

        matrizTransicion[3][4][0] = "99";
        matrizTransicion[3][4][1] = "";
        matrizTransicion[3][4][2] = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Texto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        Obtener = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Valor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();

        Texto1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Texto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Texto1.setToolTipText("Inserte el número binario al que desea sacar el complemmento a 1");
        Texto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Texto1KeyReleased(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Ma. Elena Martínez Durán");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Docente:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Semestre:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("15460644");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mario Josué Del Toro Morales ");
        jLabel5.setToolTipText("Autor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Autor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Número de Control:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Sexto");

        Texto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Texto.setToolTipText("Inserte el número binario al que desea sacar el complemmento a 1");
        Texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("Este programa saca la suma de dos datos binarios ingresados con la máquina de Turing");
        jLabel9.setToolTipText("Descripción de programa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Programa utilizando máquina de Turing");
        jLabel7.setToolTipText("Nombre de la práctica");

        Limpiar.setBackground(new java.awt.Color(255, 255, 102));
        Limpiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setToolTipText("Borrará el código escrito así como la tabla de tokens");
        Limpiar.setEnabled(false);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Obtener.setBackground(new java.awt.Color(102, 255, 204));
        Obtener.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Obtener.setText("Realizar Suma");
        Obtener.setToolTipText("Realiza el análisis léxico del programa");
        Obtener.setEnabled(false);
        Obtener.setName("potencia"); // NOI18N
        Obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtenerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel10.setText("Instituto Tecnológico de Colima");
        jLabel10.setToolTipText("Nombre de la Escuela");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(207, 30, 67));
        jLabel11.setText("Ingeniería en Sistemas Computacionales");
        jLabel11.setToolTipText("Carrera que se está cursando");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 91, 91));
        jLabel4.setText("Lenguajes y Autómatas I");
        jLabel4.setToolTipText("Nombre de la materia");

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Salir");
        jButton3.setToolTipText("Termina la aplicación");
        jButton3.setName("salir"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Valor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Valor.setToolTipText("Inserte el número binario al que desea sacar el complemmento a 1");
        Valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Primer valor a ingresar:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Segundo valor a ingresar:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("____________________________");

        Resultado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Resultado.setToolTipText("Inserte el número binario al que desea sacar el complemmento a 1");
        Resultado.setEnabled(false);
        Resultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ResultadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(241, 241, 241)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(Texto, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoKeyReleased
        //Método para habilitar el botón de limpiar una vez que se escibe algo en el cuadro de texto
        if (Texto.getText().length() != 0 && Valor.getText().length() != 0) {
            Limpiar.setEnabled(true); //habilitación del botón de limpiar
            Obtener.setEnabled(true); //habilitación del botón de obtener

        } else {
            if (Texto.getText().length() != 0) {
                Limpiar.setEnabled(true); //habilitación del botón de limpiar                

            } else {
                Limpiar.setEnabled(false); //deshabilitación del botón de limpiar
                Obtener.setEnabled(false); //deshabilitación del botón de obtener
            }
        }
    }//GEN-LAST:event_TextoKeyReleased

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        //Método que se ejecuta al dar clic en el botón de limpiar
        Texto.setText(""); //se vacia la caja de texto
        Valor.setText(""); //Se coloca en blanco la caja de texto
        Resultado.setText(""); //Se coloca en blanco el espacio del resultado
        Obtener.setEnabled(false); //se deshabilita el botón de obtener
        Limpiar.setEnabled(false); //se deshabilita el botón de habilitación

        //Pasa el foco al textfield del código
        Valor.requestFocus();
    }//GEN-LAST:event_LimpiarActionPerformed

    public void EspacioCadena() {
        //Método que agrega el espacio respectivo para la terminación de la máquina
        Texto.setText(" " + Texto.getText() + " ");
        Valor.setText(" " + Valor.getText() + " ");
    }

    public int ChecarAlfabeto(String caracter, String character) {
        //Método que checa si existe el caracter en el alfabeto
        int valor = -1;
        String cadena = caracter + character;

        for (int i = 0; i < alfabeto.length; i++) {
            if (cadena.equalsIgnoreCase(alfabeto[i])) {
                valor = i;
                break;
            }
        }
        return valor;
    }

    public String ObtencionEstado(int estado, int valor) {
        //Método que obtiene el estado al cual se va a mover el apuntador
        return matrizTransicion[estado][valor][0];
    }

    public String ObtencionConversion(int estado, int valor) {
        //Método que obtiene el valor por el que se va a cambiar la casilla
        return matrizTransicion[estado][valor][1];
    }

    public String ObtencionMovimiento(int estado, int valor) {
        //Método que obtiene el movimiento que el apuntador va hacer.
        return matrizTransicion[estado][valor][2];
    }

    private void ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerActionPerformed
        // Método que se deesencadena tras pulsar el boton de Obtener de la interfaz principal
        int estado = 0, movimiento, posicion = 1, valor, cambio, state = 0;
        String caracter, Text, modificado = "", mostrar = "";
        boolean error = false;

        EspacioCadena(); // Llamado al método que agrega el espacio para la terminación de la máquina.

        if (Texto.getText().length() == Valor.getText().length()) {
            do {
                caracter = Character.toString(Texto.getText().charAt(posicion)); //Obtiene el valor de la cadena 1.
                Text = Character.toString(Valor.getText().charAt(posicion)); //Obtiene el valor de la segunda cadena

                valor = ChecarAlfabeto(caracter, Text); // Llamado al método para checar si el caracter pertenece al alfabeto.

                if (valor == -1) { //Entra si NO encuentra el caracter en el alfabeto
                    mostrar += "\n[" + state + "] [" + caracter + Text + "] ---->";
                    JOptionPane.showMessageDialog(null, mostrar + "\nEl caracter no existe en el alfabeto binario de la máquina", "ERROR", JOptionPane.ERROR_MESSAGE);
                    error = true;

                } else {
                    state = estado; //Gaurda el estado para que no se pierda y sirva de busqueda en los respectivos métodos que se necesiten.
                    System.out.println(modificado);
                    estado = Integer.parseInt(ObtencionEstado(state, valor)); //Llamado al método que obtiene el estado al que se moverá el apuntador

                    if (estado == 99) { //Entra si encuentra el estado final
                        mostrar += "\n[" + state + "] [" + caracter + Text + "] ----> (99, , )";
                        JOptionPane.showMessageDialog(null, mostrar + "\nEl proceso ha terminado de forma correcta\n\n El resultado del Complemento a 1 es:\n\n" + modificado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                        error = true;

                    } else { //Entra si aún sigue en el proceso sin ningún error encontrado.
                        cambio = Integer.parseInt(this.ObtencionConversion(state, valor)); //Llamado del método de obtención de caracter por el que se va a cambiar el valor en la cadena.
                        if (cambio != 3) {
                            modificado = cambio + modificado; //Agregado a la cadena donde se van almacenando los datos que salen de la máquina de Turing
                        } else {
                            modificado += " "; //Agregado a la cadena final del espacio terminador
                        }

                        movimiento = Integer.parseInt(this.ObtencionMovimiento(state, valor));//Llamado al método de obtención del movimiento ha realizar por el apuntador en la máquina de Turing
                        mostrar += "\n[" + state + "] [" + caracter + Text + "] ----> (" + estado + ", " + cambio + ", " + movimiento + ")";
                        
                        switch (movimiento) { //Checa el tipo de movimiento que da como resultado de la tabla de transición
                            case -1://Entra aquí si el movimiento del apuntador que se debe realizar es hacia la izquierda
                                posicion--;
                                break;

                            case 1: //Entra aquí si el movimiento del apuntador que se debe realizar es hacia la derecha
                                posicion++;
                                break;
                        }
                    }
                }
            } while (!error);
        } else {
            JOptionPane.showMessageDialog(null, "La longitud de las cadenas es diferente,\nCambiar los valores aquí establecidos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        Resultado.setText(modificado);
        //Pasa el foco al textfield del código
        Valor.requestFocus();
    }//GEN-LAST:event_ObtenerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Cierra la aplicación
        JOptionPane.showMessageDialog(null, "Gracias por usar este programa\n Lo esperamos de vuelta pronto\n Versión 1.5.32\n\n Creado por: Mario Josue del Toro Morales\nEstudiante del Instituto Tecnológico de Colima\n Carrera de Ingeniería en Sistemas Coputacionales\n No. Control: 15460647\n Sexto Semestre", "AGRADECIMIENTO", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorKeyReleased
        //Método para habilitar el botón de limpiar una vez que se escibe algo en el cuadro de texto
        if (Texto.getText().length() != 0 && Valor.getText().length() != 0) {
            Limpiar.setEnabled(true); //habilitación del botón de limpiar
            Obtener.setEnabled(true); //habilitación del botón de obtener

        } else {
            if (Valor.getText().length() != 0) {
                Limpiar.setEnabled(true); //habilitación del botón de limpiar                

            } else {
                Limpiar.setEnabled(false); //deshabilitación del botón de limpiar
                Obtener.setEnabled(false); //deshabilitación del botón de obtener
            }
        }
    }//GEN-LAST:event_ValorKeyReleased

    private void Texto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Texto1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto1KeyReleased

    private void ResultadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResultadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Obtener;
    private javax.swing.JTextField Resultado;
    private javax.swing.JTextField Texto;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextField Valor;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
