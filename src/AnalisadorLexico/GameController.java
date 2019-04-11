/* The following code was generated by JFlex 1.4.3 on 08/04/19 21:57 */

package AnalisadorLexico; 

import static AnalisadorLexico.Token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 08/04/19 21:57 from the specification file
 * <tt>C:/Users/breno/Desktop/Game Controller Language/src/AnalisadorLexico/Lexer.flex</tt>
 */
class GameController {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\3\2\0\1\4\22\0\1\4\1\0\1\30\1\0"+
    "\1\0\6\0\1\0\2\0\1\32\1\0\12\1\3\0\1\5\3\0"+
    "\1\24\1\11\1\10\1\16\1\14\1\21\1\25\1\23\1\22\1\31"+
    "\1\13\1\2\1\26\1\15\1\6\1\7\1\31\1\12\1\17\1\20"+
    "\1\27\5\31\4\0\1\0\1\0\32\33\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\12\1\1\0\1\5"+
    "\2\0\1\6\1\7\13\0\1\10\1\11\1\0\1\12"+
    "\2\0\1\13\1\14\1\15\1\16\3\0\1\17\1\0"+
    "\1\20\1\21\1\0\1\22\1\23\1\0\1\24\3\0"+
    "\1\25\4\0\1\26\1\27\2\0\1\30\1\31\4\0"+
    "\1\32\2\0\1\33\1\34\1\35\1\0\1\36\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\34\0\70\0\34\0\34\0\124\0\160\0\214"+
    "\0\250\0\304\0\340\0\374\0\u0118\0\u0134\0\u0150\0\u016c"+
    "\0\u0188\0\u01a4\0\u01c0\0\34\0\34\0\u01dc\0\u01f8\0\u0214"+
    "\0\u0230\0\u024c\0\u0268\0\u0284\0\u02a0\0\u02bc\0\u02d8\0\u02f4"+
    "\0\34\0\34\0\u0310\0\34\0\u032c\0\u0348\0\34\0\34"+
    "\0\34\0\34\0\u0364\0\u0380\0\u039c\0\34\0\u03b8\0\34"+
    "\0\34\0\u03d4\0\34\0\34\0\u03f0\0\34\0\u040c\0\u0428"+
    "\0\u0444\0\u0460\0\u047c\0\u0498\0\u04b4\0\u04d0\0\34\0\34"+
    "\0\u04ec\0\u0508\0\34\0\34\0\u0524\0\u0540\0\u055c\0\u0578"+
    "\0\34\0\u0594\0\u05b0\0\34\0\34\0\34\0\u05cc\0\34"+
    "\0\34";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\0\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\2\1\13\2\2\1\14\1\2"+
    "\1\15\1\16\5\2\1\17\3\2\35\0\1\3\41\0"+
    "\1\20\45\0\1\21\14\0\1\22\3\0\1\23\14\0"+
    "\1\24\22\0\1\25\35\0\1\26\31\0\1\27\2\0"+
    "\1\30\36\0\1\31\24\0\1\32\15\0\1\33\15\0"+
    "\1\34\3\0\1\35\10\0\1\36\5\0\30\37\1\0"+
    "\3\37\2\0\1\40\4\0\1\41\1\42\1\43\1\0"+
    "\1\44\1\45\7\0\1\46\25\0\1\47\24\0\1\50"+
    "\1\51\2\0\1\52\46\0\1\53\14\0\1\54\36\0"+
    "\1\55\37\0\1\56\23\0\1\57\3\0\1\60\31\0"+
    "\1\61\40\0\1\62\26\0\1\63\43\0\1\64\22\0"+
    "\1\65\25\0\2\37\3\0\22\37\1\66\1\37\1\67"+
    "\1\37\6\0\1\70\33\0\1\71\37\0\1\72\33\0"+
    "\1\73\35\0\1\74\33\0\1\75\25\0\1\76\34\0"+
    "\1\77\34\0\1\100\35\0\1\101\51\0\1\66\1\0"+
    "\1\67\1\102\25\0\1\103\10\0\1\104\33\0\1\105"+
    "\53\0\1\106\26\0\1\107\36\0\1\110\25\0\1\111"+
    "\43\0\1\112\41\0\1\66\2\0\1\102\24\0\1\113"+
    "\27\0\1\114\33\0\1\115\27\0\1\116\45\0\1\117"+
    "\15\0\1\120\45\0\1\121\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1512];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\12\1\1\0\1\1\2\0"+
    "\2\11\13\0\2\11\1\0\1\11\2\0\4\11\3\0"+
    "\1\11\1\0\2\11\1\0\2\11\1\0\1\11\3\0"+
    "\1\1\4\0\2\11\2\0\2\11\4\0\1\11\2\0"+
    "\3\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  GameController(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  GameController(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 94) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 26: 
          { lexeme = yytext(); return ERROR;
          }
        case 32: break;
        case 1: 
          { return ER;
          }
        case 33: break;
        case 31: 
          { lexeme = yytext(); return IMPRIMI;
          }
        case 34: break;
        case 18: 
          { lexeme = yytext(); return IBC;
          }
        case 35: break;
        case 12: 
          { lexeme = yytext(); return CLP;
          }
        case 36: break;
        case 8: 
          { lexeme = yytext(); return OPP;
          }
        case 37: break;
        case 30: 
          { lexeme = yytext(); return OPERLAC;
          }
        case 38: break;
        case 7: 
          { lexeme = yytext(); return BR;
          }
        case 39: break;
        case 27: 
          { lexeme = yytext(); return OPARIT;
          }
        case 40: break;
        case 24: 
          { lexeme = yytext(); return OPLOG;
          }
        case 41: break;
        case 6: 
          { lexeme = yytext(); return CH;
          }
        case 42: break;
        case 20: 
          { lexeme = yytext(); return PARAM;
          }
        case 43: break;
        case 10: 
          { lexeme = yytext(); return OPK;
          }
        case 44: break;
        case 14: 
          { lexeme = yytext(); return CLK;
          }
        case 45: break;
        case 15: 
          { lexeme = yytext(); return END;
          }
        case 46: break;
        case 29: 
          { lexeme = yytext(); return REPETE;
          }
        case 47: break;
        case 19: 
          { lexeme = yytext(); return INT;
          }
        case 48: break;
        case 25: 
          { lexeme = yytext(); return OPBOL;
          }
        case 49: break;
        case 22: 
          { lexeme = yytext(); return STOP;
          }
        case 50: break;
        case 17: 
          { lexeme = yytext(); return FBC;
          }
        case 51: break;
        case 16: 
          { lexeme = yytext(); return STR;
          }
        case 52: break;
        case 28: 
          { lexeme = yytext(); return COMENT;
          }
        case 53: break;
        case 21: 
          { lexeme = yytext(); return OPER;
          }
        case 54: break;
        case 11: 
          { lexeme = yytext(); return PFD;
          }
        case 55: break;
        case 23: 
          { lexeme = yytext(); return FUNC;
          }
        case 56: break;
        case 13: 
          { lexeme = yytext(); return CLC;
          }
        case 57: break;
        case 9: 
          { lexeme = yytext(); return OPC;
          }
        case 58: break;
        case 2: 
          { lexeme = yytext(); return NUM;
          }
        case 59: break;
        case 3: 
          { /*Ignore*/
          }
        case 60: break;
        case 5: 
          { lexeme = yytext(); return PF;
          }
        case 61: break;
        case 4: 
          { lexeme = yytext(); return ATRIB;
          }
        case 62: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
