????   4 t  fr/keyce/tree/Tree  java/lang/Object root Lfr/keyce/tree/Node; current previous <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this Lfr/keyce/tree/Tree; add (Ljava/lang/String;)V  fr/keyce/tree/Node
   	 	    	     value Ljava/lang/String; currentNode StackMapTable addLeft	  "  
  $ % & getNextLeft ()Lfr/keyce/tree/Node;
  ( ) * setNextLeft (Lfr/keyce/tree/Node;)V addRight
  - . & getNextRight
  0 1 * setNextRight downLeft	 4 6 5 java/lang/System 7 8 out Ljava/io/PrintStream; : pas de feuille
 < > = java/io/PrintStream ?  println 	downRight display C java/lang/StringBuilder E (Vous êtes dans le sous-arbre nommé : '
 B 
  H I J getValue ()Ljava/lang/String;
 B L M N append -(Ljava/lang/String;)Ljava/lang/StringBuilder; P '
 B R S J toString U 	 W 	?
 < Y ? 
 back replaceLeft replaceValue replaceRight
 B  `  
  b c d fillBuilder B(Ljava/lang/StringBuilder;Lfr/keyce/tree/Node;Ljava/lang/String;)V builder Ljava/lang/StringBuilder; h ? j 

 l n m java/lang/String o p valueOf &(Ljava/lang/Object;)Ljava/lang/String; depth 
SourceFile 	Tree.java !                          	 
     3     *? ?       
    
                      z     ? Y+? M*? ? *,? **? ? ?            	                           	         ?           ?     2**? ? !? Y+? M? **? ? #? *? ? #???*? ,? '?                    )   1 #         2       2     !       	 ?  
  +      ?     2**? ? !? Y+? M? **? ? ,? *? ? ,???*? ,? /?           &  '  )  *  ) ) - 1 /         2       2     !       	 ?  
  2 
     e     !*? ? #? **? ? #? ? ? 39? ;?           4 
 5  6  7   9        !           @ 
     e     !*? ? ,? **? ? ,? ? ? 39? ;?           ; 
 <  =  >   @        !           A 
         ?? 3? BYD? F*? ? G? KO? K? Q? ;? 3*? ? G? ;*? ? #? %? 3? BYT? F*? ? #? G? K? Q? ;? ? 3V? ;*? ? ,? %? 3? BYT? F*? ? ,? G? K? Q? ;? ? 3V? ;? 3? X? 3? X?       6    D ! E . F 8 G W H Z I b K l L ? M ? N ? P ? Q ? R        ?         ? Z+  Z 
     7     	**? !? ?       
    W  Y        	      [      X     ? Y+? M*? ,? '?           ^ 	 _  a                    	 	 \    ]      X     ? Y+? M*? ,? '?           e 	 f  h                    	 	 \    S J     T     ? BY? ^L*+*? _? a+? Q?           n  o  p               e f   c d     ?     o,? +-? Kg? Ki? KW?+-? K,? G? Ki? KW,? #? ,? ,? ?*+,? #? BY-? k? FT? K? Q? a*+,? ,? BY-? k? FT? K? Q? a?       & 	   t  u  v  x ' y 5 z 6 | R } n ~    *    o       o e f    o      o q          r    s