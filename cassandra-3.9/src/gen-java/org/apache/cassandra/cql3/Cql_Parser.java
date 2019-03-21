// $ANTLR 3.5.2 Parser.g 2018-12-23 17:18:32

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.*;
    import org.apache.cassandra.config.ColumnDefinition;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.restrictions.CustomIndexExpression;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.selection.*;
    import org.apache.cassandra.cql3.functions.*;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Cql_Parser extends Parser {
	public static final int EOF=-1;
	public static final int T__176=176;
	public static final int T__177=177;
	public static final int T__178=178;
	public static final int T__179=179;
	public static final int T__180=180;
	public static final int T__181=181;
	public static final int T__182=182;
	public static final int T__183=183;
	public static final int T__184=184;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int T__191=191;
	public static final int T__192=192;
	public static final int T__193=193;
	public static final int T__194=194;
	public static final int T__195=195;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int E=11;
	public static final int EXPONENT=12;
	public static final int F=13;
	public static final int FLOAT=14;
	public static final int G=15;
	public static final int H=16;
	public static final int HEX=17;
	public static final int HEXNUMBER=18;
	public static final int I=19;
	public static final int IDENT=20;
	public static final int INTEGER=21;
	public static final int J=22;
	public static final int K=23;
	public static final int K_ADD=24;
	public static final int K_AGGREGATE=25;
	public static final int K_ALL=26;
	public static final int K_ALLOW=27;
	public static final int K_ALTER=28;
	public static final int K_AND=29;
	public static final int K_APPLY=30;
	public static final int K_AS=31;
	public static final int K_ASC=32;
	public static final int K_ASCII=33;
	public static final int K_AUTHORIZE=34;
	public static final int K_BATCH=35;
	public static final int K_BEGIN=36;
	public static final int K_BIGINT=37;
	public static final int K_BLOB=38;
	public static final int K_BOOLEAN=39;
	public static final int K_BY=40;
	public static final int K_CALLED=41;
	public static final int K_CAST=42;
	public static final int K_CLUSTERING=43;
	public static final int K_COLUMNFAMILY=44;
	public static final int K_COMPACT=45;
	public static final int K_CONTAINS=46;
	public static final int K_COUNT=47;
	public static final int K_COUNTER=48;
	public static final int K_CREATE=49;
	public static final int K_CUSTOM=50;
	public static final int K_DATE=51;
	public static final int K_DECIMAL=52;
	public static final int K_DELETE=53;
	public static final int K_DESC=54;
	public static final int K_DESCRIBE=55;
	public static final int K_DISTINCT=56;
	public static final int K_DOUBLE=57;
	public static final int K_DROP=58;
	public static final int K_ENTRIES=59;
	public static final int K_EXECUTE=60;
	public static final int K_EXISTS=61;
	public static final int K_FILTERING=62;
	public static final int K_FINALFUNC=63;
	public static final int K_FLOAT=64;
	public static final int K_FROM=65;
	public static final int K_FROZEN=66;
	public static final int K_FULL=67;
	public static final int K_FUNCTION=68;
	public static final int K_FUNCTIONS=69;
	public static final int K_GRANT=70;
	public static final int K_IF=71;
	public static final int K_IN=72;
	public static final int K_INDEX=73;
	public static final int K_INET=74;
	public static final int K_INFINITY=75;
	public static final int K_INITCOND=76;
	public static final int K_INPUT=77;
	public static final int K_INSERT=78;
	public static final int K_INT=79;
	public static final int K_INTO=80;
	public static final int K_IS=81;
	public static final int K_JSON=82;
	public static final int K_KEY=83;
	public static final int K_KEYS=84;
	public static final int K_KEYSPACE=85;
	public static final int K_KEYSPACES=86;
	public static final int K_LANGUAGE=87;
	public static final int K_LIKE=88;
	public static final int K_LIMIT=89;
	public static final int K_LIST=90;
	public static final int K_LOGIN=91;
	public static final int K_MAP=92;
	public static final int K_MATERIALIZED=93;
	public static final int K_MBEAN=94;
	public static final int K_MBEANS=95;
	public static final int K_MODIFY=96;
	public static final int K_NAN=97;
	public static final int K_NOLOGIN=98;
	public static final int K_NORECURSIVE=99;
	public static final int K_NOSUPERUSER=100;
	public static final int K_NOT=101;
	public static final int K_NULL=102;
	public static final int K_OF=103;
	public static final int K_ON=104;
	public static final int K_OPTIONS=105;
	public static final int K_OR=106;
	public static final int K_ORDER=107;
	public static final int K_PARTITION=108;
	public static final int K_PASSWORD=109;
	public static final int K_PER=110;
	public static final int K_PERMISSION=111;
	public static final int K_PERMISSIONS=112;
	public static final int K_PRIMARY=113;
	public static final int K_RENAME=114;
	public static final int K_REPLACE=115;
	public static final int K_RETURNS=116;
	public static final int K_REVOKE=117;
	public static final int K_ROLE=118;
	public static final int K_ROLES=119;
	public static final int K_SELECT=120;
	public static final int K_SET=121;
	public static final int K_SFUNC=122;
	public static final int K_SMALLINT=123;
	public static final int K_STATIC=124;
	public static final int K_STORAGE=125;
	public static final int K_STYPE=126;
	public static final int K_SUPERUSER=127;
	public static final int K_TEXT=128;
	public static final int K_TIME=129;
	public static final int K_TIMESTAMP=130;
	public static final int K_TIMEUUID=131;
	public static final int K_TINYINT=132;
	public static final int K_TO=133;
	public static final int K_TOKEN=134;
	public static final int K_TRIGGER=135;
	public static final int K_TRUNCATE=136;
	public static final int K_TTL=137;
	public static final int K_TUPLE=138;
	public static final int K_TYPE=139;
	public static final int K_UNLOGGED=140;
	public static final int K_UPDATE=141;
	public static final int K_USE=142;
	public static final int K_USER=143;
	public static final int K_USERS=144;
	public static final int K_USING=145;
	public static final int K_UUID=146;
	public static final int K_VALUES=147;
	public static final int K_VARCHAR=148;
	public static final int K_VARINT=149;
	public static final int K_VIEW=150;
	public static final int K_WHERE=151;
	public static final int K_WITH=152;
	public static final int K_WRITETIME=153;
	public static final int L=154;
	public static final int LETTER=155;
	public static final int M=156;
	public static final int MULTILINE_COMMENT=157;
	public static final int N=158;
	public static final int O=159;
	public static final int P=160;
	public static final int Q=161;
	public static final int QMARK=162;
	public static final int QUOTED_NAME=163;
	public static final int R=164;
	public static final int S=165;
	public static final int STRING_LITERAL=166;
	public static final int T=167;
	public static final int U=168;
	public static final int UUID=169;
	public static final int V=170;
	public static final int W=171;
	public static final int WS=172;
	public static final int X=173;
	public static final int Y=174;
	public static final int Z=175;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CqlParser gCql;
	public CqlParser gParent;


	public Cql_Parser(TokenStream input, CqlParser gCql) {
		this(input, new RecognizerSharedState(), gCql);
	}
	public Cql_Parser(TokenStream input, RecognizerSharedState state, CqlParser gCql) {
		super(input, state);
		this.gCql = gCql;
		gParent = gCql;
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Parser.g"; }


	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();
	    protected final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

	    public static final Set<String> reservedTypeNames = new HashSet<String>()
	    {{
	        add("byte");
	        add("complex");
	        add("enum");
	        add("date");
	        add("interval");
	        add("macaddr");
	        add("bitstring");
	    }};

	    public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
	    {
	        Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
	    {
	        Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Json.Marker newJsonBindVariables(ColumnIdentifier name)
	    {
	        Json.Marker marker = new Json.Marker(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }

	    protected void addRecognitionError(String msg)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, msg);
	    }

	    public Map<String, String> convertPropertyMap(Maps.Literal map)
	    {
	        if (map == null || map.entries == null || map.entries.isEmpty())
	            return Collections.<String, String>emptyMap();

	        Map<String, String> res = new HashMap<>(map.entries.size());

	        for (Pair<Term.Raw, Term.Raw> entry : map.entries)
	        {
	            // Because the parser tries to be smart and recover on error (to
	            // allow displaying more than one error I suppose), we have null
	            // entries in there. Just skip those, a proper error will be thrown in the end.
	            if (entry.left == null || entry.right == null)
	                break;

	            if (!(entry.left instanceof Constants.Literal))
	            {
	                String msg = "Invalid property name: " + entry.left;
	                if (entry.left instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }
	            if (!(entry.right instanceof Constants.Literal))
	            {
	                String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
	                if (entry.right instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }

	            res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
	        }

	        return res;
	    }

	    public void addRawUpdate(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, Operation.RawUpdate update)
	    {
	        for (Pair<ColumnDefinition.Raw, Operation.RawUpdate> p : operations)
	        {
	            if (p.left.equals(key) && !p.right.isCompatibleWith(update))
	                addRecognitionError("Multiple incompatible setting of column " + key);
	        }
	        operations.add(Pair.create(key, update));
	    }

	    public Set<Permission> filterPermissions(Set<Permission> permissions, IResource resource)
	    {
	        if (resource == null)
	            return Collections.emptySet();
	        Set<Permission> filtered = new HashSet<>(permissions);
	        filtered.retainAll(resource.applicablePermissions());
	        if (filtered.isEmpty())
	            addRecognitionError("Resource type " + resource.getClass().getSimpleName() +
	                                    " does not support any of the requested permissions");

	        return filtered;
	    }

	    public String canonicalizeObjectName(String s, boolean enforcePattern)
	    {
	        // these two conditions are here because technically they are valid
	        // ObjectNames, but we want to restrict their use without adding unnecessary
	        // work to JMXResource construction as that also happens on hotter code paths
	        if ("".equals(s))
	            addRecognitionError("Empty JMX object name supplied");

	        if ("*:*".equals(s))
	            addRecognitionError("Please use ALL MBEANS instead of wildcard pattern");

	        try
	        {
	            javax.management.ObjectName objectName = javax.management.ObjectName.getInstance(s);
	            if (enforcePattern && !objectName.isPattern())
	                addRecognitionError("Plural form used, but non-pattern JMX object name specified (" + s + ")");
	            return objectName.getCanonicalName();
	        }
	        catch (javax.management.MalformedObjectNameException e)
	        {
	          addRecognitionError(s + " is not a valid JMX object name");
	          return s;
	        }
	    }




	// $ANTLR start "cqlStatement"
	// Parser.g:188:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );
	public final ParsedStatement cqlStatement() throws RecognitionException {
		ParsedStatement stmt = null;


		SelectStatement.RawStatement st1 =null;
		ModificationStatement.Parsed st2 =null;
		UpdateStatement.ParsedUpdate st3 =null;
		BatchStatement.Parsed st4 =null;
		DeleteStatement.Parsed st5 =null;
		UseStatement st6 =null;
		TruncateStatement st7 =null;
		CreateKeyspaceStatement st8 =null;
		CreateTableStatement.RawStatement st9 =null;
		CreateIndexStatement st10 =null;
		DropKeyspaceStatement st11 =null;
		DropTableStatement st12 =null;
		DropIndexStatement st13 =null;
		AlterTableStatement st14 =null;
		AlterKeyspaceStatement st15 =null;
		GrantPermissionsStatement st16 =null;
		RevokePermissionsStatement st17 =null;
		ListPermissionsStatement st18 =null;
		CreateRoleStatement st19 =null;
		AlterRoleStatement st20 =null;
		DropRoleStatement st21 =null;
		ListRolesStatement st22 =null;
		CreateTriggerStatement st23 =null;
		DropTriggerStatement st24 =null;
		CreateTypeStatement st25 =null;
		AlterTypeStatement st26 =null;
		DropTypeStatement st27 =null;
		CreateFunctionStatement st28 =null;
		DropFunctionStatement st29 =null;
		CreateAggregateStatement st30 =null;
		DropAggregateStatement st31 =null;
		CreateRoleStatement st32 =null;
		AlterRoleStatement st33 =null;
		DropRoleStatement st34 =null;
		ListRolesStatement st35 =null;
		GrantRoleStatement st36 =null;
		RevokeRoleStatement st37 =null;
		CreateViewStatement st38 =null;
		DropViewStatement st39 =null;
		AlterViewStatement st40 =null;

		try {
			// Parser.g:190:5: (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement )
			int alt1=40;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// Parser.g:190:7: st1= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_cqlStatement59);
					st1=selectStatement();
					state._fsp--;

					 stmt = st1; 
					}
					break;
				case 2 :
					// Parser.g:191:7: st2= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_cqlStatement88);
					st2=insertStatement();
					state._fsp--;

					 stmt = st2; 
					}
					break;
				case 3 :
					// Parser.g:192:7: st3= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_cqlStatement117);
					st3=updateStatement();
					state._fsp--;

					 stmt = st3; 
					}
					break;
				case 4 :
					// Parser.g:193:7: st4= batchStatement
					{
					pushFollow(FOLLOW_batchStatement_in_cqlStatement146);
					st4=batchStatement();
					state._fsp--;

					 stmt = st4; 
					}
					break;
				case 5 :
					// Parser.g:194:7: st5= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_cqlStatement176);
					st5=deleteStatement();
					state._fsp--;

					 stmt = st5; 
					}
					break;
				case 6 :
					// Parser.g:195:7: st6= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_cqlStatement205);
					st6=useStatement();
					state._fsp--;

					 stmt = st6; 
					}
					break;
				case 7 :
					// Parser.g:196:7: st7= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_cqlStatement237);
					st7=truncateStatement();
					state._fsp--;

					 stmt = st7; 
					}
					break;
				case 8 :
					// Parser.g:197:7: st8= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement264);
					st8=createKeyspaceStatement();
					state._fsp--;

					 stmt = st8; 
					}
					break;
				case 9 :
					// Parser.g:198:7: st9= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_cqlStatement285);
					st9=createTableStatement();
					state._fsp--;

					 stmt = st9; 
					}
					break;
				case 10 :
					// Parser.g:199:7: st10= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_cqlStatement308);
					st10=createIndexStatement();
					state._fsp--;

					 stmt = st10; 
					}
					break;
				case 11 :
					// Parser.g:200:7: st11= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement331);
					st11=dropKeyspaceStatement();
					state._fsp--;

					 stmt = st11; 
					}
					break;
				case 12 :
					// Parser.g:201:7: st12= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_cqlStatement353);
					st12=dropTableStatement();
					state._fsp--;

					 stmt = st12; 
					}
					break;
				case 13 :
					// Parser.g:202:7: st13= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement378);
					st13=dropIndexStatement();
					state._fsp--;

					 stmt = st13; 
					}
					break;
				case 14 :
					// Parser.g:203:7: st14= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_cqlStatement403);
					st14=alterTableStatement();
					state._fsp--;

					 stmt = st14; 
					}
					break;
				case 15 :
					// Parser.g:204:7: st15= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement427);
					st15=alterKeyspaceStatement();
					state._fsp--;

					 stmt = st15; 
					}
					break;
				case 16 :
					// Parser.g:205:7: st16= grantPermissionsStatement
					{
					pushFollow(FOLLOW_grantPermissionsStatement_in_cqlStatement448);
					st16=grantPermissionsStatement();
					state._fsp--;

					 stmt = st16; 
					}
					break;
				case 17 :
					// Parser.g:206:7: st17= revokePermissionsStatement
					{
					pushFollow(FOLLOW_revokePermissionsStatement_in_cqlStatement466);
					st17=revokePermissionsStatement();
					state._fsp--;

					 stmt = st17; 
					}
					break;
				case 18 :
					// Parser.g:207:7: st18= listPermissionsStatement
					{
					pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement483);
					st18=listPermissionsStatement();
					state._fsp--;

					 stmt = st18; 
					}
					break;
				case 19 :
					// Parser.g:208:7: st19= createUserStatement
					{
					pushFollow(FOLLOW_createUserStatement_in_cqlStatement502);
					st19=createUserStatement();
					state._fsp--;

					 stmt = st19; 
					}
					break;
				case 20 :
					// Parser.g:209:7: st20= alterUserStatement
					{
					pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
					st20=alterUserStatement();
					state._fsp--;

					 stmt = st20; 
					}
					break;
				case 21 :
					// Parser.g:210:7: st21= dropUserStatement
					{
					pushFollow(FOLLOW_dropUserStatement_in_cqlStatement551);
					st21=dropUserStatement();
					state._fsp--;

					 stmt = st21; 
					}
					break;
				case 22 :
					// Parser.g:211:7: st22= listUsersStatement
					{
					pushFollow(FOLLOW_listUsersStatement_in_cqlStatement577);
					st22=listUsersStatement();
					state._fsp--;

					 stmt = st22; 
					}
					break;
				case 23 :
					// Parser.g:212:7: st23= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement602);
					st23=createTriggerStatement();
					state._fsp--;

					 stmt = st23; 
					}
					break;
				case 24 :
					// Parser.g:213:7: st24= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement623);
					st24=dropTriggerStatement();
					state._fsp--;

					 stmt = st24; 
					}
					break;
				case 25 :
					// Parser.g:214:7: st25= createTypeStatement
					{
					pushFollow(FOLLOW_createTypeStatement_in_cqlStatement646);
					st25=createTypeStatement();
					state._fsp--;

					 stmt = st25; 
					}
					break;
				case 26 :
					// Parser.g:215:7: st26= alterTypeStatement
					{
					pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement670);
					st26=alterTypeStatement();
					state._fsp--;

					 stmt = st26; 
					}
					break;
				case 27 :
					// Parser.g:216:7: st27= dropTypeStatement
					{
					pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement695);
					st27=dropTypeStatement();
					state._fsp--;

					 stmt = st27; 
					}
					break;
				case 28 :
					// Parser.g:217:7: st28= createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_cqlStatement721);
					st28=createFunctionStatement();
					state._fsp--;

					 stmt = st28; 
					}
					break;
				case 29 :
					// Parser.g:218:7: st29= dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_cqlStatement741);
					st29=dropFunctionStatement();
					state._fsp--;

					 stmt = st29; 
					}
					break;
				case 30 :
					// Parser.g:219:7: st30= createAggregateStatement
					{
					pushFollow(FOLLOW_createAggregateStatement_in_cqlStatement763);
					st30=createAggregateStatement();
					state._fsp--;

					 stmt = st30; 
					}
					break;
				case 31 :
					// Parser.g:220:7: st31= dropAggregateStatement
					{
					pushFollow(FOLLOW_dropAggregateStatement_in_cqlStatement782);
					st31=dropAggregateStatement();
					state._fsp--;

					 stmt = st31; 
					}
					break;
				case 32 :
					// Parser.g:221:7: st32= createRoleStatement
					{
					pushFollow(FOLLOW_createRoleStatement_in_cqlStatement803);
					st32=createRoleStatement();
					state._fsp--;

					 stmt = st32; 
					}
					break;
				case 33 :
					// Parser.g:222:7: st33= alterRoleStatement
					{
					pushFollow(FOLLOW_alterRoleStatement_in_cqlStatement827);
					st33=alterRoleStatement();
					state._fsp--;

					 stmt = st33; 
					}
					break;
				case 34 :
					// Parser.g:223:7: st34= dropRoleStatement
					{
					pushFollow(FOLLOW_dropRoleStatement_in_cqlStatement852);
					st34=dropRoleStatement();
					state._fsp--;

					 stmt = st34; 
					}
					break;
				case 35 :
					// Parser.g:224:7: st35= listRolesStatement
					{
					pushFollow(FOLLOW_listRolesStatement_in_cqlStatement878);
					st35=listRolesStatement();
					state._fsp--;

					 stmt = st35; 
					}
					break;
				case 36 :
					// Parser.g:225:7: st36= grantRoleStatement
					{
					pushFollow(FOLLOW_grantRoleStatement_in_cqlStatement903);
					st36=grantRoleStatement();
					state._fsp--;

					 stmt = st36; 
					}
					break;
				case 37 :
					// Parser.g:226:7: st37= revokeRoleStatement
					{
					pushFollow(FOLLOW_revokeRoleStatement_in_cqlStatement928);
					st37=revokeRoleStatement();
					state._fsp--;

					 stmt = st37; 
					}
					break;
				case 38 :
					// Parser.g:227:7: st38= createMaterializedViewStatement
					{
					pushFollow(FOLLOW_createMaterializedViewStatement_in_cqlStatement952);
					st38=createMaterializedViewStatement();
					state._fsp--;

					 stmt = st38; 
					}
					break;
				case 39 :
					// Parser.g:228:7: st39= dropMaterializedViewStatement
					{
					pushFollow(FOLLOW_dropMaterializedViewStatement_in_cqlStatement964);
					st39=dropMaterializedViewStatement();
					state._fsp--;

					 stmt = st39; 
					}
					break;
				case 40 :
					// Parser.g:229:7: st40= alterMaterializedViewStatement
					{
					pushFollow(FOLLOW_alterMaterializedViewStatement_in_cqlStatement978);
					st40=alterMaterializedViewStatement();
					state._fsp--;

					 stmt = st40; 
					}
					break;

			}
			 if (stmt != null) stmt.setBoundVariables(bindVariables); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "cqlStatement"



	// $ANTLR start "useStatement"
	// Parser.g:235:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement stmt = null;


		String ks =null;

		try {
			// Parser.g:236:5: ( K_USE ks= keyspaceName )
			// Parser.g:236:7: K_USE ks= keyspaceName
			{
			match(input,K_USE,FOLLOW_K_USE_in_useStatement1004); 
			pushFollow(FOLLOW_keyspaceName_in_useStatement1008);
			ks=keyspaceName();
			state._fsp--;

			 stmt = new UseStatement(ks); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "selectStatement"
	// Parser.g:245:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
	public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
		SelectStatement.RawStatement expr = null;


		List<RawSelector> sclause =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		Term.Raw rows =null;


		        boolean isDistinct = false;
		        Term.Raw limit = null;
		        Term.Raw perPartitionLimit = null;
		        Map<ColumnDefinition.Raw, Boolean> orderings = new LinkedHashMap<>();
		        boolean allowFiltering = false;
		        boolean isJson = false;
		    
		try {
			// Parser.g:254:5: ( K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
			// Parser.g:254:7: K_SELECT ( K_JSON )? ( ( K_DISTINCT )? sclause= selectClause ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_PER K_PARTITION K_LIMIT rows= intValue )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
			{
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement1042); 
			// Parser.g:255:7: ( K_JSON )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==K_JSON) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==BOOLEAN||LA2_1==FLOAT||LA2_1==HEXNUMBER||(LA2_1 >= IDENT && LA2_1 <= INTEGER)||(LA2_1 >= K_AGGREGATE && LA2_1 <= K_ALL)||LA2_1==K_ASCII||(LA2_1 >= K_BIGINT && LA2_1 <= K_BOOLEAN)||(LA2_1 >= K_CALLED && LA2_1 <= K_CLUSTERING)||(LA2_1 >= K_COMPACT && LA2_1 <= K_COUNTER)||(LA2_1 >= K_CUSTOM && LA2_1 <= K_DECIMAL)||(LA2_1 >= K_DISTINCT && LA2_1 <= K_DOUBLE)||(LA2_1 >= K_EXISTS && LA2_1 <= K_FLOAT)||LA2_1==K_FROZEN||(LA2_1 >= K_FUNCTION && LA2_1 <= K_FUNCTIONS)||(LA2_1 >= K_INET && LA2_1 <= K_INPUT)||LA2_1==K_INT||(LA2_1 >= K_JSON && LA2_1 <= K_KEYS)||(LA2_1 >= K_KEYSPACES && LA2_1 <= K_LIKE)||(LA2_1 >= K_LIST && LA2_1 <= K_MAP)||(LA2_1 >= K_NAN && LA2_1 <= K_NOLOGIN)||LA2_1==K_NOSUPERUSER||LA2_1==K_NULL||LA2_1==K_OPTIONS||(LA2_1 >= K_PARTITION && LA2_1 <= K_PERMISSIONS)||LA2_1==K_RETURNS||(LA2_1 >= K_ROLE && LA2_1 <= K_ROLES)||(LA2_1 >= K_SFUNC && LA2_1 <= K_TINYINT)||(LA2_1 >= K_TOKEN && LA2_1 <= K_TRIGGER)||(LA2_1 >= K_TTL && LA2_1 <= K_TYPE)||(LA2_1 >= K_USER && LA2_1 <= K_USERS)||(LA2_1 >= K_UUID && LA2_1 <= K_VARINT)||LA2_1==K_WRITETIME||(LA2_1 >= QMARK && LA2_1 <= QUOTED_NAME)||LA2_1==STRING_LITERAL||LA2_1==UUID||LA2_1==177||LA2_1==181||LA2_1==183||(LA2_1 >= 190 && LA2_1 <= 191)||LA2_1==194) ) {
					alt2=1;
				}
				else if ( (LA2_1==K_AS) ) {
					int LA2_4 = input.LA(3);
					if ( (LA2_4==K_FROM||LA2_4==177||LA2_4==180||LA2_4==182) ) {
						alt2=1;
					}
					else if ( (LA2_4==K_AS) ) {
						int LA2_5 = input.LA(4);
						if ( (LA2_5==IDENT||(LA2_5 >= K_AGGREGATE && LA2_5 <= K_ALL)||LA2_5==K_AS||LA2_5==K_ASCII||(LA2_5 >= K_BIGINT && LA2_5 <= K_BOOLEAN)||(LA2_5 >= K_CALLED && LA2_5 <= K_CLUSTERING)||(LA2_5 >= K_COMPACT && LA2_5 <= K_COUNTER)||(LA2_5 >= K_CUSTOM && LA2_5 <= K_DECIMAL)||(LA2_5 >= K_DISTINCT && LA2_5 <= K_DOUBLE)||(LA2_5 >= K_EXISTS && LA2_5 <= K_FLOAT)||LA2_5==K_FROZEN||(LA2_5 >= K_FUNCTION && LA2_5 <= K_FUNCTIONS)||LA2_5==K_INET||(LA2_5 >= K_INITCOND && LA2_5 <= K_INPUT)||LA2_5==K_INT||(LA2_5 >= K_JSON && LA2_5 <= K_KEYS)||(LA2_5 >= K_KEYSPACES && LA2_5 <= K_LIKE)||(LA2_5 >= K_LIST && LA2_5 <= K_MAP)||LA2_5==K_NOLOGIN||LA2_5==K_NOSUPERUSER||LA2_5==K_OPTIONS||(LA2_5 >= K_PARTITION && LA2_5 <= K_PERMISSIONS)||LA2_5==K_RETURNS||(LA2_5 >= K_ROLE && LA2_5 <= K_ROLES)||(LA2_5 >= K_SFUNC && LA2_5 <= K_TINYINT)||LA2_5==K_TRIGGER||(LA2_5 >= K_TTL && LA2_5 <= K_TYPE)||(LA2_5 >= K_USER && LA2_5 <= K_USERS)||(LA2_5 >= K_UUID && LA2_5 <= K_VARINT)||LA2_5==K_WRITETIME||LA2_5==QUOTED_NAME) ) {
							alt2=1;
						}
					}
				}
			}
			switch (alt2) {
				case 1 :
					// Parser.g:255:9: K_JSON
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_selectStatement1052); 
					 isJson = true; 
					}
					break;

			}

			// Parser.g:256:7: ( ( K_DISTINCT )? sclause= selectClause )
			// Parser.g:256:9: ( K_DISTINCT )? sclause= selectClause
			{
			// Parser.g:256:9: ( K_DISTINCT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==K_DISTINCT) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==BOOLEAN||LA3_1==FLOAT||LA3_1==HEXNUMBER||(LA3_1 >= IDENT && LA3_1 <= INTEGER)||(LA3_1 >= K_AGGREGATE && LA3_1 <= K_ALL)||LA3_1==K_ASCII||(LA3_1 >= K_BIGINT && LA3_1 <= K_BOOLEAN)||(LA3_1 >= K_CALLED && LA3_1 <= K_CLUSTERING)||(LA3_1 >= K_COMPACT && LA3_1 <= K_COUNTER)||(LA3_1 >= K_CUSTOM && LA3_1 <= K_DECIMAL)||(LA3_1 >= K_DISTINCT && LA3_1 <= K_DOUBLE)||(LA3_1 >= K_EXISTS && LA3_1 <= K_FLOAT)||LA3_1==K_FROZEN||(LA3_1 >= K_FUNCTION && LA3_1 <= K_FUNCTIONS)||(LA3_1 >= K_INET && LA3_1 <= K_INPUT)||LA3_1==K_INT||(LA3_1 >= K_JSON && LA3_1 <= K_KEYS)||(LA3_1 >= K_KEYSPACES && LA3_1 <= K_LIKE)||(LA3_1 >= K_LIST && LA3_1 <= K_MAP)||(LA3_1 >= K_NAN && LA3_1 <= K_NOLOGIN)||LA3_1==K_NOSUPERUSER||LA3_1==K_NULL||LA3_1==K_OPTIONS||(LA3_1 >= K_PARTITION && LA3_1 <= K_PERMISSIONS)||LA3_1==K_RETURNS||(LA3_1 >= K_ROLE && LA3_1 <= K_ROLES)||(LA3_1 >= K_SFUNC && LA3_1 <= K_TINYINT)||(LA3_1 >= K_TOKEN && LA3_1 <= K_TRIGGER)||(LA3_1 >= K_TTL && LA3_1 <= K_TYPE)||(LA3_1 >= K_USER && LA3_1 <= K_USERS)||(LA3_1 >= K_UUID && LA3_1 <= K_VARINT)||LA3_1==K_WRITETIME||(LA3_1 >= QMARK && LA3_1 <= QUOTED_NAME)||LA3_1==STRING_LITERAL||LA3_1==UUID||LA3_1==177||LA3_1==181||LA3_1==183||(LA3_1 >= 190 && LA3_1 <= 191)||LA3_1==194) ) {
					alt3=1;
				}
				else if ( (LA3_1==K_AS) ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4==K_FROM||LA3_4==177||LA3_4==180||LA3_4==182) ) {
						alt3=1;
					}
					else if ( (LA3_4==K_AS) ) {
						int LA3_5 = input.LA(4);
						if ( (LA3_5==IDENT||(LA3_5 >= K_AGGREGATE && LA3_5 <= K_ALL)||LA3_5==K_AS||LA3_5==K_ASCII||(LA3_5 >= K_BIGINT && LA3_5 <= K_BOOLEAN)||(LA3_5 >= K_CALLED && LA3_5 <= K_CLUSTERING)||(LA3_5 >= K_COMPACT && LA3_5 <= K_COUNTER)||(LA3_5 >= K_CUSTOM && LA3_5 <= K_DECIMAL)||(LA3_5 >= K_DISTINCT && LA3_5 <= K_DOUBLE)||(LA3_5 >= K_EXISTS && LA3_5 <= K_FLOAT)||LA3_5==K_FROZEN||(LA3_5 >= K_FUNCTION && LA3_5 <= K_FUNCTIONS)||LA3_5==K_INET||(LA3_5 >= K_INITCOND && LA3_5 <= K_INPUT)||LA3_5==K_INT||(LA3_5 >= K_JSON && LA3_5 <= K_KEYS)||(LA3_5 >= K_KEYSPACES && LA3_5 <= K_LIKE)||(LA3_5 >= K_LIST && LA3_5 <= K_MAP)||LA3_5==K_NOLOGIN||LA3_5==K_NOSUPERUSER||LA3_5==K_OPTIONS||(LA3_5 >= K_PARTITION && LA3_5 <= K_PERMISSIONS)||LA3_5==K_RETURNS||(LA3_5 >= K_ROLE && LA3_5 <= K_ROLES)||(LA3_5 >= K_SFUNC && LA3_5 <= K_TINYINT)||LA3_5==K_TRIGGER||(LA3_5 >= K_TTL && LA3_5 <= K_TYPE)||(LA3_5 >= K_USER && LA3_5 <= K_USERS)||(LA3_5 >= K_UUID && LA3_5 <= K_VARINT)||LA3_5==K_WRITETIME||LA3_5==QUOTED_NAME) ) {
							alt3=1;
						}
					}
				}
			}
			switch (alt3) {
				case 1 :
					// Parser.g:256:11: K_DISTINCT
					{
					match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectStatement1069); 
					 isDistinct = true; 
					}
					break;

			}

			pushFollow(FOLLOW_selectClause_in_selectStatement1078);
			sclause=selectClause();
			state._fsp--;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement1088); 
			pushFollow(FOLLOW_columnFamilyName_in_selectStatement1092);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:258:7: ( K_WHERE wclause= whereClause )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==K_WHERE) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Parser.g:258:9: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement1102); 
					pushFollow(FOLLOW_whereClause_in_selectStatement1106);
					wclause=whereClause();
					state._fsp--;

					}
					break;

			}

			// Parser.g:259:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==K_ORDER) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// Parser.g:259:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
					{
					match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement1119); 
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1121); 
					pushFollow(FOLLOW_orderByClause_in_selectStatement1123);
					orderByClause(orderings);
					state._fsp--;

					// Parser.g:259:47: ( ',' orderByClause[orderings] )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==180) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// Parser.g:259:49: ',' orderByClause[orderings]
							{
							match(input,180,FOLLOW_180_in_selectStatement1128); 
							pushFollow(FOLLOW_orderByClause_in_selectStatement1130);
							orderByClause(orderings);
							state._fsp--;

							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

			}

			// Parser.g:260:7: ( K_PER K_PARTITION K_LIMIT rows= intValue )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==K_PER) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Parser.g:260:9: K_PER K_PARTITION K_LIMIT rows= intValue
					{
					match(input,K_PER,FOLLOW_K_PER_in_selectStatement1147); 
					match(input,K_PARTITION,FOLLOW_K_PARTITION_in_selectStatement1149); 
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1151); 
					pushFollow(FOLLOW_intValue_in_selectStatement1155);
					rows=intValue();
					state._fsp--;

					 perPartitionLimit = rows; 
					}
					break;

			}

			// Parser.g:261:7: ( K_LIMIT rows= intValue )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==K_LIMIT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// Parser.g:261:9: K_LIMIT rows= intValue
					{
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1170); 
					pushFollow(FOLLOW_intValue_in_selectStatement1174);
					rows=intValue();
					state._fsp--;

					 limit = rows; 
					}
					break;

			}

			// Parser.g:262:7: ( K_ALLOW K_FILTERING )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==K_ALLOW) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Parser.g:262:9: K_ALLOW K_FILTERING
					{
					match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement1189); 
					match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement1191); 
					 allowFiltering = true; 
					}
					break;

			}


			          SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
			                                                                             isDistinct,
			                                                                             allowFiltering,
			                                                                             isJson);
			          WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			          expr = new SelectStatement.RawStatement(cf, params, sclause, where, limit, perPartitionLimit);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectStatement"



	// $ANTLR start "selectClause"
	// Parser.g:273:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
	public final List<RawSelector> selectClause() throws RecognitionException {
		List<RawSelector> expr = null;


		RawSelector t1 =null;
		RawSelector tN =null;

		try {
			// Parser.g:274:5: (t1= selector ( ',' tN= selector )* | '\\*' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BOOLEAN||LA11_0==FLOAT||LA11_0==HEXNUMBER||(LA11_0 >= IDENT && LA11_0 <= INTEGER)||(LA11_0 >= K_AGGREGATE && LA11_0 <= K_ALL)||LA11_0==K_AS||LA11_0==K_ASCII||(LA11_0 >= K_BIGINT && LA11_0 <= K_BOOLEAN)||(LA11_0 >= K_CALLED && LA11_0 <= K_CLUSTERING)||(LA11_0 >= K_COMPACT && LA11_0 <= K_COUNTER)||(LA11_0 >= K_CUSTOM && LA11_0 <= K_DECIMAL)||(LA11_0 >= K_DISTINCT && LA11_0 <= K_DOUBLE)||(LA11_0 >= K_EXISTS && LA11_0 <= K_FLOAT)||LA11_0==K_FROZEN||(LA11_0 >= K_FUNCTION && LA11_0 <= K_FUNCTIONS)||(LA11_0 >= K_INET && LA11_0 <= K_INPUT)||LA11_0==K_INT||(LA11_0 >= K_JSON && LA11_0 <= K_KEYS)||(LA11_0 >= K_KEYSPACES && LA11_0 <= K_LIKE)||(LA11_0 >= K_LIST && LA11_0 <= K_MAP)||(LA11_0 >= K_NAN && LA11_0 <= K_NOLOGIN)||LA11_0==K_NOSUPERUSER||LA11_0==K_NULL||LA11_0==K_OPTIONS||(LA11_0 >= K_PARTITION && LA11_0 <= K_PERMISSIONS)||LA11_0==K_RETURNS||(LA11_0 >= K_ROLE && LA11_0 <= K_ROLES)||(LA11_0 >= K_SFUNC && LA11_0 <= K_TINYINT)||(LA11_0 >= K_TOKEN && LA11_0 <= K_TRIGGER)||(LA11_0 >= K_TTL && LA11_0 <= K_TYPE)||(LA11_0 >= K_USER && LA11_0 <= K_USERS)||(LA11_0 >= K_UUID && LA11_0 <= K_VARINT)||LA11_0==K_WRITETIME||(LA11_0 >= QMARK && LA11_0 <= QUOTED_NAME)||LA11_0==STRING_LITERAL||LA11_0==UUID||LA11_0==177||LA11_0==181||LA11_0==183||LA11_0==190||LA11_0==194) ) {
				alt11=1;
			}
			else if ( (LA11_0==191) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// Parser.g:274:7: t1= selector ( ',' tN= selector )*
					{
					pushFollow(FOLLOW_selector_in_selectClause1228);
					t1=selector();
					state._fsp--;

					 expr = new ArrayList<RawSelector>(); expr.add(t1); 
					// Parser.g:274:76: ( ',' tN= selector )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==180) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Parser.g:274:77: ',' tN= selector
							{
							match(input,180,FOLLOW_180_in_selectClause1233); 
							pushFollow(FOLLOW_selector_in_selectClause1237);
							tN=selector();
							state._fsp--;

							 expr.add(tN); 
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;
				case 2 :
					// Parser.g:275:7: '\\*'
					{
					match(input,191,FOLLOW_191_in_selectClause1249); 
					 expr = Collections.<RawSelector>emptyList();
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectClause"



	// $ANTLR start "selector"
	// Parser.g:278:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= noncol_ident )? ;
	public final RawSelector selector() throws RecognitionException {
		RawSelector s = null;


		Selectable.Raw us =null;
		ColumnIdentifier c =null;

		 ColumnIdentifier alias = null; 
		try {
			// Parser.g:280:5: (us= unaliasedSelector ( K_AS c= noncol_ident )? )
			// Parser.g:280:7: us= unaliasedSelector ( K_AS c= noncol_ident )?
			{
			pushFollow(FOLLOW_unaliasedSelector_in_selector1282);
			us=unaliasedSelector();
			state._fsp--;

			// Parser.g:280:28: ( K_AS c= noncol_ident )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==K_AS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// Parser.g:280:29: K_AS c= noncol_ident
					{
					match(input,K_AS,FOLLOW_K_AS_in_selector1285); 
					pushFollow(FOLLOW_noncol_ident_in_selector1289);
					c=noncol_ident();
					state._fsp--;

					 alias = c; 
					}
					break;

			}

			 s = new RawSelector(us, alias); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selector"



	// $ANTLR start "unaliasedSelector"
	// Parser.g:287:1: unaliasedSelector returns [Selectable.Raw s] : (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= fident )* ;
	public final Selectable.Raw unaliasedSelector() throws RecognitionException {
		Selectable.Raw s = null;


		ColumnDefinition.Raw c =null;
		Term.Raw v =null;
		CQL3Type.Raw ct =null;
		Selectable.Raw sn =null;
		CQL3Type t =null;
		FunctionName f =null;
		List<Selectable.Raw> args =null;
		FieldIdentifier fi =null;

		 Selectable.Raw tmp = null; 
		try {
			// Parser.g:289:5: ( (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= fident )* )
			// Parser.g:289:8: (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= fident )*
			{
			// Parser.g:289:8: (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )
			int alt13=8;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// Parser.g:289:10: c= cident
					{
					pushFollow(FOLLOW_cident_in_unaliasedSelector1332);
					c=cident();
					state._fsp--;

					 tmp = c; 
					}
					break;
				case 2 :
					// Parser.g:290:10: v= value
					{
					pushFollow(FOLLOW_value_in_unaliasedSelector1380);
					v=value();
					state._fsp--;

					 tmp = new Selectable.WithTerm.Raw(v); 
					}
					break;
				case 3 :
					// Parser.g:291:10: '(' ct= comparatorType ')' v= value
					{
					match(input,177,FOLLOW_177_in_unaliasedSelector1427); 
					pushFollow(FOLLOW_comparatorType_in_unaliasedSelector1431);
					ct=comparatorType();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1433); 
					pushFollow(FOLLOW_value_in_unaliasedSelector1437);
					v=value();
					state._fsp--;

					 tmp = new Selectable.WithTerm.Raw(new TypeCast(ct, v)); 
					}
					break;
				case 4 :
					// Parser.g:292:10: K_COUNT '(' '\\*' ')'
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_unaliasedSelector1458); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1460); 
					match(input,191,FOLLOW_191_in_unaliasedSelector1462); 
					match(input,178,FOLLOW_178_in_unaliasedSelector1464); 
					 tmp = Selectable.WithFunction.Raw.newCountRowsFunction(); 
					}
					break;
				case 5 :
					// Parser.g:293:10: K_WRITETIME '(' c= cident ')'
					{
					match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector1498); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1500); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1504);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1506); 
					 tmp = new Selectable.WritetimeOrTTL.Raw(c, true); 
					}
					break;
				case 6 :
					// Parser.g:294:10: K_TTL '(' c= cident ')'
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1532); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1540); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1544);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1546); 
					 tmp = new Selectable.WritetimeOrTTL.Raw(c, false); 
					}
					break;
				case 7 :
					// Parser.g:295:10: K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')'
					{
					match(input,K_CAST,FOLLOW_K_CAST_in_unaliasedSelector1572); 
					match(input,177,FOLLOW_177_in_unaliasedSelector1579); 
					pushFollow(FOLLOW_unaliasedSelector_in_unaliasedSelector1583);
					sn=unaliasedSelector();
					state._fsp--;

					match(input,K_AS,FOLLOW_K_AS_in_unaliasedSelector1585); 
					pushFollow(FOLLOW_native_type_in_unaliasedSelector1589);
					t=native_type();
					state._fsp--;

					match(input,178,FOLLOW_178_in_unaliasedSelector1591); 
					tmp = new Selectable.WithCast.Raw(sn, t);
					}
					break;
				case 8 :
					// Parser.g:296:10: f= functionName args= selectionFunctionArgs
					{
					pushFollow(FOLLOW_functionName_in_unaliasedSelector1606);
					f=functionName();
					state._fsp--;

					pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1610);
					args=selectionFunctionArgs();
					state._fsp--;

					 tmp = new Selectable.WithFunction.Raw(f, args); 
					}
					break;

			}

			// Parser.g:297:10: ( '.' fi= fident )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==182) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Parser.g:297:12: '.' fi= fident
					{
					match(input,182,FOLLOW_182_in_unaliasedSelector1625); 
					pushFollow(FOLLOW_fident_in_unaliasedSelector1629);
					fi=fident();
					state._fsp--;

					 tmp = new Selectable.WithFieldSelection.Raw(tmp, fi); 
					}
					break;

				default :
					break loop14;
				}
			}

			 s = tmp; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unaliasedSelector"



	// $ANTLR start "selectionFunctionArgs"
	// Parser.g:300:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
	public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
		List<Selectable.Raw> a = null;


		Selectable.Raw s1 =null;
		Selectable.Raw sn =null;

		try {
			// Parser.g:301:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==177) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==178) ) {
					alt16=1;
				}
				else if ( (LA16_1==BOOLEAN||LA16_1==FLOAT||LA16_1==HEXNUMBER||(LA16_1 >= IDENT && LA16_1 <= INTEGER)||(LA16_1 >= K_AGGREGATE && LA16_1 <= K_ALL)||LA16_1==K_AS||LA16_1==K_ASCII||(LA16_1 >= K_BIGINT && LA16_1 <= K_BOOLEAN)||(LA16_1 >= K_CALLED && LA16_1 <= K_CLUSTERING)||(LA16_1 >= K_COMPACT && LA16_1 <= K_COUNTER)||(LA16_1 >= K_CUSTOM && LA16_1 <= K_DECIMAL)||(LA16_1 >= K_DISTINCT && LA16_1 <= K_DOUBLE)||(LA16_1 >= K_EXISTS && LA16_1 <= K_FLOAT)||LA16_1==K_FROZEN||(LA16_1 >= K_FUNCTION && LA16_1 <= K_FUNCTIONS)||(LA16_1 >= K_INET && LA16_1 <= K_INPUT)||LA16_1==K_INT||(LA16_1 >= K_JSON && LA16_1 <= K_KEYS)||(LA16_1 >= K_KEYSPACES && LA16_1 <= K_LIKE)||(LA16_1 >= K_LIST && LA16_1 <= K_MAP)||(LA16_1 >= K_NAN && LA16_1 <= K_NOLOGIN)||LA16_1==K_NOSUPERUSER||LA16_1==K_NULL||LA16_1==K_OPTIONS||(LA16_1 >= K_PARTITION && LA16_1 <= K_PERMISSIONS)||LA16_1==K_RETURNS||(LA16_1 >= K_ROLE && LA16_1 <= K_ROLES)||(LA16_1 >= K_SFUNC && LA16_1 <= K_TINYINT)||(LA16_1 >= K_TOKEN && LA16_1 <= K_TRIGGER)||(LA16_1 >= K_TTL && LA16_1 <= K_TYPE)||(LA16_1 >= K_USER && LA16_1 <= K_USERS)||(LA16_1 >= K_UUID && LA16_1 <= K_VARINT)||LA16_1==K_WRITETIME||(LA16_1 >= QMARK && LA16_1 <= QUOTED_NAME)||LA16_1==STRING_LITERAL||LA16_1==UUID||LA16_1==177||LA16_1==181||LA16_1==183||LA16_1==190||LA16_1==194) ) {
					alt16=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Parser.g:301:7: '(' ')'
					{
					match(input,177,FOLLOW_177_in_selectionFunctionArgs1657); 
					match(input,178,FOLLOW_178_in_selectionFunctionArgs1659); 
					 a = Collections.emptyList(); 
					}
					break;
				case 2 :
					// Parser.g:302:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
					{
					match(input,177,FOLLOW_177_in_selectionFunctionArgs1669); 
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1673);
					s1=unaliasedSelector();
					state._fsp--;

					 List<Selectable.Raw> args = new ArrayList<Selectable.Raw>(); args.add(s1); 
					// Parser.g:303:11: ( ',' sn= unaliasedSelector )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==180) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Parser.g:303:13: ',' sn= unaliasedSelector
							{
							match(input,180,FOLLOW_180_in_selectionFunctionArgs1689); 
							pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1693);
							sn=unaliasedSelector();
							state._fsp--;

							 args.add(sn); 
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,178,FOLLOW_178_in_selectionFunctionArgs1706); 
					 a = args; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return a;
	}
	// $ANTLR end "selectionFunctionArgs"



	// $ANTLR start "whereClause"
	// Parser.g:307:1: whereClause returns [WhereClause.Builder clause] : relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* ;
	public final WhereClause.Builder whereClause() throws RecognitionException {
		WhereClause.Builder clause = null;


		 clause = new WhereClause.Builder(); 
		try {
			// Parser.g:309:5: ( relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )* )
			// Parser.g:309:7: relationOrExpression[$clause] ( K_AND relationOrExpression[$clause] )*
			{
			pushFollow(FOLLOW_relationOrExpression_in_whereClause1737);
			relationOrExpression(clause);
			state._fsp--;

			// Parser.g:309:37: ( K_AND relationOrExpression[$clause] )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==K_AND) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Parser.g:309:38: K_AND relationOrExpression[$clause]
					{
					match(input,K_AND,FOLLOW_K_AND_in_whereClause1741); 
					pushFollow(FOLLOW_relationOrExpression_in_whereClause1743);
					relationOrExpression(clause);
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clause;
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "relationOrExpression"
	// Parser.g:312:1: relationOrExpression[WhereClause.Builder clause] : ( relation[$clause] | customIndexExpression[$clause] );
	public final void relationOrExpression(WhereClause.Builder clause) throws RecognitionException {
		try {
			// Parser.g:313:5: ( relation[$clause] | customIndexExpression[$clause] )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==IDENT||(LA18_0 >= K_AGGREGATE && LA18_0 <= K_ALL)||LA18_0==K_AS||LA18_0==K_ASCII||(LA18_0 >= K_BIGINT && LA18_0 <= K_BOOLEAN)||(LA18_0 >= K_CALLED && LA18_0 <= K_CLUSTERING)||(LA18_0 >= K_COMPACT && LA18_0 <= K_COUNTER)||(LA18_0 >= K_CUSTOM && LA18_0 <= K_DECIMAL)||(LA18_0 >= K_DISTINCT && LA18_0 <= K_DOUBLE)||(LA18_0 >= K_EXISTS && LA18_0 <= K_FLOAT)||LA18_0==K_FROZEN||(LA18_0 >= K_FUNCTION && LA18_0 <= K_FUNCTIONS)||LA18_0==K_INET||(LA18_0 >= K_INITCOND && LA18_0 <= K_INPUT)||LA18_0==K_INT||(LA18_0 >= K_JSON && LA18_0 <= K_KEYS)||(LA18_0 >= K_KEYSPACES && LA18_0 <= K_LIKE)||(LA18_0 >= K_LIST && LA18_0 <= K_MAP)||LA18_0==K_NOLOGIN||LA18_0==K_NOSUPERUSER||LA18_0==K_OPTIONS||(LA18_0 >= K_PARTITION && LA18_0 <= K_PERMISSIONS)||LA18_0==K_RETURNS||(LA18_0 >= K_ROLE && LA18_0 <= K_ROLES)||(LA18_0 >= K_SFUNC && LA18_0 <= K_TINYINT)||(LA18_0 >= K_TOKEN && LA18_0 <= K_TRIGGER)||(LA18_0 >= K_TTL && LA18_0 <= K_TYPE)||(LA18_0 >= K_USER && LA18_0 <= K_USERS)||(LA18_0 >= K_UUID && LA18_0 <= K_VARINT)||LA18_0==K_WRITETIME||LA18_0==QUOTED_NAME||LA18_0==177) ) {
				alt18=1;
			}
			else if ( (LA18_0==193) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Parser.g:313:7: relation[$clause]
					{
					pushFollow(FOLLOW_relation_in_relationOrExpression1765);
					relation(clause);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:314:7: customIndexExpression[$clause]
					{
					pushFollow(FOLLOW_customIndexExpression_in_relationOrExpression1774);
					customIndexExpression(clause);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relationOrExpression"



	// $ANTLR start "customIndexExpression"
	// Parser.g:317:1: customIndexExpression[WhereClause.Builder clause] : 'expr(' idxName[name] ',' t= term ')' ;
	public final void customIndexExpression(WhereClause.Builder clause) throws RecognitionException {
		Term.Raw t =null;

		IndexName name = new IndexName();
		try {
			// Parser.g:319:5: ( 'expr(' idxName[name] ',' t= term ')' )
			// Parser.g:319:7: 'expr(' idxName[name] ',' t= term ')'
			{
			match(input,193,FOLLOW_193_in_customIndexExpression1802); 
			pushFollow(FOLLOW_idxName_in_customIndexExpression1804);
			idxName(name);
			state._fsp--;

			match(input,180,FOLLOW_180_in_customIndexExpression1807); 
			pushFollow(FOLLOW_term_in_customIndexExpression1811);
			t=term();
			state._fsp--;

			match(input,178,FOLLOW_178_in_customIndexExpression1813); 
			 clause.add(new CustomIndexExpression(name, t));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "customIndexExpression"



	// $ANTLR start "orderByClause"
	// Parser.g:322:1: orderByClause[Map<ColumnDefinition.Raw, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
	public final void orderByClause(Map<ColumnDefinition.Raw, Boolean> orderings) throws RecognitionException {
		ColumnDefinition.Raw c =null;


		        boolean reversed = false;
		    
		try {
			// Parser.g:326:5: (c= cident ( K_ASC | K_DESC )? )
			// Parser.g:326:7: c= cident ( K_ASC | K_DESC )?
			{
			pushFollow(FOLLOW_cident_in_orderByClause1843);
			c=cident();
			state._fsp--;

			// Parser.g:326:16: ( K_ASC | K_DESC )?
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==K_ASC) ) {
				alt19=1;
			}
			else if ( (LA19_0==K_DESC) ) {
				alt19=2;
			}
			switch (alt19) {
				case 1 :
					// Parser.g:326:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1846); 
					}
					break;
				case 2 :
					// Parser.g:326:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1850); 
					 reversed = true; 
					}
					break;

			}

			 orderings.put(c, reversed); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orderByClause"



	// $ANTLR start "insertStatement"
	// Parser.g:335:1: insertStatement returns [ModificationStatement.Parsed expr] : K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) ;
	public final ModificationStatement.Parsed insertStatement() throws RecognitionException {
		ModificationStatement.Parsed expr = null;


		CFName cf =null;
		UpdateStatement.ParsedInsert st1 =null;
		UpdateStatement.ParsedInsertJson st2 =null;

		try {
			// Parser.g:336:5: ( K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] ) )
			// Parser.g:336:7: K_INSERT K_INTO cf= columnFamilyName (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			{
			match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1879); 
			match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1881); 
			pushFollow(FOLLOW_columnFamilyName_in_insertStatement1885);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:337:9: (st1= normalInsertStatement[cf] | K_JSON st2= jsonInsertStatement[cf] )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==177) ) {
				alt20=1;
			}
			else if ( (LA20_0==K_JSON) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// Parser.g:337:11: st1= normalInsertStatement[cf]
					{
					pushFollow(FOLLOW_normalInsertStatement_in_insertStatement1899);
					st1=normalInsertStatement(cf);
					state._fsp--;

					 expr = st1; 
					}
					break;
				case 2 :
					// Parser.g:338:11: K_JSON st2= jsonInsertStatement[cf]
					{
					match(input,K_JSON,FOLLOW_K_JSON_in_insertStatement1914); 
					pushFollow(FOLLOW_jsonInsertStatement_in_insertStatement1918);
					st2=jsonInsertStatement(cf);
					state._fsp--;

					 expr = st2; 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "insertStatement"



	// $ANTLR start "normalInsertStatement"
	// Parser.g:341:1: normalInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsert expr] : '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsert normalInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsert expr = null;


		ColumnDefinition.Raw c1 =null;
		ColumnDefinition.Raw cn =null;
		Term.Raw v1 =null;
		Term.Raw vn =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<ColumnDefinition.Raw> columnNames  = new ArrayList<>();
		        List<Term.Raw> values = new ArrayList<>();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:348:5: ( '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:348:7: '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			match(input,177,FOLLOW_177_in_normalInsertStatement1954); 
			pushFollow(FOLLOW_cident_in_normalInsertStatement1958);
			c1=cident();
			state._fsp--;

			 columnNames.add(c1); 
			// Parser.g:348:47: ( ',' cn= cident )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==180) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Parser.g:348:49: ',' cn= cident
					{
					match(input,180,FOLLOW_180_in_normalInsertStatement1965); 
					pushFollow(FOLLOW_cident_in_normalInsertStatement1969);
					cn=cident();
					state._fsp--;

					 columnNames.add(cn); 
					}
					break;

				default :
					break loop21;
				}
			}

			match(input,178,FOLLOW_178_in_normalInsertStatement1976); 
			match(input,K_VALUES,FOLLOW_K_VALUES_in_normalInsertStatement1984); 
			match(input,177,FOLLOW_177_in_normalInsertStatement1992); 
			pushFollow(FOLLOW_term_in_normalInsertStatement1996);
			v1=term();
			state._fsp--;

			 values.add(v1); 
			// Parser.g:350:39: ( ',' vn= term )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==180) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Parser.g:350:41: ',' vn= term
					{
					match(input,180,FOLLOW_180_in_normalInsertStatement2002); 
					pushFollow(FOLLOW_term_in_normalInsertStatement2006);
					vn=term();
					state._fsp--;

					 values.add(vn); 
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,178,FOLLOW_178_in_normalInsertStatement2013); 
			// Parser.g:351:7: ( K_IF K_NOT K_EXISTS )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==K_IF) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Parser.g:351:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_normalInsertStatement2023); 
					match(input,K_NOT,FOLLOW_K_NOT_in_normalInsertStatement2025); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_normalInsertStatement2027); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:352:7: ( usingClause[attrs] )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==K_USING) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Parser.g:352:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_normalInsertStatement2042);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}


			          expr = new UpdateStatement.ParsedInsert(cf, attrs, columnNames, values, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "normalInsertStatement"



	// $ANTLR start "jsonInsertStatement"
	// Parser.g:358:1: jsonInsertStatement[CFName cf] returns [UpdateStatement.ParsedInsertJson expr] : val= jsonValue ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsertJson jsonInsertStatement(CFName cf) throws RecognitionException {
		UpdateStatement.ParsedInsertJson expr = null;


		Json.Raw val =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:363:5: (val= jsonValue ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// Parser.g:363:7: val= jsonValue ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			pushFollow(FOLLOW_jsonValue_in_jsonInsertStatement2088);
			val=jsonValue();
			state._fsp--;

			// Parser.g:364:7: ( K_IF K_NOT K_EXISTS )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==K_IF) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Parser.g:364:9: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_jsonInsertStatement2098); 
					match(input,K_NOT,FOLLOW_K_NOT_in_jsonInsertStatement2100); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_jsonInsertStatement2102); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:365:7: ( usingClause[attrs] )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==K_USING) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Parser.g:365:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_jsonInsertStatement2117);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}


			          expr = new UpdateStatement.ParsedInsertJson(cf, attrs, val, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "jsonInsertStatement"



	// $ANTLR start "jsonValue"
	// Parser.g:371:1: jsonValue returns [Json.Raw value] : (|s= STRING_LITERAL | ':' id= noncol_ident | QMARK );
	public final Json.Raw jsonValue() throws RecognitionException {
		Json.Raw value = null;


		Token s=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:372:5: (|s= STRING_LITERAL | ':' id= noncol_ident | QMARK )
			int alt27=4;
			switch ( input.LA(1) ) {
			case EOF:
			case K_APPLY:
			case K_DELETE:
			case K_IF:
			case K_INSERT:
			case K_UPDATE:
			case K_USING:
			case 184:
				{
				alt27=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt27=2;
				}
				break;
			case 183:
				{
				alt27=3;
				}
				break;
			case QMARK:
				{
				alt27=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// Parser.g:373:5: 
					{
					}
					break;
				case 2 :
					// Parser.g:373:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_jsonValue2158); 
					 value = new Json.Literal((s!=null?s.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:374:7: ':' id= noncol_ident
					{
					match(input,183,FOLLOW_183_in_jsonValue2168); 
					pushFollow(FOLLOW_noncol_ident_in_jsonValue2172);
					id=noncol_ident();
					state._fsp--;

					 value = newJsonBindVariables(id); 
					}
					break;
				case 4 :
					// Parser.g:375:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_jsonValue2186); 
					 value = newJsonBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "jsonValue"



	// $ANTLR start "usingClause"
	// Parser.g:378:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
	public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
		try {
			// Parser.g:379:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
			// Parser.g:379:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClause2217); 
			pushFollow(FOLLOW_usingClauseObjective_in_usingClause2219);
			usingClauseObjective(attrs);
			state._fsp--;

			// Parser.g:379:43: ( K_AND usingClauseObjective[attrs] )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==K_AND) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Parser.g:379:45: K_AND usingClauseObjective[attrs]
					{
					match(input,K_AND,FOLLOW_K_AND_in_usingClause2224); 
					pushFollow(FOLLOW_usingClauseObjective_in_usingClause2226);
					usingClauseObjective(attrs);
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClause"



	// $ANTLR start "usingClauseObjective"
	// Parser.g:382:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
	public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;
		Term.Raw t =null;

		try {
			// Parser.g:383:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==K_TIMESTAMP) ) {
				alt29=1;
			}
			else if ( (LA29_0==K_TTL) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// Parser.g:383:7: K_TIMESTAMP ts= intValue
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective2248); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective2252);
					ts=intValue();
					state._fsp--;

					 attrs.timestamp = ts; 
					}
					break;
				case 2 :
					// Parser.g:384:7: K_TTL t= intValue
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective2262); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective2266);
					t=intValue();
					state._fsp--;

					 attrs.timeToLive = t; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseObjective"



	// $ANTLR start "updateStatement"
	// Parser.g:394:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
		UpdateStatement.ParsedUpdate expr = null;


		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations = new ArrayList<>();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:400:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:400:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement2300); 
			pushFollow(FOLLOW_columnFamilyName_in_updateStatement2304);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:401:7: ( usingClause[attrs] )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==K_USING) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Parser.g:401:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_updateStatement2314);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_SET,FOLLOW_K_SET_in_updateStatement2326); 
			pushFollow(FOLLOW_columnOperation_in_updateStatement2328);
			columnOperation(operations);
			state._fsp--;

			// Parser.g:402:41: ( ',' columnOperation[operations] )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==180) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// Parser.g:402:42: ',' columnOperation[operations]
					{
					match(input,180,FOLLOW_180_in_updateStatement2332); 
					pushFollow(FOLLOW_columnOperation_in_updateStatement2334);
					columnOperation(operations);
					state._fsp--;

					}
					break;

				default :
					break loop31;
				}
			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement2345); 
			pushFollow(FOLLOW_whereClause_in_updateStatement2349);
			wclause=whereClause();
			state._fsp--;

			// Parser.g:404:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==K_IF) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Parser.g:404:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_updateStatement2359); 
					// Parser.g:404:14: ( K_EXISTS |conditions= updateConditions )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==K_EXISTS) ) {
						int LA32_1 = input.LA(2);
						if ( (LA32_1==EOF||LA32_1==K_APPLY||LA32_1==K_DELETE||LA32_1==K_INSERT||LA32_1==K_UPDATE||LA32_1==184) ) {
							alt32=1;
						}
						else if ( (LA32_1==K_IN||LA32_1==176||LA32_1==182||(LA32_1 >= 185 && LA32_1 <= 190)) ) {
							alt32=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 32, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA32_0==IDENT||(LA32_0 >= K_AGGREGATE && LA32_0 <= K_ALL)||LA32_0==K_AS||LA32_0==K_ASCII||(LA32_0 >= K_BIGINT && LA32_0 <= K_BOOLEAN)||(LA32_0 >= K_CALLED && LA32_0 <= K_CLUSTERING)||(LA32_0 >= K_COMPACT && LA32_0 <= K_COUNTER)||(LA32_0 >= K_CUSTOM && LA32_0 <= K_DECIMAL)||(LA32_0 >= K_DISTINCT && LA32_0 <= K_DOUBLE)||(LA32_0 >= K_FILTERING && LA32_0 <= K_FLOAT)||LA32_0==K_FROZEN||(LA32_0 >= K_FUNCTION && LA32_0 <= K_FUNCTIONS)||LA32_0==K_INET||(LA32_0 >= K_INITCOND && LA32_0 <= K_INPUT)||LA32_0==K_INT||(LA32_0 >= K_JSON && LA32_0 <= K_KEYS)||(LA32_0 >= K_KEYSPACES && LA32_0 <= K_LIKE)||(LA32_0 >= K_LIST && LA32_0 <= K_MAP)||LA32_0==K_NOLOGIN||LA32_0==K_NOSUPERUSER||LA32_0==K_OPTIONS||(LA32_0 >= K_PARTITION && LA32_0 <= K_PERMISSIONS)||LA32_0==K_RETURNS||(LA32_0 >= K_ROLE && LA32_0 <= K_ROLES)||(LA32_0 >= K_SFUNC && LA32_0 <= K_TINYINT)||LA32_0==K_TRIGGER||(LA32_0 >= K_TTL && LA32_0 <= K_TYPE)||(LA32_0 >= K_USER && LA32_0 <= K_USERS)||(LA32_0 >= K_UUID && LA32_0 <= K_VARINT)||LA32_0==K_WRITETIME||LA32_0==QUOTED_NAME) ) {
						alt32=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// Parser.g:404:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement2363); 
							 ifExists = true; 
							}
							break;
						case 2 :
							// Parser.g:404:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_updateStatement2371);
							conditions=updateConditions();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


			          return new UpdateStatement.ParsedUpdate(cf,
			                                                  attrs,
			                                                  operations,
			                                                  wclause.build(),
			                                                  conditions == null ? Collections.<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                                  ifExists);
			     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "updateStatement"



	// $ANTLR start "updateConditions"
	// Parser.g:415:1: updateConditions returns [List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
	public final List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
		List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions = null;


		 conditions = new ArrayList<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>>(); 
		try {
			// Parser.g:417:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
			// Parser.g:417:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
			{
			pushFollow(FOLLOW_columnCondition_in_updateConditions2413);
			columnCondition(conditions);
			state._fsp--;

			// Parser.g:417:35: ( K_AND columnCondition[conditions] )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==K_AND) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Parser.g:417:37: K_AND columnCondition[conditions]
					{
					match(input,K_AND,FOLLOW_K_AND_in_updateConditions2418); 
					pushFollow(FOLLOW_columnCondition_in_updateConditions2420);
					columnCondition(conditions);
					state._fsp--;

					}
					break;

				default :
					break loop34;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return conditions;
	}
	// $ANTLR end "updateConditions"



	// $ANTLR start "deleteStatement"
	// Parser.g:428:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
		DeleteStatement.Parsed expr = null;


		List<Operation.RawDeletion> dels =null;
		CFName cf =null;
		WhereClause.Builder wclause =null;
		List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
		        boolean ifExists = false;
		    
		try {
			// Parser.g:434:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// Parser.g:434:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement2457); 
			// Parser.g:434:16: (dels= deleteSelection )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==IDENT||(LA35_0 >= K_AGGREGATE && LA35_0 <= K_ALL)||LA35_0==K_AS||LA35_0==K_ASCII||(LA35_0 >= K_BIGINT && LA35_0 <= K_BOOLEAN)||(LA35_0 >= K_CALLED && LA35_0 <= K_CLUSTERING)||(LA35_0 >= K_COMPACT && LA35_0 <= K_COUNTER)||(LA35_0 >= K_CUSTOM && LA35_0 <= K_DECIMAL)||(LA35_0 >= K_DISTINCT && LA35_0 <= K_DOUBLE)||(LA35_0 >= K_EXISTS && LA35_0 <= K_FLOAT)||LA35_0==K_FROZEN||(LA35_0 >= K_FUNCTION && LA35_0 <= K_FUNCTIONS)||LA35_0==K_INET||(LA35_0 >= K_INITCOND && LA35_0 <= K_INPUT)||LA35_0==K_INT||(LA35_0 >= K_JSON && LA35_0 <= K_KEYS)||(LA35_0 >= K_KEYSPACES && LA35_0 <= K_LIKE)||(LA35_0 >= K_LIST && LA35_0 <= K_MAP)||LA35_0==K_NOLOGIN||LA35_0==K_NOSUPERUSER||LA35_0==K_OPTIONS||(LA35_0 >= K_PARTITION && LA35_0 <= K_PERMISSIONS)||LA35_0==K_RETURNS||(LA35_0 >= K_ROLE && LA35_0 <= K_ROLES)||(LA35_0 >= K_SFUNC && LA35_0 <= K_TINYINT)||LA35_0==K_TRIGGER||(LA35_0 >= K_TTL && LA35_0 <= K_TYPE)||(LA35_0 >= K_USER && LA35_0 <= K_USERS)||(LA35_0 >= K_UUID && LA35_0 <= K_VARINT)||LA35_0==K_WRITETIME||LA35_0==QUOTED_NAME) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// Parser.g:434:18: dels= deleteSelection
					{
					pushFollow(FOLLOW_deleteSelection_in_deleteStatement2463);
					dels=deleteSelection();
					state._fsp--;

					 columnDeletions = dels; 
					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement2476); 
			pushFollow(FOLLOW_columnFamilyName_in_deleteStatement2480);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:436:7: ( usingClauseDelete[attrs] )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==K_USING) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Parser.g:436:9: usingClauseDelete[attrs]
					{
					pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement2490);
					usingClauseDelete(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement2502); 
			pushFollow(FOLLOW_whereClause_in_deleteStatement2506);
			wclause=whereClause();
			state._fsp--;

			// Parser.g:438:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==K_IF) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Parser.g:438:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_deleteStatement2516); 
					// Parser.g:438:14: ( K_EXISTS |conditions= updateConditions )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==K_EXISTS) ) {
						int LA37_1 = input.LA(2);
						if ( (LA37_1==EOF||LA37_1==K_APPLY||LA37_1==K_DELETE||LA37_1==K_INSERT||LA37_1==K_UPDATE||LA37_1==184) ) {
							alt37=1;
						}
						else if ( (LA37_1==K_IN||LA37_1==176||LA37_1==182||(LA37_1 >= 185 && LA37_1 <= 190)) ) {
							alt37=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 37, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA37_0==IDENT||(LA37_0 >= K_AGGREGATE && LA37_0 <= K_ALL)||LA37_0==K_AS||LA37_0==K_ASCII||(LA37_0 >= K_BIGINT && LA37_0 <= K_BOOLEAN)||(LA37_0 >= K_CALLED && LA37_0 <= K_CLUSTERING)||(LA37_0 >= K_COMPACT && LA37_0 <= K_COUNTER)||(LA37_0 >= K_CUSTOM && LA37_0 <= K_DECIMAL)||(LA37_0 >= K_DISTINCT && LA37_0 <= K_DOUBLE)||(LA37_0 >= K_FILTERING && LA37_0 <= K_FLOAT)||LA37_0==K_FROZEN||(LA37_0 >= K_FUNCTION && LA37_0 <= K_FUNCTIONS)||LA37_0==K_INET||(LA37_0 >= K_INITCOND && LA37_0 <= K_INPUT)||LA37_0==K_INT||(LA37_0 >= K_JSON && LA37_0 <= K_KEYS)||(LA37_0 >= K_KEYSPACES && LA37_0 <= K_LIKE)||(LA37_0 >= K_LIST && LA37_0 <= K_MAP)||LA37_0==K_NOLOGIN||LA37_0==K_NOSUPERUSER||LA37_0==K_OPTIONS||(LA37_0 >= K_PARTITION && LA37_0 <= K_PERMISSIONS)||LA37_0==K_RETURNS||(LA37_0 >= K_ROLE && LA37_0 <= K_ROLES)||(LA37_0 >= K_SFUNC && LA37_0 <= K_TINYINT)||LA37_0==K_TRIGGER||(LA37_0 >= K_TTL && LA37_0 <= K_TYPE)||(LA37_0 >= K_USER && LA37_0 <= K_USERS)||(LA37_0 >= K_UUID && LA37_0 <= K_VARINT)||LA37_0==K_WRITETIME||LA37_0==QUOTED_NAME) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// Parser.g:438:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement2520); 
							 ifExists = true; 
							}
							break;
						case 2 :
							// Parser.g:438:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_deleteStatement2528);
							conditions=updateConditions();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


			          return new DeleteStatement.Parsed(cf,
			                                            attrs,
			                                            columnDeletions,
			                                            wclause.build(),
			                                            conditions == null ? Collections.<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>>emptyList() : conditions,
			                                            ifExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "deleteSelection"
	// Parser.g:449:1: deleteSelection returns [List<Operation.RawDeletion> operations] :t1= deleteOp ( ',' tN= deleteOp )* ;
	public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
		List<Operation.RawDeletion> operations = null;


		Operation.RawDeletion t1 =null;
		Operation.RawDeletion tN =null;

		try {
			// Parser.g:450:5: (t1= deleteOp ( ',' tN= deleteOp )* )
			// Parser.g:450:7: t1= deleteOp ( ',' tN= deleteOp )*
			{
			 operations = new ArrayList<Operation.RawDeletion>(); 
			pushFollow(FOLLOW_deleteOp_in_deleteSelection2575);
			t1=deleteOp();
			state._fsp--;

			 operations.add(t1); 
			// Parser.g:452:11: ( ',' tN= deleteOp )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==180) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// Parser.g:452:12: ',' tN= deleteOp
					{
					match(input,180,FOLLOW_180_in_deleteSelection2590); 
					pushFollow(FOLLOW_deleteOp_in_deleteSelection2594);
					tN=deleteOp();
					state._fsp--;

					 operations.add(tN); 
					}
					break;

				default :
					break loop39;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "deleteSelection"



	// $ANTLR start "deleteOp"
	// Parser.g:455:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );
	public final Operation.RawDeletion deleteOp() throws RecognitionException {
		Operation.RawDeletion op = null;


		ColumnDefinition.Raw c =null;
		Term.Raw t =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:456:5: (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident )
			int alt40=3;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// Parser.g:456:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp2621);
					c=cident();
					state._fsp--;

					 op = new Operation.ColumnDeletion(c); 
					}
					break;
				case 2 :
					// Parser.g:457:7: c= cident '[' t= term ']'
					{
					pushFollow(FOLLOW_cident_in_deleteOp2648);
					c=cident();
					state._fsp--;

					match(input,190,FOLLOW_190_in_deleteOp2650); 
					pushFollow(FOLLOW_term_in_deleteOp2654);
					t=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_deleteOp2656); 
					 op = new Operation.ElementDeletion(c, t); 
					}
					break;
				case 3 :
					// Parser.g:458:7: c= cident '.' field= fident
					{
					pushFollow(FOLLOW_cident_in_deleteOp2668);
					c=cident();
					state._fsp--;

					match(input,182,FOLLOW_182_in_deleteOp2670); 
					pushFollow(FOLLOW_fident_in_deleteOp2674);
					field=fident();
					state._fsp--;

					 op = new Operation.FieldDeletion(c, field); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "deleteOp"



	// $ANTLR start "usingClauseDelete"
	// Parser.g:461:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
	public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;

		try {
			// Parser.g:462:5: ( K_USING K_TIMESTAMP ts= intValue )
			// Parser.g:462:7: K_USING K_TIMESTAMP ts= intValue
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete2694); 
			match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete2696); 
			pushFollow(FOLLOW_intValue_in_usingClauseDelete2700);
			ts=intValue();
			state._fsp--;

			 attrs.timestamp = ts; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usingClauseDelete"



	// $ANTLR start "batchStatement"
	// Parser.g:489:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
	public final BatchStatement.Parsed batchStatement() throws RecognitionException {
		BatchStatement.Parsed expr = null;


		ModificationStatement.Parsed s =null;


		        BatchStatement.Type type = BatchStatement.Type.LOGGED;
		        List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
		        Attributes.Raw attrs = new Attributes.Raw();
		    
		try {
			// Parser.g:495:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
			// Parser.g:495:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
			{
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement2734); 
			// Parser.g:496:7: ( K_UNLOGGED | K_COUNTER )?
			int alt41=3;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==K_UNLOGGED) ) {
				alt41=1;
			}
			else if ( (LA41_0==K_COUNTER) ) {
				alt41=2;
			}
			switch (alt41) {
				case 1 :
					// Parser.g:496:9: K_UNLOGGED
					{
					match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement2744); 
					 type = BatchStatement.Type.UNLOGGED; 
					}
					break;
				case 2 :
					// Parser.g:496:63: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement2750); 
					 type = BatchStatement.Type.COUNTER; 
					}
					break;

			}

			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2763); 
			// Parser.g:497:15: ( usingClause[attrs] )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_USING) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Parser.g:497:17: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_batchStatement2767);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			// Parser.g:498:11: (s= batchStatementObjective ( ';' )? )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==K_DELETE||LA44_0==K_INSERT||LA44_0==K_UPDATE) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// Parser.g:498:13: s= batchStatementObjective ( ';' )?
					{
					pushFollow(FOLLOW_batchStatementObjective_in_batchStatement2787);
					s=batchStatementObjective();
					state._fsp--;

					// Parser.g:498:39: ( ';' )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==184) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// Parser.g:498:39: ';'
							{
							match(input,184,FOLLOW_184_in_batchStatement2789); 
							}
							break;

					}

					 statements.add(s); 
					}
					break;

				default :
					break loop44;
				}
			}

			match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2803); 
			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2805); 

			          return new BatchStatement.Parsed(type, attrs, statements);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "batchStatement"



	// $ANTLR start "batchStatementObjective"
	// Parser.g:505:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement |u= updateStatement |d= deleteStatement );
	public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
		ModificationStatement.Parsed statement = null;


		ModificationStatement.Parsed i =null;
		UpdateStatement.ParsedUpdate u =null;
		DeleteStatement.Parsed d =null;

		try {
			// Parser.g:506:5: (i= insertStatement |u= updateStatement |d= deleteStatement )
			int alt45=3;
			switch ( input.LA(1) ) {
			case K_INSERT:
				{
				alt45=1;
				}
				break;
			case K_UPDATE:
				{
				alt45=2;
				}
				break;
			case K_DELETE:
				{
				alt45=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// Parser.g:506:7: i= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2836);
					i=insertStatement();
					state._fsp--;

					 statement = i; 
					}
					break;
				case 2 :
					// Parser.g:507:7: u= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2849);
					u=updateStatement();
					state._fsp--;

					 statement = u; 
					}
					break;
				case 3 :
					// Parser.g:508:7: d= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2862);
					d=deleteStatement();
					state._fsp--;

					 statement = d; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return statement;
	}
	// $ANTLR end "batchStatementObjective"



	// $ANTLR start "createAggregateStatement"
	// Parser.g:511:1: createAggregateStatement returns [CreateAggregateStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? ;
	public final CreateAggregateStatement createAggregateStatement() throws RecognitionException {
		CreateAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;
		String sfunc =null;
		CQL3Type.Raw stype =null;
		String ffunc =null;
		Term.Raw ival =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:518:5: ( K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )? )
			// Parser.g:518:7: K_CREATE ( K_OR K_REPLACE )? K_AGGREGATE ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' K_SFUNC sfunc= allowedFunctionName K_STYPE stype= comparatorType ( K_FINALFUNC ffunc= allowedFunctionName )? ( K_INITCOND ival= term )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createAggregateStatement2895); 
			// Parser.g:518:16: ( K_OR K_REPLACE )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==K_OR) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Parser.g:518:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createAggregateStatement2898); 
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createAggregateStatement2900); 
					 orReplace = true; 
					}
					break;

			}

			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_createAggregateStatement2912); 
			// Parser.g:520:7: ( K_IF K_NOT K_EXISTS )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==K_IF) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Parser.g:520:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createAggregateStatement2921); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createAggregateStatement2923); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createAggregateStatement2925); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createAggregateStatement2939);
			fn=functionName();
			state._fsp--;

			match(input,177,FOLLOW_177_in_createAggregateStatement2947); 
			// Parser.g:523:9: (v= comparatorType ( ',' v= comparatorType )* )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==IDENT||(LA49_0 >= K_AGGREGATE && LA49_0 <= K_ALL)||LA49_0==K_AS||LA49_0==K_ASCII||(LA49_0 >= K_BIGINT && LA49_0 <= K_BOOLEAN)||(LA49_0 >= K_CALLED && LA49_0 <= K_CLUSTERING)||(LA49_0 >= K_COMPACT && LA49_0 <= K_COUNTER)||(LA49_0 >= K_CUSTOM && LA49_0 <= K_DECIMAL)||(LA49_0 >= K_DISTINCT && LA49_0 <= K_DOUBLE)||(LA49_0 >= K_EXISTS && LA49_0 <= K_FLOAT)||LA49_0==K_FROZEN||(LA49_0 >= K_FUNCTION && LA49_0 <= K_FUNCTIONS)||LA49_0==K_INET||(LA49_0 >= K_INITCOND && LA49_0 <= K_INPUT)||LA49_0==K_INT||(LA49_0 >= K_JSON && LA49_0 <= K_KEYS)||(LA49_0 >= K_KEYSPACES && LA49_0 <= K_LIKE)||(LA49_0 >= K_LIST && LA49_0 <= K_MAP)||LA49_0==K_NOLOGIN||LA49_0==K_NOSUPERUSER||LA49_0==K_OPTIONS||(LA49_0 >= K_PARTITION && LA49_0 <= K_PERMISSIONS)||LA49_0==K_RETURNS||(LA49_0 >= K_ROLE && LA49_0 <= K_ROLES)||(LA49_0 >= K_SET && LA49_0 <= K_TINYINT)||LA49_0==K_TRIGGER||(LA49_0 >= K_TTL && LA49_0 <= K_TYPE)||(LA49_0 >= K_USER && LA49_0 <= K_USERS)||(LA49_0 >= K_UUID && LA49_0 <= K_VARINT)||LA49_0==K_WRITETIME||LA49_0==QUOTED_NAME||LA49_0==STRING_LITERAL) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// Parser.g:524:11: v= comparatorType ( ',' v= comparatorType )*
					{
					pushFollow(FOLLOW_comparatorType_in_createAggregateStatement2971);
					v=comparatorType();
					state._fsp--;

					 argsTypes.add(v); 
					// Parser.g:525:11: ( ',' v= comparatorType )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==180) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// Parser.g:525:13: ',' v= comparatorType
							{
							match(input,180,FOLLOW_180_in_createAggregateStatement2987); 
							pushFollow(FOLLOW_comparatorType_in_createAggregateStatement2991);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							}
							break;

						default :
							break loop48;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_createAggregateStatement3015); 
			match(input,K_SFUNC,FOLLOW_K_SFUNC_in_createAggregateStatement3023); 
			pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement3029);
			sfunc=allowedFunctionName();
			state._fsp--;

			match(input,K_STYPE,FOLLOW_K_STYPE_in_createAggregateStatement3037); 
			pushFollow(FOLLOW_comparatorType_in_createAggregateStatement3043);
			stype=comparatorType();
			state._fsp--;

			// Parser.g:530:7: ( K_FINALFUNC ffunc= allowedFunctionName )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==K_FINALFUNC) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Parser.g:531:9: K_FINALFUNC ffunc= allowedFunctionName
					{
					match(input,K_FINALFUNC,FOLLOW_K_FINALFUNC_in_createAggregateStatement3061); 
					pushFollow(FOLLOW_allowedFunctionName_in_createAggregateStatement3067);
					ffunc=allowedFunctionName();
					state._fsp--;

					}
					break;

			}

			// Parser.g:533:7: ( K_INITCOND ival= term )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==K_INITCOND) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Parser.g:534:9: K_INITCOND ival= term
					{
					match(input,K_INITCOND,FOLLOW_K_INITCOND_in_createAggregateStatement3094); 
					pushFollow(FOLLOW_term_in_createAggregateStatement3100);
					ival=term();
					state._fsp--;

					}
					break;

			}

			 expr = new CreateAggregateStatement(fn, argsTypes, sfunc, stype, ffunc, ival, orReplace, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createAggregateStatement"



	// $ANTLR start "dropAggregateStatement"
	// Parser.g:539:1: dropAggregateStatement returns [DropAggregateStatement expr] : K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropAggregateStatement dropAggregateStatement() throws RecognitionException {
		DropAggregateStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:545:5: ( K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:545:7: K_DROP K_AGGREGATE ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropAggregateStatement3147); 
			match(input,K_AGGREGATE,FOLLOW_K_AGGREGATE_in_dropAggregateStatement3149); 
			// Parser.g:546:7: ( K_IF K_EXISTS )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==K_IF) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// Parser.g:546:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropAggregateStatement3158); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropAggregateStatement3160); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropAggregateStatement3175);
			fn=functionName();
			state._fsp--;

			// Parser.g:548:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==177) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// Parser.g:549:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,177,FOLLOW_177_in_dropAggregateStatement3193); 
					// Parser.g:550:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==IDENT||(LA54_0 >= K_AGGREGATE && LA54_0 <= K_ALL)||LA54_0==K_AS||LA54_0==K_ASCII||(LA54_0 >= K_BIGINT && LA54_0 <= K_BOOLEAN)||(LA54_0 >= K_CALLED && LA54_0 <= K_CLUSTERING)||(LA54_0 >= K_COMPACT && LA54_0 <= K_COUNTER)||(LA54_0 >= K_CUSTOM && LA54_0 <= K_DECIMAL)||(LA54_0 >= K_DISTINCT && LA54_0 <= K_DOUBLE)||(LA54_0 >= K_EXISTS && LA54_0 <= K_FLOAT)||LA54_0==K_FROZEN||(LA54_0 >= K_FUNCTION && LA54_0 <= K_FUNCTIONS)||LA54_0==K_INET||(LA54_0 >= K_INITCOND && LA54_0 <= K_INPUT)||LA54_0==K_INT||(LA54_0 >= K_JSON && LA54_0 <= K_KEYS)||(LA54_0 >= K_KEYSPACES && LA54_0 <= K_LIKE)||(LA54_0 >= K_LIST && LA54_0 <= K_MAP)||LA54_0==K_NOLOGIN||LA54_0==K_NOSUPERUSER||LA54_0==K_OPTIONS||(LA54_0 >= K_PARTITION && LA54_0 <= K_PERMISSIONS)||LA54_0==K_RETURNS||(LA54_0 >= K_ROLE && LA54_0 <= K_ROLES)||(LA54_0 >= K_SET && LA54_0 <= K_TINYINT)||LA54_0==K_TRIGGER||(LA54_0 >= K_TTL && LA54_0 <= K_TYPE)||(LA54_0 >= K_USER && LA54_0 <= K_USERS)||(LA54_0 >= K_UUID && LA54_0 <= K_VARINT)||LA54_0==K_WRITETIME||LA54_0==QUOTED_NAME||LA54_0==STRING_LITERAL) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// Parser.g:551:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement3221);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:552:13: ( ',' v= comparatorType )*
							loop53:
							while (true) {
								int alt53=2;
								int LA53_0 = input.LA(1);
								if ( (LA53_0==180) ) {
									alt53=1;
								}

								switch (alt53) {
								case 1 :
									// Parser.g:552:15: ',' v= comparatorType
									{
									match(input,180,FOLLOW_180_in_dropAggregateStatement3239); 
									pushFollow(FOLLOW_comparatorType_in_dropAggregateStatement3243);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop53;
								}
							}

							}
							break;

					}

					match(input,178,FOLLOW_178_in_dropAggregateStatement3271); 
					 argsPresent = true; 
					}
					break;

			}

			 expr = new DropAggregateStatement(fn, argsTypes, argsPresent, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropAggregateStatement"



	// $ANTLR start "createFunctionStatement"
	// Parser.g:560:1: createFunctionStatement returns [CreateFunctionStatement expr] : K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL ;
	public final CreateFunctionStatement createFunctionStatement() throws RecognitionException {
		CreateFunctionStatement expr = null;


		Token language=null;
		Token body=null;
		FunctionName fn =null;
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		CQL3Type.Raw rt =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        List<ColumnIdentifier> argsNames = new ArrayList<>();
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean calledOnNullInput = false;
		    
		try {
			// Parser.g:569:5: ( K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL )
			// Parser.g:569:7: K_CREATE ( K_OR K_REPLACE )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )? ')' ( ( K_RETURNS K_NULL ) | ( K_CALLED ) ) K_ON K_NULL K_INPUT K_RETURNS rt= comparatorType K_LANGUAGE language= IDENT K_AS body= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createFunctionStatement3328); 
			// Parser.g:569:16: ( K_OR K_REPLACE )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==K_OR) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Parser.g:569:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createFunctionStatement3331); 
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createFunctionStatement3333); 
					 orReplace = true; 
					}
					break;

			}

			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_createFunctionStatement3345); 
			// Parser.g:571:7: ( K_IF K_NOT K_EXISTS )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==K_IF) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Parser.g:571:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createFunctionStatement3354); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createFunctionStatement3356); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createFunctionStatement3358); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createFunctionStatement3372);
			fn=functionName();
			state._fsp--;

			match(input,177,FOLLOW_177_in_createFunctionStatement3380); 
			// Parser.g:574:9: (k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )* )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==IDENT||(LA59_0 >= K_AGGREGATE && LA59_0 <= K_ALL)||LA59_0==K_AS||LA59_0==K_ASCII||(LA59_0 >= K_BIGINT && LA59_0 <= K_BOOLEAN)||(LA59_0 >= K_CALLED && LA59_0 <= K_CLUSTERING)||(LA59_0 >= K_COMPACT && LA59_0 <= K_COUNTER)||(LA59_0 >= K_CUSTOM && LA59_0 <= K_DECIMAL)||(LA59_0 >= K_DISTINCT && LA59_0 <= K_DOUBLE)||(LA59_0 >= K_EXISTS && LA59_0 <= K_FLOAT)||LA59_0==K_FROZEN||(LA59_0 >= K_FUNCTION && LA59_0 <= K_FUNCTIONS)||LA59_0==K_INET||(LA59_0 >= K_INITCOND && LA59_0 <= K_INPUT)||LA59_0==K_INT||(LA59_0 >= K_JSON && LA59_0 <= K_KEYS)||(LA59_0 >= K_KEYSPACES && LA59_0 <= K_LIKE)||(LA59_0 >= K_LIST && LA59_0 <= K_MAP)||LA59_0==K_NOLOGIN||LA59_0==K_NOSUPERUSER||LA59_0==K_OPTIONS||(LA59_0 >= K_PARTITION && LA59_0 <= K_PERMISSIONS)||LA59_0==K_RETURNS||(LA59_0 >= K_ROLE && LA59_0 <= K_ROLES)||(LA59_0 >= K_SFUNC && LA59_0 <= K_TINYINT)||LA59_0==K_TRIGGER||(LA59_0 >= K_TTL && LA59_0 <= K_TYPE)||(LA59_0 >= K_USER && LA59_0 <= K_USERS)||(LA59_0 >= K_UUID && LA59_0 <= K_VARINT)||LA59_0==K_WRITETIME||LA59_0==QUOTED_NAME) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// Parser.g:575:11: k= noncol_ident v= comparatorType ( ',' k= noncol_ident v= comparatorType )*
					{
					pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement3404);
					k=noncol_ident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3408);
					v=comparatorType();
					state._fsp--;

					 argsNames.add(k); argsTypes.add(v); 
					// Parser.g:576:11: ( ',' k= noncol_ident v= comparatorType )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==180) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// Parser.g:576:13: ',' k= noncol_ident v= comparatorType
							{
							match(input,180,FOLLOW_180_in_createFunctionStatement3424); 
							pushFollow(FOLLOW_noncol_ident_in_createFunctionStatement3428);
							k=noncol_ident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3432);
							v=comparatorType();
							state._fsp--;

							 argsNames.add(k); argsTypes.add(v); 
							}
							break;

						default :
							break loop58;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_createFunctionStatement3456); 
			// Parser.g:579:7: ( ( K_RETURNS K_NULL ) | ( K_CALLED ) )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==K_RETURNS) ) {
				alt60=1;
			}
			else if ( (LA60_0==K_CALLED) ) {
				alt60=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// Parser.g:579:9: ( K_RETURNS K_NULL )
					{
					// Parser.g:579:9: ( K_RETURNS K_NULL )
					// Parser.g:579:10: K_RETURNS K_NULL
					{
					match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement3467); 
					match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement3469); 
					}

					}
					break;
				case 2 :
					// Parser.g:579:30: ( K_CALLED )
					{
					// Parser.g:579:30: ( K_CALLED )
					// Parser.g:579:31: K_CALLED
					{
					match(input,K_CALLED,FOLLOW_K_CALLED_in_createFunctionStatement3475); 
					 calledOnNullInput=true; 
					}

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createFunctionStatement3481); 
			match(input,K_NULL,FOLLOW_K_NULL_in_createFunctionStatement3483); 
			match(input,K_INPUT,FOLLOW_K_INPUT_in_createFunctionStatement3485); 
			match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement3493); 
			pushFollow(FOLLOW_comparatorType_in_createFunctionStatement3499);
			rt=comparatorType();
			state._fsp--;

			match(input,K_LANGUAGE,FOLLOW_K_LANGUAGE_in_createFunctionStatement3507); 
			language=(Token)match(input,IDENT,FOLLOW_IDENT_in_createFunctionStatement3513); 
			match(input,K_AS,FOLLOW_K_AS_in_createFunctionStatement3521); 
			body=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement3527); 
			 expr = new CreateFunctionStatement(fn, (language!=null?language.getText():null).toLowerCase(), (body!=null?body.getText():null),
			                                            argsNames, argsTypes, rt, calledOnNullInput, orReplace, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createFunctionStatement"



	// $ANTLR start "dropFunctionStatement"
	// Parser.g:587:1: dropFunctionStatement returns [DropFunctionStatement expr] : K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropFunctionStatement dropFunctionStatement() throws RecognitionException {
		DropFunctionStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// Parser.g:593:5: ( K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// Parser.g:593:7: K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropFunctionStatement3565); 
			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_dropFunctionStatement3567); 
			// Parser.g:594:7: ( K_IF K_EXISTS )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==K_IF) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// Parser.g:594:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropFunctionStatement3576); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropFunctionStatement3578); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropFunctionStatement3593);
			fn=functionName();
			state._fsp--;

			// Parser.g:596:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==177) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// Parser.g:597:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,177,FOLLOW_177_in_dropFunctionStatement3611); 
					// Parser.g:598:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==IDENT||(LA63_0 >= K_AGGREGATE && LA63_0 <= K_ALL)||LA63_0==K_AS||LA63_0==K_ASCII||(LA63_0 >= K_BIGINT && LA63_0 <= K_BOOLEAN)||(LA63_0 >= K_CALLED && LA63_0 <= K_CLUSTERING)||(LA63_0 >= K_COMPACT && LA63_0 <= K_COUNTER)||(LA63_0 >= K_CUSTOM && LA63_0 <= K_DECIMAL)||(LA63_0 >= K_DISTINCT && LA63_0 <= K_DOUBLE)||(LA63_0 >= K_EXISTS && LA63_0 <= K_FLOAT)||LA63_0==K_FROZEN||(LA63_0 >= K_FUNCTION && LA63_0 <= K_FUNCTIONS)||LA63_0==K_INET||(LA63_0 >= K_INITCOND && LA63_0 <= K_INPUT)||LA63_0==K_INT||(LA63_0 >= K_JSON && LA63_0 <= K_KEYS)||(LA63_0 >= K_KEYSPACES && LA63_0 <= K_LIKE)||(LA63_0 >= K_LIST && LA63_0 <= K_MAP)||LA63_0==K_NOLOGIN||LA63_0==K_NOSUPERUSER||LA63_0==K_OPTIONS||(LA63_0 >= K_PARTITION && LA63_0 <= K_PERMISSIONS)||LA63_0==K_RETURNS||(LA63_0 >= K_ROLE && LA63_0 <= K_ROLES)||(LA63_0 >= K_SET && LA63_0 <= K_TINYINT)||LA63_0==K_TRIGGER||(LA63_0 >= K_TTL && LA63_0 <= K_TYPE)||(LA63_0 >= K_USER && LA63_0 <= K_USERS)||(LA63_0 >= K_UUID && LA63_0 <= K_VARINT)||LA63_0==K_WRITETIME||LA63_0==QUOTED_NAME||LA63_0==STRING_LITERAL) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// Parser.g:599:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement3639);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:600:13: ( ',' v= comparatorType )*
							loop62:
							while (true) {
								int alt62=2;
								int LA62_0 = input.LA(1);
								if ( (LA62_0==180) ) {
									alt62=1;
								}

								switch (alt62) {
								case 1 :
									// Parser.g:600:15: ',' v= comparatorType
									{
									match(input,180,FOLLOW_180_in_dropFunctionStatement3657); 
									pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement3661);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop62;
								}
							}

							}
							break;

					}

					match(input,178,FOLLOW_178_in_dropFunctionStatement3689); 
					 argsPresent = true; 
					}
					break;

			}

			 expr = new DropFunctionStatement(fn, argsTypes, argsPresent, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropFunctionStatement"



	// $ANTLR start "createKeyspaceStatement"
	// Parser.g:611:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement expr = null;


		String ks =null;


		        KeyspaceAttributes attrs = new KeyspaceAttributes();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:616:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:616:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement3748); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement3750); 
			// Parser.g:616:27: ( K_IF K_NOT K_EXISTS )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==K_IF) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// Parser.g:616:28: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement3753); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement3755); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement3757); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement3766);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement3774); 
			pushFollow(FOLLOW_properties_in_createKeyspaceStatement3776);
			properties(attrs);
			state._fsp--;

			 expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "createTableStatement"
	// Parser.g:627:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
	public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
		CreateTableStatement.RawStatement expr = null;


		CFName cf =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:629:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
			// Parser.g:629:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement3811); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement3813); 
			// Parser.g:629:31: ( K_IF K_NOT K_EXISTS )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==K_IF) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// Parser.g:629:32: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTableStatement3816); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement3818); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement3820); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createTableStatement3835);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new CreateTableStatement.RawStatement(cf, ifNotExists); 
			pushFollow(FOLLOW_cfamDefinition_in_createTableStatement3845);
			cfamDefinition(expr);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "cfamDefinition"
	// Parser.g:634:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
		try {
			// Parser.g:635:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:635:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,177,FOLLOW_177_in_cfamDefinition3864); 
			pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3866);
			cfamColumns(expr);
			state._fsp--;

			// Parser.g:635:29: ( ',' ( cfamColumns[expr] )? )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==180) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// Parser.g:635:31: ',' ( cfamColumns[expr] )?
					{
					match(input,180,FOLLOW_180_in_cfamDefinition3871); 
					// Parser.g:635:35: ( cfamColumns[expr] )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==IDENT||(LA67_0 >= K_AGGREGATE && LA67_0 <= K_ALL)||LA67_0==K_AS||LA67_0==K_ASCII||(LA67_0 >= K_BIGINT && LA67_0 <= K_BOOLEAN)||(LA67_0 >= K_CALLED && LA67_0 <= K_CLUSTERING)||(LA67_0 >= K_COMPACT && LA67_0 <= K_COUNTER)||(LA67_0 >= K_CUSTOM && LA67_0 <= K_DECIMAL)||(LA67_0 >= K_DISTINCT && LA67_0 <= K_DOUBLE)||(LA67_0 >= K_EXISTS && LA67_0 <= K_FLOAT)||LA67_0==K_FROZEN||(LA67_0 >= K_FUNCTION && LA67_0 <= K_FUNCTIONS)||LA67_0==K_INET||(LA67_0 >= K_INITCOND && LA67_0 <= K_INPUT)||LA67_0==K_INT||(LA67_0 >= K_JSON && LA67_0 <= K_KEYS)||(LA67_0 >= K_KEYSPACES && LA67_0 <= K_LIKE)||(LA67_0 >= K_LIST && LA67_0 <= K_MAP)||LA67_0==K_NOLOGIN||LA67_0==K_NOSUPERUSER||LA67_0==K_OPTIONS||(LA67_0 >= K_PARTITION && LA67_0 <= K_PRIMARY)||LA67_0==K_RETURNS||(LA67_0 >= K_ROLE && LA67_0 <= K_ROLES)||(LA67_0 >= K_SFUNC && LA67_0 <= K_TINYINT)||LA67_0==K_TRIGGER||(LA67_0 >= K_TTL && LA67_0 <= K_TYPE)||(LA67_0 >= K_USER && LA67_0 <= K_USERS)||(LA67_0 >= K_UUID && LA67_0 <= K_VARINT)||LA67_0==K_WRITETIME||LA67_0==QUOTED_NAME) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// Parser.g:635:35: cfamColumns[expr]
							{
							pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3873);
							cfamColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop68;
				}
			}

			match(input,178,FOLLOW_178_in_cfamDefinition3880); 
			// Parser.g:636:7: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==K_WITH) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// Parser.g:636:9: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition3890); 
					pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3892);
					cfamProperty(expr.properties);
					state._fsp--;

					// Parser.g:636:46: ( K_AND cfamProperty[expr.properties] )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==K_AND) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// Parser.g:636:48: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition3897); 
							pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3899);
							cfamProperty(expr.properties);
							state._fsp--;

							}
							break;

						default :
							break loop69;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamDefinition"



	// $ANTLR start "cfamColumns"
	// Parser.g:639:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' );
	public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier c =null;

		try {
			// Parser.g:640:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==IDENT||(LA74_0 >= K_AGGREGATE && LA74_0 <= K_ALL)||LA74_0==K_AS||LA74_0==K_ASCII||(LA74_0 >= K_BIGINT && LA74_0 <= K_BOOLEAN)||(LA74_0 >= K_CALLED && LA74_0 <= K_CLUSTERING)||(LA74_0 >= K_COMPACT && LA74_0 <= K_COUNTER)||(LA74_0 >= K_CUSTOM && LA74_0 <= K_DECIMAL)||(LA74_0 >= K_DISTINCT && LA74_0 <= K_DOUBLE)||(LA74_0 >= K_EXISTS && LA74_0 <= K_FLOAT)||LA74_0==K_FROZEN||(LA74_0 >= K_FUNCTION && LA74_0 <= K_FUNCTIONS)||LA74_0==K_INET||(LA74_0 >= K_INITCOND && LA74_0 <= K_INPUT)||LA74_0==K_INT||(LA74_0 >= K_JSON && LA74_0 <= K_KEYS)||(LA74_0 >= K_KEYSPACES && LA74_0 <= K_LIKE)||(LA74_0 >= K_LIST && LA74_0 <= K_MAP)||LA74_0==K_NOLOGIN||LA74_0==K_NOSUPERUSER||LA74_0==K_OPTIONS||(LA74_0 >= K_PARTITION && LA74_0 <= K_PERMISSIONS)||LA74_0==K_RETURNS||(LA74_0 >= K_ROLE && LA74_0 <= K_ROLES)||(LA74_0 >= K_SFUNC && LA74_0 <= K_TINYINT)||LA74_0==K_TRIGGER||(LA74_0 >= K_TTL && LA74_0 <= K_TYPE)||(LA74_0 >= K_USER && LA74_0 <= K_USERS)||(LA74_0 >= K_UUID && LA74_0 <= K_VARINT)||LA74_0==K_WRITETIME||LA74_0==QUOTED_NAME) ) {
				alt74=1;
			}
			else if ( (LA74_0==K_PRIMARY) ) {
				alt74=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// Parser.g:640:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
					{
					pushFollow(FOLLOW_ident_in_cfamColumns3925);
					k=ident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_cfamColumns3929);
					v=comparatorType();
					state._fsp--;

					 boolean isStatic=false; 
					// Parser.g:640:60: ( K_STATIC )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==K_STATIC) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// Parser.g:640:61: K_STATIC
							{
							match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns3934); 
							isStatic = true;
							}
							break;

					}

					 expr.addDefinition(k, v, isStatic); 
					// Parser.g:641:9: ( K_PRIMARY K_KEY )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==K_PRIMARY) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// Parser.g:641:10: K_PRIMARY K_KEY
							{
							match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns3951); 
							match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns3953); 
							 expr.addKeyAliases(Collections.singletonList(k)); 
							}
							break;

					}

					}
					break;
				case 2 :
					// Parser.g:642:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')'
					{
					match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns3965); 
					match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns3967); 
					match(input,177,FOLLOW_177_in_cfamColumns3969); 
					pushFollow(FOLLOW_pkDef_in_cfamColumns3971);
					pkDef(expr);
					state._fsp--;

					// Parser.g:642:39: ( ',' c= ident )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==180) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// Parser.g:642:40: ',' c= ident
							{
							match(input,180,FOLLOW_180_in_cfamColumns3975); 
							pushFollow(FOLLOW_ident_in_cfamColumns3979);
							c=ident();
							state._fsp--;

							 expr.addColumnAlias(c); 
							}
							break;

						default :
							break loop73;
						}
					}

					match(input,178,FOLLOW_178_in_cfamColumns3986); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamColumns"



	// $ANTLR start "pkDef"
	// Parser.g:645:1: pkDef[CreateTableStatement.RawStatement expr] : (k= ident | '(' k1= ident ( ',' kn= ident )* ')' );
	public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		try {
			// Parser.g:646:5: (k= ident | '(' k1= ident ( ',' kn= ident )* ')' )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==IDENT||(LA76_0 >= K_AGGREGATE && LA76_0 <= K_ALL)||LA76_0==K_AS||LA76_0==K_ASCII||(LA76_0 >= K_BIGINT && LA76_0 <= K_BOOLEAN)||(LA76_0 >= K_CALLED && LA76_0 <= K_CLUSTERING)||(LA76_0 >= K_COMPACT && LA76_0 <= K_COUNTER)||(LA76_0 >= K_CUSTOM && LA76_0 <= K_DECIMAL)||(LA76_0 >= K_DISTINCT && LA76_0 <= K_DOUBLE)||(LA76_0 >= K_EXISTS && LA76_0 <= K_FLOAT)||LA76_0==K_FROZEN||(LA76_0 >= K_FUNCTION && LA76_0 <= K_FUNCTIONS)||LA76_0==K_INET||(LA76_0 >= K_INITCOND && LA76_0 <= K_INPUT)||LA76_0==K_INT||(LA76_0 >= K_JSON && LA76_0 <= K_KEYS)||(LA76_0 >= K_KEYSPACES && LA76_0 <= K_LIKE)||(LA76_0 >= K_LIST && LA76_0 <= K_MAP)||LA76_0==K_NOLOGIN||LA76_0==K_NOSUPERUSER||LA76_0==K_OPTIONS||(LA76_0 >= K_PARTITION && LA76_0 <= K_PERMISSIONS)||LA76_0==K_RETURNS||(LA76_0 >= K_ROLE && LA76_0 <= K_ROLES)||(LA76_0 >= K_SFUNC && LA76_0 <= K_TINYINT)||LA76_0==K_TRIGGER||(LA76_0 >= K_TTL && LA76_0 <= K_TYPE)||(LA76_0 >= K_USER && LA76_0 <= K_USERS)||(LA76_0 >= K_UUID && LA76_0 <= K_VARINT)||LA76_0==K_WRITETIME||LA76_0==QUOTED_NAME) ) {
				alt76=1;
			}
			else if ( (LA76_0==177) ) {
				alt76=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// Parser.g:646:7: k= ident
					{
					pushFollow(FOLLOW_ident_in_pkDef4006);
					k=ident();
					state._fsp--;

					 expr.addKeyAliases(Collections.singletonList(k)); 
					}
					break;
				case 2 :
					// Parser.g:647:7: '(' k1= ident ( ',' kn= ident )* ')'
					{
					match(input,177,FOLLOW_177_in_pkDef4016); 
					 List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
					pushFollow(FOLLOW_ident_in_pkDef4022);
					k1=ident();
					state._fsp--;

					 l.add(k1); 
					// Parser.g:647:101: ( ',' kn= ident )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==180) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// Parser.g:647:103: ',' kn= ident
							{
							match(input,180,FOLLOW_180_in_pkDef4028); 
							pushFollow(FOLLOW_ident_in_pkDef4032);
							kn=ident();
							state._fsp--;

							 l.add(kn); 
							}
							break;

						default :
							break loop75;
						}
					}

					match(input,178,FOLLOW_178_in_pkDef4039); 
					 expr.addKeyAliases(l); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pkDef"



	// $ANTLR start "cfamProperty"
	// Parser.g:650:1: cfamProperty[CFProperties props] : ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' );
	public final void cfamProperty(CFProperties props) throws RecognitionException {
		try {
			// Parser.g:651:5: ( property[props.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')' )
			int alt78=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt78=1;
				}
				break;
			case K_COMPACT:
				{
				int LA78_2 = input.LA(2);
				if ( (LA78_2==K_STORAGE) ) {
					alt78=2;
				}
				else if ( (LA78_2==187) ) {
					alt78=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA78_3 = input.LA(2);
				if ( (LA78_3==K_ORDER) ) {
					alt78=3;
				}
				else if ( (LA78_3==187) ) {
					alt78=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// Parser.g:651:7: property[props.properties]
					{
					pushFollow(FOLLOW_property_in_cfamProperty4059);
					property(props.properties);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:652:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty4068); 
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty4070); 
					 props.setCompactStorage(); 
					}
					break;
				case 3 :
					// Parser.g:653:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[props] ( ',' cfamOrdering[props] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty4080); 
					match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty4082); 
					match(input,K_BY,FOLLOW_K_BY_in_cfamProperty4084); 
					match(input,177,FOLLOW_177_in_cfamProperty4086); 
					pushFollow(FOLLOW_cfamOrdering_in_cfamProperty4088);
					cfamOrdering(props);
					state._fsp--;

					// Parser.g:653:57: ( ',' cfamOrdering[props] )*
					loop77:
					while (true) {
						int alt77=2;
						int LA77_0 = input.LA(1);
						if ( (LA77_0==180) ) {
							alt77=1;
						}

						switch (alt77) {
						case 1 :
							// Parser.g:653:58: ',' cfamOrdering[props]
							{
							match(input,180,FOLLOW_180_in_cfamProperty4092); 
							pushFollow(FOLLOW_cfamOrdering_in_cfamProperty4094);
							cfamOrdering(props);
							state._fsp--;

							}
							break;

						default :
							break loop77;
						}
					}

					match(input,178,FOLLOW_178_in_cfamProperty4099); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamProperty"



	// $ANTLR start "cfamOrdering"
	// Parser.g:656:1: cfamOrdering[CFProperties props] : k= ident ( K_ASC | K_DESC ) ;
	public final void cfamOrdering(CFProperties props) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean reversed=false; 
		try {
			// Parser.g:658:5: (k= ident ( K_ASC | K_DESC ) )
			// Parser.g:658:7: k= ident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_ident_in_cfamOrdering4127);
			k=ident();
			state._fsp--;

			// Parser.g:658:15: ( K_ASC | K_DESC )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==K_ASC) ) {
				alt79=1;
			}
			else if ( (LA79_0==K_DESC) ) {
				alt79=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// Parser.g:658:16: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering4130); 
					}
					break;
				case 2 :
					// Parser.g:658:24: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering4134); 
					 reversed=true;
					}
					break;

			}

			 props.setOrdering(k, reversed); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfamOrdering"



	// $ANTLR start "createTypeStatement"
	// Parser.g:669:1: createTypeStatement returns [CreateTypeStatement expr] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' ;
	public final CreateTypeStatement createTypeStatement() throws RecognitionException {
		CreateTypeStatement expr = null;


		UTName tn =null;

		 boolean ifNotExists = false; 
		try {
			// Parser.g:671:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' )
			// Parser.g:671:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')'
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement4173); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement4175); 
			// Parser.g:671:23: ( K_IF K_NOT K_EXISTS )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==K_IF) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// Parser.g:671:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement4178); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement4180); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement4182); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_createTypeStatement4200);
			tn=userTypeName();
			state._fsp--;

			 expr = new CreateTypeStatement(tn, ifNotExists); 
			match(input,177,FOLLOW_177_in_createTypeStatement4213); 
			pushFollow(FOLLOW_typeColumns_in_createTypeStatement4215);
			typeColumns(expr);
			state._fsp--;

			// Parser.g:673:32: ( ',' ( typeColumns[expr] )? )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==180) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// Parser.g:673:34: ',' ( typeColumns[expr] )?
					{
					match(input,180,FOLLOW_180_in_createTypeStatement4220); 
					// Parser.g:673:38: ( typeColumns[expr] )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==IDENT||(LA81_0 >= K_AGGREGATE && LA81_0 <= K_ALL)||LA81_0==K_AS||LA81_0==K_ASCII||(LA81_0 >= K_BIGINT && LA81_0 <= K_BOOLEAN)||(LA81_0 >= K_CALLED && LA81_0 <= K_CLUSTERING)||(LA81_0 >= K_COMPACT && LA81_0 <= K_COUNTER)||(LA81_0 >= K_CUSTOM && LA81_0 <= K_DECIMAL)||(LA81_0 >= K_DISTINCT && LA81_0 <= K_DOUBLE)||(LA81_0 >= K_EXISTS && LA81_0 <= K_FLOAT)||LA81_0==K_FROZEN||(LA81_0 >= K_FUNCTION && LA81_0 <= K_FUNCTIONS)||LA81_0==K_INET||(LA81_0 >= K_INITCOND && LA81_0 <= K_INPUT)||LA81_0==K_INT||(LA81_0 >= K_JSON && LA81_0 <= K_KEYS)||(LA81_0 >= K_KEYSPACES && LA81_0 <= K_LIKE)||(LA81_0 >= K_LIST && LA81_0 <= K_MAP)||LA81_0==K_NOLOGIN||LA81_0==K_NOSUPERUSER||LA81_0==K_OPTIONS||(LA81_0 >= K_PARTITION && LA81_0 <= K_PERMISSIONS)||LA81_0==K_RETURNS||(LA81_0 >= K_ROLE && LA81_0 <= K_ROLES)||(LA81_0 >= K_SFUNC && LA81_0 <= K_TINYINT)||LA81_0==K_TRIGGER||(LA81_0 >= K_TTL && LA81_0 <= K_TYPE)||(LA81_0 >= K_USER && LA81_0 <= K_USERS)||(LA81_0 >= K_UUID && LA81_0 <= K_VARINT)||LA81_0==K_WRITETIME||LA81_0==QUOTED_NAME) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// Parser.g:673:38: typeColumns[expr]
							{
							pushFollow(FOLLOW_typeColumns_in_createTypeStatement4222);
							typeColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop82;
				}
			}

			match(input,178,FOLLOW_178_in_createTypeStatement4229); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTypeStatement"



	// $ANTLR start "typeColumns"
	// Parser.g:676:1: typeColumns[CreateTypeStatement expr] : k= fident v= comparatorType ;
	public final void typeColumns(CreateTypeStatement expr) throws RecognitionException {
		FieldIdentifier k =null;
		CQL3Type.Raw v =null;

		try {
			// Parser.g:677:5: (k= fident v= comparatorType )
			// Parser.g:677:7: k= fident v= comparatorType
			{
			pushFollow(FOLLOW_fident_in_typeColumns4249);
			k=fident();
			state._fsp--;

			pushFollow(FOLLOW_comparatorType_in_typeColumns4253);
			v=comparatorType();
			state._fsp--;

			 expr.addDefinition(k, v); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeColumns"



	// $ANTLR start "createIndexStatement"
	// Parser.g:685:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
	public final CreateIndexStatement createIndexStatement() throws RecognitionException {
		CreateIndexStatement expr = null;


		Token cls=null;
		CFName cf =null;


		        IndexPropDefs props = new IndexPropDefs();
		        boolean ifNotExists = false;
		        IndexName name = new IndexName();
		        List<IndexTarget.Raw> targets = new ArrayList<>();
		    
		try {
			// Parser.g:692:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
			// Parser.g:692:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? ( idxName[name] )? K_ON cf= columnFamilyName '(' ( indexIdent[targets] ( ',' indexIdent[targets] )* )? ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement4288); 
			// Parser.g:692:16: ( K_CUSTOM )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==K_CUSTOM) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// Parser.g:692:17: K_CUSTOM
					{
					match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement4291); 
					 props.isCustom = true; 
					}
					break;

			}

			match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement4297); 
			// Parser.g:692:63: ( K_IF K_NOT K_EXISTS )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==K_IF) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// Parser.g:692:64: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement4300); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement4302); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement4304); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:693:9: ( idxName[name] )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==IDENT||(LA85_0 >= K_AGGREGATE && LA85_0 <= K_ALL)||LA85_0==K_AS||LA85_0==K_ASCII||(LA85_0 >= K_BIGINT && LA85_0 <= K_BOOLEAN)||(LA85_0 >= K_CALLED && LA85_0 <= K_CLUSTERING)||(LA85_0 >= K_COMPACT && LA85_0 <= K_COUNTER)||(LA85_0 >= K_CUSTOM && LA85_0 <= K_DECIMAL)||(LA85_0 >= K_DISTINCT && LA85_0 <= K_DOUBLE)||(LA85_0 >= K_EXISTS && LA85_0 <= K_FLOAT)||LA85_0==K_FROZEN||(LA85_0 >= K_FUNCTION && LA85_0 <= K_FUNCTIONS)||LA85_0==K_INET||(LA85_0 >= K_INITCOND && LA85_0 <= K_INPUT)||LA85_0==K_INT||(LA85_0 >= K_JSON && LA85_0 <= K_KEYS)||(LA85_0 >= K_KEYSPACES && LA85_0 <= K_LIKE)||(LA85_0 >= K_LIST && LA85_0 <= K_MAP)||LA85_0==K_NOLOGIN||LA85_0==K_NOSUPERUSER||LA85_0==K_OPTIONS||(LA85_0 >= K_PARTITION && LA85_0 <= K_PERMISSIONS)||LA85_0==K_RETURNS||(LA85_0 >= K_ROLE && LA85_0 <= K_ROLES)||(LA85_0 >= K_SFUNC && LA85_0 <= K_TINYINT)||LA85_0==K_TRIGGER||(LA85_0 >= K_TTL && LA85_0 <= K_TYPE)||(LA85_0 >= K_USER && LA85_0 <= K_USERS)||(LA85_0 >= K_UUID && LA85_0 <= K_VARINT)||LA85_0==K_WRITETIME||(LA85_0 >= QMARK && LA85_0 <= QUOTED_NAME)) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// Parser.g:693:10: idxName[name]
					{
					pushFollow(FOLLOW_idxName_in_createIndexStatement4320);
					idxName(name);
					state._fsp--;

					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement4325); 
			pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement4329);
			cf=columnFamilyName();
			state._fsp--;

			match(input,177,FOLLOW_177_in_createIndexStatement4331); 
			// Parser.g:693:55: ( indexIdent[targets] ( ',' indexIdent[targets] )* )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==IDENT||(LA87_0 >= K_AGGREGATE && LA87_0 <= K_ALL)||LA87_0==K_AS||LA87_0==K_ASCII||(LA87_0 >= K_BIGINT && LA87_0 <= K_BOOLEAN)||(LA87_0 >= K_CALLED && LA87_0 <= K_CLUSTERING)||(LA87_0 >= K_COMPACT && LA87_0 <= K_COUNTER)||(LA87_0 >= K_CUSTOM && LA87_0 <= K_DECIMAL)||(LA87_0 >= K_DISTINCT && LA87_0 <= K_DOUBLE)||LA87_0==K_ENTRIES||(LA87_0 >= K_EXISTS && LA87_0 <= K_FLOAT)||(LA87_0 >= K_FROZEN && LA87_0 <= K_FUNCTIONS)||LA87_0==K_INET||(LA87_0 >= K_INITCOND && LA87_0 <= K_INPUT)||LA87_0==K_INT||(LA87_0 >= K_JSON && LA87_0 <= K_KEYS)||(LA87_0 >= K_KEYSPACES && LA87_0 <= K_LIKE)||(LA87_0 >= K_LIST && LA87_0 <= K_MAP)||LA87_0==K_NOLOGIN||LA87_0==K_NOSUPERUSER||LA87_0==K_OPTIONS||(LA87_0 >= K_PARTITION && LA87_0 <= K_PERMISSIONS)||LA87_0==K_RETURNS||(LA87_0 >= K_ROLE && LA87_0 <= K_ROLES)||(LA87_0 >= K_SFUNC && LA87_0 <= K_TINYINT)||LA87_0==K_TRIGGER||(LA87_0 >= K_TTL && LA87_0 <= K_TYPE)||(LA87_0 >= K_USER && LA87_0 <= K_USERS)||(LA87_0 >= K_UUID && LA87_0 <= K_VARINT)||LA87_0==K_WRITETIME||LA87_0==QUOTED_NAME) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// Parser.g:693:56: indexIdent[targets] ( ',' indexIdent[targets] )*
					{
					pushFollow(FOLLOW_indexIdent_in_createIndexStatement4334);
					indexIdent(targets);
					state._fsp--;

					// Parser.g:693:76: ( ',' indexIdent[targets] )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==180) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// Parser.g:693:77: ',' indexIdent[targets]
							{
							match(input,180,FOLLOW_180_in_createIndexStatement4338); 
							pushFollow(FOLLOW_indexIdent_in_createIndexStatement4340);
							indexIdent(targets);
							state._fsp--;

							}
							break;

						default :
							break loop86;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_createIndexStatement4347); 
			// Parser.g:694:9: ( K_USING cls= STRING_LITERAL )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==K_USING) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// Parser.g:694:10: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement4358); 
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement4362); 
					 props.customClass = (cls!=null?cls.getText():null); 
					}
					break;

			}

			// Parser.g:695:9: ( K_WITH properties[props] )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==K_WITH) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// Parser.g:695:10: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement4377); 
					pushFollow(FOLLOW_properties_in_createIndexStatement4379);
					properties(props);
					state._fsp--;

					}
					break;

			}

			 expr = new CreateIndexStatement(cf, name, targets, props, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "indexIdent"
	// Parser.g:699:1: indexIdent[List<IndexTarget.Raw> targets] : (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' );
	public final void indexIdent(List<IndexTarget.Raw> targets) throws RecognitionException {
		ColumnDefinition.Raw c =null;

		try {
			// Parser.g:700:5: (c= cident | K_VALUES '(' c= cident ')' | K_KEYS '(' c= cident ')' | K_ENTRIES '(' c= cident ')' | K_FULL '(' c= cident ')' )
			int alt90=5;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt90=1;
				}
				break;
			case K_VALUES:
				{
				int LA90_2 = input.LA(2);
				if ( (LA90_2==177) ) {
					alt90=2;
				}
				else if ( (LA90_2==178||LA90_2==180) ) {
					alt90=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYS:
				{
				int LA90_3 = input.LA(2);
				if ( (LA90_3==177) ) {
					alt90=3;
				}
				else if ( (LA90_3==178||LA90_3==180) ) {
					alt90=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ENTRIES:
				{
				alt90=4;
				}
				break;
			case K_FULL:
				{
				alt90=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// Parser.g:700:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_indexIdent4411);
					c=cident();
					state._fsp--;

					 targets.add(IndexTarget.Raw.simpleIndexOn(c)); 
					}
					break;
				case 2 :
					// Parser.g:701:7: K_VALUES '(' c= cident ')'
					{
					match(input,K_VALUES,FOLLOW_K_VALUES_in_indexIdent4439); 
					match(input,177,FOLLOW_177_in_indexIdent4441); 
					pushFollow(FOLLOW_cident_in_indexIdent4445);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4447); 
					 targets.add(IndexTarget.Raw.valuesOf(c)); 
					}
					break;
				case 3 :
					// Parser.g:702:7: K_KEYS '(' c= cident ')'
					{
					match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent4458); 
					match(input,177,FOLLOW_177_in_indexIdent4460); 
					pushFollow(FOLLOW_cident_in_indexIdent4464);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4466); 
					 targets.add(IndexTarget.Raw.keysOf(c)); 
					}
					break;
				case 4 :
					// Parser.g:703:7: K_ENTRIES '(' c= cident ')'
					{
					match(input,K_ENTRIES,FOLLOW_K_ENTRIES_in_indexIdent4479); 
					match(input,177,FOLLOW_177_in_indexIdent4481); 
					pushFollow(FOLLOW_cident_in_indexIdent4485);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4487); 
					 targets.add(IndexTarget.Raw.keysAndValuesOf(c)); 
					}
					break;
				case 5 :
					// Parser.g:704:7: K_FULL '(' c= cident ')'
					{
					match(input,K_FULL,FOLLOW_K_FULL_in_indexIdent4497); 
					match(input,177,FOLLOW_177_in_indexIdent4499); 
					pushFollow(FOLLOW_cident_in_indexIdent4503);
					c=cident();
					state._fsp--;

					match(input,178,FOLLOW_178_in_indexIdent4505); 
					 targets.add(IndexTarget.Raw.fullCollection(c)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "indexIdent"



	// $ANTLR start "createMaterializedViewStatement"
	// Parser.g:715:1: createMaterializedViewStatement returns [CreateViewStatement expr] : K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? ;
	public final CreateViewStatement createMaterializedViewStatement() throws RecognitionException {
		CreateViewStatement expr = null;


		CFName cf =null;
		List<RawSelector> sclause =null;
		CFName basecf =null;
		WhereClause.Builder wclause =null;
		ColumnDefinition.Raw k1 =null;
		ColumnDefinition.Raw kn =null;
		ColumnDefinition.Raw c1 =null;
		ColumnDefinition.Raw cn =null;


		        boolean ifNotExists = false;
		        List<ColumnDefinition.Raw> partitionKeys = new ArrayList<>();
		        List<ColumnDefinition.Raw> compositeKeys = new ArrayList<>();
		    
		try {
			// Parser.g:721:5: ( K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )? )
			// Parser.g:721:7: K_CREATE K_MATERIALIZED K_VIEW ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName K_AS K_SELECT sclause= selectClause K_FROM basecf= columnFamilyName ( K_WHERE wclause= whereClause )? K_PRIMARY K_KEY ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' ) ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createMaterializedViewStatement4542); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement4544); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_createMaterializedViewStatement4546); 
			// Parser.g:721:38: ( K_IF K_NOT K_EXISTS )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==K_IF) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// Parser.g:721:39: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createMaterializedViewStatement4549); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createMaterializedViewStatement4551); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createMaterializedViewStatement4553); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement4561);
			cf=columnFamilyName();
			state._fsp--;

			match(input,K_AS,FOLLOW_K_AS_in_createMaterializedViewStatement4563); 
			match(input,K_SELECT,FOLLOW_K_SELECT_in_createMaterializedViewStatement4573); 
			pushFollow(FOLLOW_selectClause_in_createMaterializedViewStatement4577);
			sclause=selectClause();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_createMaterializedViewStatement4579); 
			pushFollow(FOLLOW_columnFamilyName_in_createMaterializedViewStatement4583);
			basecf=columnFamilyName();
			state._fsp--;

			// Parser.g:723:9: ( K_WHERE wclause= whereClause )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==K_WHERE) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// Parser.g:723:10: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_createMaterializedViewStatement4594); 
					pushFollow(FOLLOW_whereClause_in_createMaterializedViewStatement4598);
					wclause=whereClause();
					state._fsp--;

					}
					break;

			}

			match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_createMaterializedViewStatement4610); 
			match(input,K_KEY,FOLLOW_K_KEY_in_createMaterializedViewStatement4612); 
			// Parser.g:724:25: ( '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')' | '(' k1= cident ( ',' cn= cident )* ')' )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==177) ) {
				int LA96_1 = input.LA(2);
				if ( (LA96_1==177) ) {
					alt96=1;
				}
				else if ( (LA96_1==IDENT||(LA96_1 >= K_AGGREGATE && LA96_1 <= K_ALL)||LA96_1==K_AS||LA96_1==K_ASCII||(LA96_1 >= K_BIGINT && LA96_1 <= K_BOOLEAN)||(LA96_1 >= K_CALLED && LA96_1 <= K_CLUSTERING)||(LA96_1 >= K_COMPACT && LA96_1 <= K_COUNTER)||(LA96_1 >= K_CUSTOM && LA96_1 <= K_DECIMAL)||(LA96_1 >= K_DISTINCT && LA96_1 <= K_DOUBLE)||(LA96_1 >= K_EXISTS && LA96_1 <= K_FLOAT)||LA96_1==K_FROZEN||(LA96_1 >= K_FUNCTION && LA96_1 <= K_FUNCTIONS)||LA96_1==K_INET||(LA96_1 >= K_INITCOND && LA96_1 <= K_INPUT)||LA96_1==K_INT||(LA96_1 >= K_JSON && LA96_1 <= K_KEYS)||(LA96_1 >= K_KEYSPACES && LA96_1 <= K_LIKE)||(LA96_1 >= K_LIST && LA96_1 <= K_MAP)||LA96_1==K_NOLOGIN||LA96_1==K_NOSUPERUSER||LA96_1==K_OPTIONS||(LA96_1 >= K_PARTITION && LA96_1 <= K_PERMISSIONS)||LA96_1==K_RETURNS||(LA96_1 >= K_ROLE && LA96_1 <= K_ROLES)||(LA96_1 >= K_SFUNC && LA96_1 <= K_TINYINT)||LA96_1==K_TRIGGER||(LA96_1 >= K_TTL && LA96_1 <= K_TYPE)||(LA96_1 >= K_USER && LA96_1 <= K_USERS)||(LA96_1 >= K_UUID && LA96_1 <= K_VARINT)||LA96_1==K_WRITETIME||LA96_1==QUOTED_NAME) ) {
					alt96=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 96, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}

			switch (alt96) {
				case 1 :
					// Parser.g:725:9: '(' '(' k1= cident ( ',' kn= cident )* ')' ( ',' c1= cident )* ')'
					{
					match(input,177,FOLLOW_177_in_createMaterializedViewStatement4624); 
					match(input,177,FOLLOW_177_in_createMaterializedViewStatement4626); 
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4630);
					k1=cident();
					state._fsp--;

					 partitionKeys.add(k1); 
					// Parser.g:725:54: ( ',' kn= cident )*
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==180) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// Parser.g:725:56: ',' kn= cident
							{
							match(input,180,FOLLOW_180_in_createMaterializedViewStatement4636); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4640);
							kn=cident();
							state._fsp--;

							 partitionKeys.add(kn); 
							}
							break;

						default :
							break loop93;
						}
					}

					match(input,178,FOLLOW_178_in_createMaterializedViewStatement4647); 
					// Parser.g:725:104: ( ',' c1= cident )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==180) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// Parser.g:725:106: ',' c1= cident
							{
							match(input,180,FOLLOW_180_in_createMaterializedViewStatement4651); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4655);
							c1=cident();
							state._fsp--;

							 compositeKeys.add(c1); 
							}
							break;

						default :
							break loop94;
						}
					}

					match(input,178,FOLLOW_178_in_createMaterializedViewStatement4662); 
					}
					break;
				case 2 :
					// Parser.g:726:9: '(' k1= cident ( ',' cn= cident )* ')'
					{
					match(input,177,FOLLOW_177_in_createMaterializedViewStatement4672); 
					pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4676);
					k1=cident();
					state._fsp--;

					 partitionKeys.add(k1); 
					// Parser.g:726:50: ( ',' cn= cident )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==180) ) {
							alt95=1;
						}

						switch (alt95) {
						case 1 :
							// Parser.g:726:52: ',' cn= cident
							{
							match(input,180,FOLLOW_180_in_createMaterializedViewStatement4682); 
							pushFollow(FOLLOW_cident_in_createMaterializedViewStatement4686);
							cn=cident();
							state._fsp--;

							 compositeKeys.add(cn); 
							}
							break;

						default :
							break loop95;
						}
					}

					match(input,178,FOLLOW_178_in_createMaterializedViewStatement4693); 
					}
					break;

			}


			             WhereClause where = wclause == null ? WhereClause.empty() : wclause.build();
			             expr = new CreateViewStatement(cf, basecf, sclause, where, partitionKeys, compositeKeys, ifNotExists);
			        
			// Parser.g:732:9: ( K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )* )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==K_WITH) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// Parser.g:732:11: K_WITH cfamProperty[expr.properties] ( K_AND cfamProperty[expr.properties] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createMaterializedViewStatement4725); 
					pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement4727);
					cfamProperty(expr.properties);
					state._fsp--;

					// Parser.g:732:48: ( K_AND cfamProperty[expr.properties] )*
					loop97:
					while (true) {
						int alt97=2;
						int LA97_0 = input.LA(1);
						if ( (LA97_0==K_AND) ) {
							alt97=1;
						}

						switch (alt97) {
						case 1 :
							// Parser.g:732:50: K_AND cfamProperty[expr.properties]
							{
							match(input,K_AND,FOLLOW_K_AND_in_createMaterializedViewStatement4732); 
							pushFollow(FOLLOW_cfamProperty_in_createMaterializedViewStatement4734);
							cfamProperty(expr.properties);
							state._fsp--;

							}
							break;

						default :
							break loop97;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createMaterializedViewStatement"



	// $ANTLR start "createTriggerStatement"
	// Parser.g:738:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
	public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement expr = null;


		Token cls=null;
		ColumnDefinition.Raw name =null;
		CFName cf =null;


		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:742:5: ( K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
			// Parser.g:742:7: K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement4772); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement4774); 
			// Parser.g:742:26: ( K_IF K_NOT K_EXISTS )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==K_IF) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// Parser.g:742:27: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTriggerStatement4777); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTriggerStatement4779); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTriggerStatement4781); 
					 ifNotExists = true; 
					}
					break;

			}

			// Parser.g:742:74: (name= cident )
			// Parser.g:742:75: name= cident
			{
			pushFollow(FOLLOW_cident_in_createTriggerStatement4791);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement4802); 
			pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement4806);
			cf=columnFamilyName();
			state._fsp--;

			match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement4808); 
			cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement4812); 
			 expr = new CreateTriggerStatement(cf, name.rawText(), (cls!=null?cls.getText():null), ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "dropTriggerStatement"
	// Parser.g:750:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName ;
	public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement expr = null;


		ColumnDefinition.Raw name =null;
		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:752:5: ( K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName )
			// Parser.g:752:7: K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement4853); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement4855); 
			// Parser.g:752:24: ( K_IF K_EXISTS )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==K_IF) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// Parser.g:752:25: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTriggerStatement4858); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTriggerStatement4860); 
					 ifExists = true; 
					}
					break;

			}

			// Parser.g:752:63: (name= cident )
			// Parser.g:752:64: name= cident
			{
			pushFollow(FOLLOW_cident_in_dropTriggerStatement4870);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement4873); 
			pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement4877);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new DropTriggerStatement(cf, name.rawText(), ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// Parser.g:759:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
	public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement expr = null;


		String ks =null;

		 KeyspaceAttributes attrs = new KeyspaceAttributes(); 
		try {
			// Parser.g:761:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
			// Parser.g:761:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement4917); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement4919); 
			pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement4923);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement4933); 
			pushFollow(FOLLOW_properties_in_alterKeyspaceStatement4935);
			properties(attrs);
			state._fsp--;

			 expr = new AlterKeyspaceStatement(ks, attrs); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "alterTableStatement"
	// Parser.g:772:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
	public final AlterTableStatement alterTableStatement() throws RecognitionException {
		AlterTableStatement expr = null;


		CFName cf =null;
		ColumnDefinition.Raw id =null;
		CQL3Type.Raw v =null;
		boolean b1 =false;
		ColumnDefinition.Raw id1 =null;
		CQL3Type.Raw v1 =null;
		ColumnDefinition.Raw idn =null;
		CQL3Type.Raw vn =null;
		boolean bn =false;
		ColumnDefinition.Raw toId1 =null;
		ColumnDefinition.Raw toIdn =null;


		        AlterTableStatement.Type type = null;
		        TableAttributes attrs = new TableAttributes();
		        Map<ColumnDefinition.Raw, ColumnDefinition.Raw> renames = new HashMap<ColumnDefinition.Raw, ColumnDefinition.Raw>();
		        List<AlterTableStatementColumn> colNameList = new ArrayList<AlterTableStatementColumn>();
		    
		try {
			// Parser.g:779:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
			// Parser.g:779:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement4970); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement4972); 
			pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement4976);
			cf=columnFamilyName();
			state._fsp--;

			// Parser.g:780:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) ) | K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) ) | K_WITH properties[attrs] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			int alt106=5;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt106=1;
				}
				break;
			case K_ADD:
				{
				alt106=2;
				}
				break;
			case K_DROP:
				{
				alt106=3;
				}
				break;
			case K_WITH:
				{
				alt106=4;
				}
				break;
			case K_RENAME:
				{
				alt106=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// Parser.g:780:13: K_ALTER id= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement4990); 
					pushFollow(FOLLOW_cident_in_alterTableStatement4994);
					id=cident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement4997); 
					pushFollow(FOLLOW_comparatorType_in_alterTableStatement5001);
					v=comparatorType();
					state._fsp--;

					 type = AlterTableStatement.Type.ALTER; 
					 colNameList.add(new AlterTableStatementColumn(id,v)); 
					}
					break;
				case 2 :
					// Parser.g:781:13: K_ADD ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement5020); 
					// Parser.g:781:20: ( (id= cident v= comparatorType b1= cfisStatic ) | ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' ) )
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==IDENT||(LA102_0 >= K_AGGREGATE && LA102_0 <= K_ALL)||LA102_0==K_AS||LA102_0==K_ASCII||(LA102_0 >= K_BIGINT && LA102_0 <= K_BOOLEAN)||(LA102_0 >= K_CALLED && LA102_0 <= K_CLUSTERING)||(LA102_0 >= K_COMPACT && LA102_0 <= K_COUNTER)||(LA102_0 >= K_CUSTOM && LA102_0 <= K_DECIMAL)||(LA102_0 >= K_DISTINCT && LA102_0 <= K_DOUBLE)||(LA102_0 >= K_EXISTS && LA102_0 <= K_FLOAT)||LA102_0==K_FROZEN||(LA102_0 >= K_FUNCTION && LA102_0 <= K_FUNCTIONS)||LA102_0==K_INET||(LA102_0 >= K_INITCOND && LA102_0 <= K_INPUT)||LA102_0==K_INT||(LA102_0 >= K_JSON && LA102_0 <= K_KEYS)||(LA102_0 >= K_KEYSPACES && LA102_0 <= K_LIKE)||(LA102_0 >= K_LIST && LA102_0 <= K_MAP)||LA102_0==K_NOLOGIN||LA102_0==K_NOSUPERUSER||LA102_0==K_OPTIONS||(LA102_0 >= K_PARTITION && LA102_0 <= K_PERMISSIONS)||LA102_0==K_RETURNS||(LA102_0 >= K_ROLE && LA102_0 <= K_ROLES)||(LA102_0 >= K_SFUNC && LA102_0 <= K_TINYINT)||LA102_0==K_TRIGGER||(LA102_0 >= K_TTL && LA102_0 <= K_TYPE)||(LA102_0 >= K_USER && LA102_0 <= K_USERS)||(LA102_0 >= K_UUID && LA102_0 <= K_VARINT)||LA102_0==K_WRITETIME||LA102_0==QUOTED_NAME) ) {
						alt102=1;
					}
					else if ( (LA102_0==177) ) {
						alt102=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 102, 0, input);
						throw nvae;
					}

					switch (alt102) {
						case 1 :
							// Parser.g:781:29: (id= cident v= comparatorType b1= cfisStatic )
							{
							// Parser.g:781:29: (id= cident v= comparatorType b1= cfisStatic )
							// Parser.g:781:30: id= cident v= comparatorType b1= cfisStatic
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement5035);
							id=cident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_alterTableStatement5041);
							v=comparatorType();
							state._fsp--;

							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5047);
							b1=cfisStatic();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id,v,b1)); 
							}

							}
							break;
						case 2 :
							// Parser.g:782:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							{
							// Parser.g:782:24: ( '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')' )
							// Parser.g:782:25: '(' id1= cident v1= comparatorType b1= cfisStatic ( ',' idn= cident vn= comparatorType bn= cfisStatic )* ')'
							{
							match(input,177,FOLLOW_177_in_alterTableStatement5076); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5081);
							id1=cident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_alterTableStatement5086);
							v1=comparatorType();
							state._fsp--;

							pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5091);
							b1=cfisStatic();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id1,v1,b1)); 
							// Parser.g:783:24: ( ',' idn= cident vn= comparatorType bn= cfisStatic )*
							loop101:
							while (true) {
								int alt101=2;
								int LA101_0 = input.LA(1);
								if ( (LA101_0==180) ) {
									alt101=1;
								}

								switch (alt101) {
								case 1 :
									// Parser.g:783:26: ',' idn= cident vn= comparatorType bn= cfisStatic
									{
									match(input,180,FOLLOW_180_in_alterTableStatement5120); 
									pushFollow(FOLLOW_cident_in_alterTableStatement5124);
									idn=cident();
									state._fsp--;

									pushFollow(FOLLOW_comparatorType_in_alterTableStatement5129);
									vn=comparatorType();
									state._fsp--;

									pushFollow(FOLLOW_cfisStatic_in_alterTableStatement5134);
									bn=cfisStatic();
									state._fsp--;

									 colNameList.add(new AlterTableStatementColumn(idn,vn,bn)); 
									}
									break;

								default :
									break loop101;
								}
							}

							match(input,178,FOLLOW_178_in_alterTableStatement5141); 
							}

							}
							break;

					}

					 type = AlterTableStatement.Type.ADD; 
					}
					break;
				case 3 :
					// Parser.g:784:13: K_DROP (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) )
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement5161); 
					// Parser.g:784:20: (id= cident | ( '(' id1= cident ( ',' idn= cident )* ')' ) )
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==IDENT||(LA104_0 >= K_AGGREGATE && LA104_0 <= K_ALL)||LA104_0==K_AS||LA104_0==K_ASCII||(LA104_0 >= K_BIGINT && LA104_0 <= K_BOOLEAN)||(LA104_0 >= K_CALLED && LA104_0 <= K_CLUSTERING)||(LA104_0 >= K_COMPACT && LA104_0 <= K_COUNTER)||(LA104_0 >= K_CUSTOM && LA104_0 <= K_DECIMAL)||(LA104_0 >= K_DISTINCT && LA104_0 <= K_DOUBLE)||(LA104_0 >= K_EXISTS && LA104_0 <= K_FLOAT)||LA104_0==K_FROZEN||(LA104_0 >= K_FUNCTION && LA104_0 <= K_FUNCTIONS)||LA104_0==K_INET||(LA104_0 >= K_INITCOND && LA104_0 <= K_INPUT)||LA104_0==K_INT||(LA104_0 >= K_JSON && LA104_0 <= K_KEYS)||(LA104_0 >= K_KEYSPACES && LA104_0 <= K_LIKE)||(LA104_0 >= K_LIST && LA104_0 <= K_MAP)||LA104_0==K_NOLOGIN||LA104_0==K_NOSUPERUSER||LA104_0==K_OPTIONS||(LA104_0 >= K_PARTITION && LA104_0 <= K_PERMISSIONS)||LA104_0==K_RETURNS||(LA104_0 >= K_ROLE && LA104_0 <= K_ROLES)||(LA104_0 >= K_SFUNC && LA104_0 <= K_TINYINT)||LA104_0==K_TRIGGER||(LA104_0 >= K_TTL && LA104_0 <= K_TYPE)||(LA104_0 >= K_USER && LA104_0 <= K_USERS)||(LA104_0 >= K_UUID && LA104_0 <= K_VARINT)||LA104_0==K_WRITETIME||LA104_0==QUOTED_NAME) ) {
						alt104=1;
					}
					else if ( (LA104_0==177) ) {
						alt104=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 104, 0, input);
						throw nvae;
					}

					switch (alt104) {
						case 1 :
							// Parser.g:784:30: id= cident
							{
							pushFollow(FOLLOW_cident_in_alterTableStatement5175);
							id=cident();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id)); 
							}
							break;
						case 2 :
							// Parser.g:785:24: ( '(' id1= cident ( ',' idn= cident )* ')' )
							{
							// Parser.g:785:24: ( '(' id1= cident ( ',' idn= cident )* ')' )
							// Parser.g:785:25: '(' id1= cident ( ',' idn= cident )* ')'
							{
							match(input,177,FOLLOW_177_in_alterTableStatement5204); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5209);
							id1=cident();
							state._fsp--;

							 colNameList.add(new AlterTableStatementColumn(id1)); 
							// Parser.g:786:24: ( ',' idn= cident )*
							loop103:
							while (true) {
								int alt103=2;
								int LA103_0 = input.LA(1);
								if ( (LA103_0==180) ) {
									alt103=1;
								}

								switch (alt103) {
								case 1 :
									// Parser.g:786:26: ',' idn= cident
									{
									match(input,180,FOLLOW_180_in_alterTableStatement5238); 
									pushFollow(FOLLOW_cident_in_alterTableStatement5242);
									idn=cident();
									state._fsp--;

									 colNameList.add(new AlterTableStatementColumn(idn)); 
									}
									break;

								default :
									break loop103;
								}
							}

							match(input,178,FOLLOW_178_in_alterTableStatement5249); 
							}

							}
							break;

					}

					 type = AlterTableStatement.Type.DROP; 
					}
					break;
				case 4 :
					// Parser.g:787:13: K_WITH properties[attrs]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement5268); 
					pushFollow(FOLLOW_properties_in_alterTableStatement5271);
					properties(attrs);
					state._fsp--;

					 type = AlterTableStatement.Type.OPTS; 
					}
					break;
				case 5 :
					// Parser.g:788:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement5304); 
					 type = AlterTableStatement.Type.RENAME; 
					pushFollow(FOLLOW_cident_in_alterTableStatement5358);
					id1=cident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement5360); 
					pushFollow(FOLLOW_cident_in_alterTableStatement5364);
					toId1=cident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// Parser.g:790:16: ( K_AND idn= cident K_TO toIdn= cident )*
					loop105:
					while (true) {
						int alt105=2;
						int LA105_0 = input.LA(1);
						if ( (LA105_0==K_AND) ) {
							alt105=1;
						}

						switch (alt105) {
						case 1 :
							// Parser.g:790:18: K_AND idn= cident K_TO toIdn= cident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement5385); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5389);
							idn=cident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement5391); 
							pushFollow(FOLLOW_cident_in_alterTableStatement5395);
							toIdn=cident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop105;
						}
					}

					}
					break;

			}


			        expr = new AlterTableStatement(cf, type, colNameList, attrs, renames);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "cfisStatic"
	// Parser.g:797:1: cfisStatic returns [boolean isStaticColumn] : ( K_STATIC )? ;
	public final boolean cfisStatic() throws RecognitionException {
		boolean isStaticColumn = false;



		        boolean isStatic = false;
		    
		try {
			// Parser.g:801:5: ( ( K_STATIC )? )
			// Parser.g:801:7: ( K_STATIC )?
			{
			// Parser.g:801:7: ( K_STATIC )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==K_STATIC) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// Parser.g:801:8: K_STATIC
					{
					match(input,K_STATIC,FOLLOW_K_STATIC_in_cfisStatic5448); 
					 isStatic=true; 
					}
					break;

			}

			 isStaticColumn = isStatic;
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return isStaticColumn;
	}
	// $ANTLR end "cfisStatic"



	// $ANTLR start "alterMaterializedViewStatement"
	// Parser.g:805:1: alterMaterializedViewStatement returns [AlterViewStatement expr] : K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] ;
	public final AlterViewStatement alterMaterializedViewStatement() throws RecognitionException {
		AlterViewStatement expr = null;


		CFName name =null;


		        TableAttributes attrs = new TableAttributes();
		    
		try {
			// Parser.g:809:5: ( K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs] )
			// Parser.g:809:7: K_ALTER K_MATERIALIZED K_VIEW name= columnFamilyName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterMaterializedViewStatement5484); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement5486); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_alterMaterializedViewStatement5488); 
			pushFollow(FOLLOW_columnFamilyName_in_alterMaterializedViewStatement5492);
			name=columnFamilyName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_alterMaterializedViewStatement5504); 
			pushFollow(FOLLOW_properties_in_alterMaterializedViewStatement5506);
			properties(attrs);
			state._fsp--;


			        expr = new AlterViewStatement(name, attrs);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterMaterializedViewStatement"



	// $ANTLR start "alterTypeStatement"
	// Parser.g:822:1: alterTypeStatement returns [AlterTypeStatement expr] : K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* ) ;
	public final AlterTypeStatement alterTypeStatement() throws RecognitionException {
		AlterTypeStatement expr = null;


		UTName name =null;
		FieldIdentifier f =null;
		CQL3Type.Raw v =null;
		FieldIdentifier id1 =null;
		FieldIdentifier toId1 =null;
		FieldIdentifier idn =null;
		FieldIdentifier toIdn =null;

		try {
			// Parser.g:823:5: ( K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* ) )
			// Parser.g:823:7: K_ALTER K_TYPE name= userTypeName ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement5537); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement5539); 
			pushFollow(FOLLOW_userTypeName_in_alterTypeStatement5543);
			name=userTypeName();
			state._fsp--;

			// Parser.g:824:11: ( K_ALTER f= fident K_TYPE v= comparatorType | K_ADD f= fident v= comparatorType | K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )* )
			int alt109=3;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt109=1;
				}
				break;
			case K_ADD:
				{
				alt109=2;
				}
				break;
			case K_RENAME:
				{
				alt109=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// Parser.g:824:13: K_ALTER f= fident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement5557); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5561);
					f=fident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement5563); 
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement5567);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.alter(name, f, v); 
					}
					break;
				case 2 :
					// Parser.g:825:13: K_ADD f= fident v= comparatorType
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement5583); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5589);
					f=fident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement5593);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.addition(name, f, v); 
					}
					break;
				case 3 :
					// Parser.g:826:13: K_RENAME id1= fident K_TO toId1= fident ( K_AND idn= fident K_TO toIdn= fident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement5616); 
					 Map<FieldIdentifier, FieldIdentifier> renames = new HashMap<>(); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5654);
					id1=fident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement5656); 
					pushFollow(FOLLOW_fident_in_alterTypeStatement5660);
					toId1=fident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// Parser.g:829:18: ( K_AND idn= fident K_TO toIdn= fident )*
					loop108:
					while (true) {
						int alt108=2;
						int LA108_0 = input.LA(1);
						if ( (LA108_0==K_AND) ) {
							alt108=1;
						}

						switch (alt108) {
						case 1 :
							// Parser.g:829:20: K_AND idn= fident K_TO toIdn= fident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTypeStatement5683); 
							pushFollow(FOLLOW_fident_in_alterTypeStatement5687);
							idn=fident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement5689); 
							pushFollow(FOLLOW_fident_in_alterTypeStatement5693);
							toIdn=fident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop108;
						}
					}

					 expr = AlterTypeStatement.renames(name, renames); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTypeStatement"



	// $ANTLR start "dropKeyspaceStatement"
	// Parser.g:838:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
	public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement ksp = null;


		String ks =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:840:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
			// Parser.g:840:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement5760); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement5762); 
			// Parser.g:840:25: ( K_IF K_EXISTS )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==K_IF) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// Parser.g:840:26: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement5765); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement5767); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement5776);
			ks=keyspaceName();
			state._fsp--;

			 ksp = new DropKeyspaceStatement(ks, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ksp;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// Parser.g:846:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropTableStatement dropTableStatement() throws RecognitionException {
		DropTableStatement stmt = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:848:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:848:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement5810); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement5812); 
			// Parser.g:848:29: ( K_IF K_EXISTS )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==K_IF) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// Parser.g:848:30: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement5815); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement5817); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement5826);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new DropTableStatement(cf, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "dropTypeStatement"
	// Parser.g:854:1: dropTypeStatement returns [DropTypeStatement stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
	public final DropTypeStatement dropTypeStatement() throws RecognitionException {
		DropTypeStatement stmt = null;


		UTName name =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:856:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
			// Parser.g:856:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement5860); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement5862); 
			// Parser.g:856:21: ( K_IF K_EXISTS )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==K_IF) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// Parser.g:856:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement5865); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement5867); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_dropTypeStatement5876);
			name=userTypeName();
			state._fsp--;

			 stmt = new DropTypeStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTypeStatement"



	// $ANTLR start "dropIndexStatement"
	// Parser.g:862:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName ;
	public final DropIndexStatement dropIndexStatement() throws RecognitionException {
		DropIndexStatement expr = null;


		IndexName index =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:864:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName )
			// Parser.g:864:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement5910); 
			match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement5912); 
			// Parser.g:864:22: ( K_IF K_EXISTS )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==K_IF) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// Parser.g:864:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement5915); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement5917); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_indexName_in_dropIndexStatement5926);
			index=indexName();
			state._fsp--;

			 expr = new DropIndexStatement(index, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "dropMaterializedViewStatement"
	// Parser.g:871:1: dropMaterializedViewStatement returns [DropViewStatement expr] : K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropViewStatement dropMaterializedViewStatement() throws RecognitionException {
		DropViewStatement expr = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// Parser.g:873:5: ( K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName )
			// Parser.g:873:7: K_DROP K_MATERIALIZED K_VIEW ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropMaterializedViewStatement5966); 
			match(input,K_MATERIALIZED,FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement5968); 
			match(input,K_VIEW,FOLLOW_K_VIEW_in_dropMaterializedViewStatement5970); 
			// Parser.g:873:36: ( K_IF K_EXISTS )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==K_IF) ) {
				alt114=1;
			}
			switch (alt114) {
				case 1 :
					// Parser.g:873:37: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropMaterializedViewStatement5973); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropMaterializedViewStatement5975); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropMaterializedViewStatement5984);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new DropViewStatement(cf, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropMaterializedViewStatement"



	// $ANTLR start "truncateStatement"
	// Parser.g:880:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement stmt = null;


		CFName cf =null;

		try {
			// Parser.g:881:5: ( K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName )
			// Parser.g:881:7: K_TRUNCATE ( K_COLUMNFAMILY )? cf= columnFamilyName
			{
			match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement6015); 
			// Parser.g:881:18: ( K_COLUMNFAMILY )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==K_COLUMNFAMILY) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// Parser.g:881:19: K_COLUMNFAMILY
					{
					match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_truncateStatement6018); 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_truncateStatement6024);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new TruncateStatement(cf); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "grantPermissionsStatement"
	// Parser.g:887:1: grantPermissionsStatement returns [GrantPermissionsStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName ;
	public final GrantPermissionsStatement grantPermissionsStatement() throws RecognitionException {
		GrantPermissionsStatement stmt = null;


		RoleName grantee =null;
		Set<Permission> permissionOrAll1 =null;
		IResource resource2 =null;

		try {
			// Parser.g:888:5: ( K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName )
			// Parser.g:888:7: K_GRANT permissionOrAll K_ON resource K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantPermissionsStatement6049); 
			pushFollow(FOLLOW_permissionOrAll_in_grantPermissionsStatement6061);
			permissionOrAll1=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_grantPermissionsStatement6069); 
			pushFollow(FOLLOW_resource_in_grantPermissionsStatement6081);
			resource2=resource();
			state._fsp--;

			match(input,K_TO,FOLLOW_K_TO_in_grantPermissionsStatement6089); 
			pushFollow(FOLLOW_userOrRoleName_in_grantPermissionsStatement6103);
			grantee=userOrRoleName();
			state._fsp--;

			 stmt = new GrantPermissionsStatement(filterPermissions(permissionOrAll1, resource2), resource2, grantee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantPermissionsStatement"



	// $ANTLR start "revokePermissionsStatement"
	// Parser.g:900:1: revokePermissionsStatement returns [RevokePermissionsStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName ;
	public final RevokePermissionsStatement revokePermissionsStatement() throws RecognitionException {
		RevokePermissionsStatement stmt = null;


		RoleName revokee =null;
		Set<Permission> permissionOrAll3 =null;
		IResource resource4 =null;

		try {
			// Parser.g:901:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName )
			// Parser.g:901:7: K_REVOKE permissionOrAll K_ON resource K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokePermissionsStatement6134); 
			pushFollow(FOLLOW_permissionOrAll_in_revokePermissionsStatement6146);
			permissionOrAll3=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_revokePermissionsStatement6154); 
			pushFollow(FOLLOW_resource_in_revokePermissionsStatement6166);
			resource4=resource();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_revokePermissionsStatement6174); 
			pushFollow(FOLLOW_userOrRoleName_in_revokePermissionsStatement6188);
			revokee=userOrRoleName();
			state._fsp--;

			 stmt = new RevokePermissionsStatement(filterPermissions(permissionOrAll3, resource4), resource4, revokee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokePermissionsStatement"



	// $ANTLR start "grantRoleStatement"
	// Parser.g:913:1: grantRoleStatement returns [GrantRoleStatement stmt] : K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName ;
	public final GrantRoleStatement grantRoleStatement() throws RecognitionException {
		GrantRoleStatement stmt = null;


		RoleName role =null;
		RoleName grantee =null;

		try {
			// Parser.g:914:5: ( K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName )
			// Parser.g:914:7: K_GRANT role= userOrRoleName K_TO grantee= userOrRoleName
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantRoleStatement6219); 
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement6233);
			role=userOrRoleName();
			state._fsp--;

			match(input,K_TO,FOLLOW_K_TO_in_grantRoleStatement6241); 
			pushFollow(FOLLOW_userOrRoleName_in_grantRoleStatement6255);
			grantee=userOrRoleName();
			state._fsp--;

			 stmt = new GrantRoleStatement(role, grantee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantRoleStatement"



	// $ANTLR start "revokeRoleStatement"
	// Parser.g:924:1: revokeRoleStatement returns [RevokeRoleStatement stmt] : K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName ;
	public final RevokeRoleStatement revokeRoleStatement() throws RecognitionException {
		RevokeRoleStatement stmt = null;


		RoleName role =null;
		RoleName revokee =null;

		try {
			// Parser.g:925:5: ( K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName )
			// Parser.g:925:7: K_REVOKE role= userOrRoleName K_FROM revokee= userOrRoleName
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeRoleStatement6286); 
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement6300);
			role=userOrRoleName();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_revokeRoleStatement6308); 
			pushFollow(FOLLOW_userOrRoleName_in_revokeRoleStatement6322);
			revokee=userOrRoleName();
			state._fsp--;

			 stmt = new RevokeRoleStatement(role, revokee); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokeRoleStatement"



	// $ANTLR start "listPermissionsStatement"
	// Parser.g:932:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
		ListPermissionsStatement stmt = null;


		IResource resource5 =null;
		Set<Permission> permissionOrAll6 =null;


		        IResource resource = null;
		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:938:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:938:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement6360); 
			pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement6372);
			permissionOrAll6=permissionOrAll();
			state._fsp--;

			// Parser.g:940:7: ( K_ON resource )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==K_ON) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// Parser.g:940:9: K_ON resource
					{
					match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement6382); 
					pushFollow(FOLLOW_resource_in_listPermissionsStatement6384);
					resource5=resource();
					state._fsp--;

					 resource = resource5; 
					}
					break;

			}

			// Parser.g:941:7: ( K_OF roleName[grantee] )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==K_OF) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// Parser.g:941:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement6399); 
					pushFollow(FOLLOW_roleName_in_listPermissionsStatement6401);
					roleName(grantee);
					state._fsp--;

					}
					break;

			}

			// Parser.g:942:7: ( K_NORECURSIVE )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==K_NORECURSIVE) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// Parser.g:942:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement6415); 
					 recursive = false; 
					}
					break;

			}

			 stmt = new ListPermissionsStatement(permissionOrAll6, resource, grantee, recursive); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listPermissionsStatement"



	// $ANTLR start "permission"
	// Parser.g:946:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) ;
	public final Permission permission() throws RecognitionException {
		Permission perm = null;


		Token p=null;

		try {
			// Parser.g:947:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE ) )
			// Parser.g:947:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE | K_DESCRIBE | K_EXECUTE )
			{
			p=input.LT(1);
			if ( input.LA(1)==K_ALTER||input.LA(1)==K_AUTHORIZE||input.LA(1)==K_CREATE||input.LA(1)==K_DESCRIBE||input.LA(1)==K_DROP||input.LA(1)==K_EXECUTE||input.LA(1)==K_MODIFY||input.LA(1)==K_SELECT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perm;
	}
	// $ANTLR end "permission"



	// $ANTLR start "permissionOrAll"
	// Parser.g:951:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? );
	public final Set<Permission> permissionOrAll() throws RecognitionException {
		Set<Permission> perms = null;


		Permission p =null;

		try {
			// Parser.g:952:5: ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? )
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==K_ALL) ) {
				alt121=1;
			}
			else if ( (LA121_0==K_ALTER||LA121_0==K_AUTHORIZE||LA121_0==K_CREATE||LA121_0==K_DESCRIBE||LA121_0==K_DROP||LA121_0==K_EXECUTE||LA121_0==K_MODIFY||LA121_0==K_SELECT) ) {
				alt121=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}

			switch (alt121) {
				case 1 :
					// Parser.g:952:7: K_ALL ( K_PERMISSIONS )?
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll6508); 
					// Parser.g:952:13: ( K_PERMISSIONS )?
					int alt119=2;
					int LA119_0 = input.LA(1);
					if ( (LA119_0==K_PERMISSIONS) ) {
						alt119=1;
					}
					switch (alt119) {
						case 1 :
							// Parser.g:952:15: K_PERMISSIONS
							{
							match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll6512); 
							}
							break;

					}

					 perms = Permission.ALL; 
					}
					break;
				case 2 :
					// Parser.g:953:7: p= permission ( K_PERMISSION )?
					{
					pushFollow(FOLLOW_permission_in_permissionOrAll6533);
					p=permission();
					state._fsp--;

					// Parser.g:953:20: ( K_PERMISSION )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==K_PERMISSION) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// Parser.g:953:22: K_PERMISSION
							{
							match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll6537); 
							}
							break;

					}

					 perms = EnumSet.of(p); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perms;
	}
	// $ANTLR end "permissionOrAll"



	// $ANTLR start "resource"
	// Parser.g:956:1: resource returns [IResource res] : (d= dataResource |r= roleResource |f= functionResource |j= jmxResource );
	public final IResource resource() throws RecognitionException {
		IResource res = null;


		DataResource d =null;
		RoleResource r =null;
		FunctionResource f =null;
		JMXResource j =null;

		try {
			// Parser.g:957:5: (d= dataResource |r= roleResource |f= functionResource |j= jmxResource )
			int alt122=4;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case K_FROM:
				case K_KEYSPACES:
				case K_NORECURSIVE:
				case K_OF:
				case K_TO:
				case 182:
				case 184:
					{
					alt122=1;
					}
					break;
				case K_ROLES:
					{
					alt122=2;
					}
					break;
				case K_FUNCTIONS:
					{
					alt122=3;
					}
					break;
				case K_MBEANS:
					{
					alt122=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACE:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt122=1;
				}
				break;
			case K_ROLE:
				{
				int LA122_3 = input.LA(2);
				if ( (LA122_3==EOF||LA122_3==K_FROM||LA122_3==K_NORECURSIVE||LA122_3==K_OF||LA122_3==K_TO||LA122_3==182||LA122_3==184) ) {
					alt122=1;
				}
				else if ( (LA122_3==IDENT||(LA122_3 >= K_AGGREGATE && LA122_3 <= K_ALL)||LA122_3==K_AS||LA122_3==K_ASCII||(LA122_3 >= K_BIGINT && LA122_3 <= K_BOOLEAN)||(LA122_3 >= K_CALLED && LA122_3 <= K_CLUSTERING)||(LA122_3 >= K_COMPACT && LA122_3 <= K_COUNTER)||(LA122_3 >= K_CUSTOM && LA122_3 <= K_DECIMAL)||(LA122_3 >= K_DISTINCT && LA122_3 <= K_DOUBLE)||(LA122_3 >= K_EXISTS && LA122_3 <= K_FLOAT)||LA122_3==K_FROZEN||(LA122_3 >= K_FUNCTION && LA122_3 <= K_FUNCTIONS)||LA122_3==K_INET||(LA122_3 >= K_INITCOND && LA122_3 <= K_INPUT)||LA122_3==K_INT||(LA122_3 >= K_JSON && LA122_3 <= K_KEYS)||(LA122_3 >= K_KEYSPACES && LA122_3 <= K_LIKE)||(LA122_3 >= K_LIST && LA122_3 <= K_MAP)||LA122_3==K_NOLOGIN||LA122_3==K_NOSUPERUSER||LA122_3==K_OPTIONS||(LA122_3 >= K_PARTITION && LA122_3 <= K_PERMISSIONS)||LA122_3==K_RETURNS||(LA122_3 >= K_ROLE && LA122_3 <= K_ROLES)||(LA122_3 >= K_SFUNC && LA122_3 <= K_TINYINT)||LA122_3==K_TRIGGER||(LA122_3 >= K_TTL && LA122_3 <= K_TYPE)||(LA122_3 >= K_USER && LA122_3 <= K_USERS)||(LA122_3 >= K_UUID && LA122_3 <= K_VARINT)||LA122_3==K_WRITETIME||(LA122_3 >= QMARK && LA122_3 <= QUOTED_NAME)||LA122_3==STRING_LITERAL) ) {
					alt122=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FUNCTION:
				{
				int LA122_4 = input.LA(2);
				if ( (LA122_4==EOF||LA122_4==K_FROM||LA122_4==K_NORECURSIVE||LA122_4==K_OF||LA122_4==K_TO||LA122_4==182||LA122_4==184) ) {
					alt122=1;
				}
				else if ( (LA122_4==IDENT||(LA122_4 >= K_AGGREGATE && LA122_4 <= K_ALL)||LA122_4==K_AS||LA122_4==K_ASCII||(LA122_4 >= K_BIGINT && LA122_4 <= K_BOOLEAN)||(LA122_4 >= K_CALLED && LA122_4 <= K_CLUSTERING)||(LA122_4 >= K_COMPACT && LA122_4 <= K_COUNTER)||(LA122_4 >= K_CUSTOM && LA122_4 <= K_DECIMAL)||(LA122_4 >= K_DISTINCT && LA122_4 <= K_DOUBLE)||(LA122_4 >= K_EXISTS && LA122_4 <= K_FLOAT)||LA122_4==K_FROZEN||(LA122_4 >= K_FUNCTION && LA122_4 <= K_FUNCTIONS)||LA122_4==K_INET||(LA122_4 >= K_INITCOND && LA122_4 <= K_INPUT)||LA122_4==K_INT||(LA122_4 >= K_JSON && LA122_4 <= K_KEYS)||(LA122_4 >= K_KEYSPACES && LA122_4 <= K_LIKE)||(LA122_4 >= K_LIST && LA122_4 <= K_MAP)||LA122_4==K_NOLOGIN||LA122_4==K_NOSUPERUSER||LA122_4==K_OPTIONS||(LA122_4 >= K_PARTITION && LA122_4 <= K_PERMISSIONS)||LA122_4==K_RETURNS||(LA122_4 >= K_ROLE && LA122_4 <= K_ROLES)||(LA122_4 >= K_SFUNC && LA122_4 <= K_TINYINT)||(LA122_4 >= K_TOKEN && LA122_4 <= K_TRIGGER)||(LA122_4 >= K_TTL && LA122_4 <= K_TYPE)||(LA122_4 >= K_USER && LA122_4 <= K_USERS)||(LA122_4 >= K_UUID && LA122_4 <= K_VARINT)||LA122_4==K_WRITETIME||(LA122_4 >= QMARK && LA122_4 <= QUOTED_NAME)) ) {
					alt122=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_MBEAN:
			case K_MBEANS:
				{
				alt122=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}
			switch (alt122) {
				case 1 :
					// Parser.g:957:7: d= dataResource
					{
					pushFollow(FOLLOW_dataResource_in_resource6565);
					d=dataResource();
					state._fsp--;

					 res = d; 
					}
					break;
				case 2 :
					// Parser.g:958:7: r= roleResource
					{
					pushFollow(FOLLOW_roleResource_in_resource6577);
					r=roleResource();
					state._fsp--;

					 res = r; 
					}
					break;
				case 3 :
					// Parser.g:959:7: f= functionResource
					{
					pushFollow(FOLLOW_functionResource_in_resource6589);
					f=functionResource();
					state._fsp--;

					 res = f; 
					}
					break;
				case 4 :
					// Parser.g:960:7: j= jmxResource
					{
					pushFollow(FOLLOW_jmxResource_in_resource6601);
					j=jmxResource();
					state._fsp--;

					 res = j; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "resource"



	// $ANTLR start "dataResource"
	// Parser.g:963:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
	public final DataResource dataResource() throws RecognitionException {
		DataResource res = null;


		String ks =null;
		CFName cf =null;

		try {
			// Parser.g:964:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
			int alt124=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				int LA124_1 = input.LA(2);
				if ( (LA124_1==K_KEYSPACES) ) {
					alt124=1;
				}
				else if ( (LA124_1==EOF||LA124_1==K_FROM||LA124_1==K_NORECURSIVE||LA124_1==K_OF||LA124_1==K_TO||LA124_1==182||LA124_1==184) ) {
					alt124=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYSPACE:
				{
				alt124=2;
				}
				break;
			case IDENT:
			case K_AGGREGATE:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QMARK:
			case QUOTED_NAME:
				{
				alt124=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// Parser.g:964:7: K_ALL K_KEYSPACES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource6624); 
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource6626); 
					 res = DataResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:965:7: K_KEYSPACE ks= keyspaceName
					{
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource6636); 
					pushFollow(FOLLOW_keyspaceName_in_dataResource6642);
					ks=keyspaceName();
					state._fsp--;

					 res = DataResource.keyspace(ks); 
					}
					break;
				case 3 :
					// Parser.g:966:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
					{
					// Parser.g:966:7: ( K_COLUMNFAMILY )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==K_COLUMNFAMILY) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// Parser.g:966:9: K_COLUMNFAMILY
							{
							match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource6654); 
							}
							break;

					}

					pushFollow(FOLLOW_columnFamilyName_in_dataResource6663);
					cf=columnFamilyName();
					state._fsp--;

					 res = DataResource.table(cf.getKeyspace(), cf.getColumnFamily()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "dataResource"



	// $ANTLR start "jmxResource"
	// Parser.g:970:1: jmxResource returns [JMXResource res] : ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean );
	public final JMXResource jmxResource() throws RecognitionException {
		JMXResource res = null;


		ParserRuleReturnScope mbean7 =null;
		ParserRuleReturnScope mbean8 =null;

		try {
			// Parser.g:971:5: ( K_ALL K_MBEANS | K_MBEAN mbean | K_MBEANS mbean )
			int alt125=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				alt125=1;
				}
				break;
			case K_MBEAN:
				{
				alt125=2;
				}
				break;
			case K_MBEANS:
				{
				alt125=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// Parser.g:971:7: K_ALL K_MBEANS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_jmxResource6692); 
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource6694); 
					 res = JMXResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:974:7: K_MBEAN mbean
					{
					match(input,K_MBEAN,FOLLOW_K_MBEAN_in_jmxResource6714); 
					pushFollow(FOLLOW_mbean_in_jmxResource6716);
					mbean7=mbean();
					state._fsp--;

					 res = JMXResource.mbean(canonicalizeObjectName((mbean7!=null?input.toString(mbean7.start,mbean7.stop):null), false)); 
					}
					break;
				case 3 :
					// Parser.g:975:7: K_MBEANS mbean
					{
					match(input,K_MBEANS,FOLLOW_K_MBEANS_in_jmxResource6726); 
					pushFollow(FOLLOW_mbean_in_jmxResource6728);
					mbean8=mbean();
					state._fsp--;

					 res = JMXResource.mbean(canonicalizeObjectName((mbean8!=null?input.toString(mbean8.start,mbean8.stop):null), true)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "jmxResource"



	// $ANTLR start "roleResource"
	// Parser.g:978:1: roleResource returns [RoleResource res] : ( K_ALL K_ROLES | K_ROLE role= userOrRoleName );
	public final RoleResource roleResource() throws RecognitionException {
		RoleResource res = null;


		RoleName role =null;

		try {
			// Parser.g:979:5: ( K_ALL K_ROLES | K_ROLE role= userOrRoleName )
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==K_ALL) ) {
				alt126=1;
			}
			else if ( (LA126_0==K_ROLE) ) {
				alt126=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}

			switch (alt126) {
				case 1 :
					// Parser.g:979:7: K_ALL K_ROLES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_roleResource6751); 
					match(input,K_ROLES,FOLLOW_K_ROLES_in_roleResource6753); 
					 res = RoleResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:980:7: K_ROLE role= userOrRoleName
					{
					match(input,K_ROLE,FOLLOW_K_ROLE_in_roleResource6763); 
					pushFollow(FOLLOW_userOrRoleName_in_roleResource6769);
					role=userOrRoleName();
					state._fsp--;

					 res = RoleResource.role(role.getName()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "roleResource"



	// $ANTLR start "functionResource"
	// Parser.g:983:1: functionResource returns [FunctionResource res] : ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) );
	public final FunctionResource functionResource() throws RecognitionException {
		FunctionResource res = null;


		String ks =null;
		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// Parser.g:987:5: ( K_ALL K_FUNCTIONS | K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName | K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' ) )
			int alt129=3;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==K_ALL) ) {
				int LA129_1 = input.LA(2);
				if ( (LA129_1==K_FUNCTIONS) ) {
					int LA129_3 = input.LA(3);
					if ( (LA129_3==K_IN) ) {
						alt129=2;
					}
					else if ( (LA129_3==EOF||LA129_3==K_FROM||LA129_3==K_NORECURSIVE||LA129_3==K_OF||LA129_3==K_TO||LA129_3==184) ) {
						alt129=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 129, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 129, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA129_0==K_FUNCTION) ) {
				alt129=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}

			switch (alt129) {
				case 1 :
					// Parser.g:987:7: K_ALL K_FUNCTIONS
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource6801); 
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource6803); 
					 res = FunctionResource.root(); 
					}
					break;
				case 2 :
					// Parser.g:988:7: K_ALL K_FUNCTIONS K_IN K_KEYSPACE ks= keyspaceName
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_functionResource6813); 
					match(input,K_FUNCTIONS,FOLLOW_K_FUNCTIONS_in_functionResource6815); 
					match(input,K_IN,FOLLOW_K_IN_in_functionResource6817); 
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_functionResource6819); 
					pushFollow(FOLLOW_keyspaceName_in_functionResource6825);
					ks=keyspaceName();
					state._fsp--;

					 res = FunctionResource.keyspace(ks); 
					}
					break;
				case 3 :
					// Parser.g:990:7: K_FUNCTION fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					{
					match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_functionResource6840); 
					pushFollow(FOLLOW_functionName_in_functionResource6844);
					fn=functionName();
					state._fsp--;

					// Parser.g:991:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )
					// Parser.g:992:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,177,FOLLOW_177_in_functionResource6862); 
					// Parser.g:993:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt128=2;
					int LA128_0 = input.LA(1);
					if ( (LA128_0==IDENT||(LA128_0 >= K_AGGREGATE && LA128_0 <= K_ALL)||LA128_0==K_AS||LA128_0==K_ASCII||(LA128_0 >= K_BIGINT && LA128_0 <= K_BOOLEAN)||(LA128_0 >= K_CALLED && LA128_0 <= K_CLUSTERING)||(LA128_0 >= K_COMPACT && LA128_0 <= K_COUNTER)||(LA128_0 >= K_CUSTOM && LA128_0 <= K_DECIMAL)||(LA128_0 >= K_DISTINCT && LA128_0 <= K_DOUBLE)||(LA128_0 >= K_EXISTS && LA128_0 <= K_FLOAT)||LA128_0==K_FROZEN||(LA128_0 >= K_FUNCTION && LA128_0 <= K_FUNCTIONS)||LA128_0==K_INET||(LA128_0 >= K_INITCOND && LA128_0 <= K_INPUT)||LA128_0==K_INT||(LA128_0 >= K_JSON && LA128_0 <= K_KEYS)||(LA128_0 >= K_KEYSPACES && LA128_0 <= K_LIKE)||(LA128_0 >= K_LIST && LA128_0 <= K_MAP)||LA128_0==K_NOLOGIN||LA128_0==K_NOSUPERUSER||LA128_0==K_OPTIONS||(LA128_0 >= K_PARTITION && LA128_0 <= K_PERMISSIONS)||LA128_0==K_RETURNS||(LA128_0 >= K_ROLE && LA128_0 <= K_ROLES)||(LA128_0 >= K_SET && LA128_0 <= K_TINYINT)||LA128_0==K_TRIGGER||(LA128_0 >= K_TTL && LA128_0 <= K_TYPE)||(LA128_0 >= K_USER && LA128_0 <= K_USERS)||(LA128_0 >= K_UUID && LA128_0 <= K_VARINT)||LA128_0==K_WRITETIME||LA128_0==QUOTED_NAME||LA128_0==STRING_LITERAL) ) {
						alt128=1;
					}
					switch (alt128) {
						case 1 :
							// Parser.g:994:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_functionResource6890);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// Parser.g:995:13: ( ',' v= comparatorType )*
							loop127:
							while (true) {
								int alt127=2;
								int LA127_0 = input.LA(1);
								if ( (LA127_0==180) ) {
									alt127=1;
								}

								switch (alt127) {
								case 1 :
									// Parser.g:995:15: ',' v= comparatorType
									{
									match(input,180,FOLLOW_180_in_functionResource6908); 
									pushFollow(FOLLOW_comparatorType_in_functionResource6912);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop127;
								}
							}

							}
							break;

					}

					match(input,178,FOLLOW_178_in_functionResource6940); 
					}

					 res = FunctionResource.functionFromCql(fn.keyspace, fn.name, argsTypes); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "functionResource"



	// $ANTLR start "createUserStatement"
	// Parser.g:1005:1: createUserStatement returns [CreateRoleStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final CreateRoleStatement createUserStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        opts.setOption(IRoleManager.Option.LOGIN, true);
		        boolean superuser = false;
		        boolean ifNotExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1013:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1013:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement6988); 
			match(input,K_USER,FOLLOW_K_USER_in_createUserStatement6990); 
			// Parser.g:1013:23: ( K_IF K_NOT K_EXISTS )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==K_IF) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// Parser.g:1013:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createUserStatement6993); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement6995); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement6997); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_createUserStatement7005);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); 
			// Parser.g:1014:7: ( K_WITH userPassword[opts] )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==K_WITH) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// Parser.g:1014:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement7017); 
					pushFollow(FOLLOW_userPassword_in_createUserStatement7019);
					userPassword(opts);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1015:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt132=3;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==K_SUPERUSER) ) {
				alt132=1;
			}
			else if ( (LA132_0==K_NOSUPERUSER) ) {
				alt132=2;
			}
			switch (alt132) {
				case 1 :
					// Parser.g:1015:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement7033); 
					 superuser = true; 
					}
					break;
				case 2 :
					// Parser.g:1015:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement7039); 
					 superuser = false; 
					}
					break;

			}

			 opts.setOption(IRoleManager.Option.SUPERUSER, superuser);
			        stmt = new CreateRoleStatement(name, opts, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createUserStatement"



	// $ANTLR start "alterUserStatement"
	// Parser.g:1023:1: alterUserStatement returns [AlterRoleStatement stmt] : K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final AlterRoleStatement alterUserStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        RoleOptions opts = new RoleOptions();
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1028:5: ( K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// Parser.g:1028:7: K_ALTER K_USER u= username ( K_WITH userPassword[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement7084); 
			match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement7086); 
			pushFollow(FOLLOW_username_in_alterUserStatement7090);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); 
			// Parser.g:1029:7: ( K_WITH userPassword[opts] )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==K_WITH) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// Parser.g:1029:9: K_WITH userPassword[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement7102); 
					pushFollow(FOLLOW_userPassword_in_alterUserStatement7104);
					userPassword(opts);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1030:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt134=3;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==K_SUPERUSER) ) {
				alt134=1;
			}
			else if ( (LA134_0==K_NOSUPERUSER) ) {
				alt134=2;
			}
			switch (alt134) {
				case 1 :
					// Parser.g:1030:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement7118); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, true); 
					}
					break;
				case 2 :
					// Parser.g:1031:11: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement7132); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, false); 
					}
					break;

			}

			  stmt = new AlterRoleStatement(name, opts); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterUserStatement"



	// $ANTLR start "dropUserStatement"
	// Parser.g:1038:1: dropUserStatement returns [DropRoleStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? u= username ;
	public final DropRoleStatement dropUserStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		ParserRuleReturnScope u =null;


		        boolean ifExists = false;
		        RoleName name = new RoleName();
		    
		try {
			// Parser.g:1043:5: ( K_DROP K_USER ( K_IF K_EXISTS )? u= username )
			// Parser.g:1043:7: K_DROP K_USER ( K_IF K_EXISTS )? u= username
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement7178); 
			match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement7180); 
			// Parser.g:1043:21: ( K_IF K_EXISTS )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==K_IF) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// Parser.g:1043:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement7183); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement7185); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_dropUserStatement7193);
			u=username();
			state._fsp--;

			 name.setName((u!=null?input.toString(u.start,u.stop):null), true); stmt = new DropRoleStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropUserStatement"



	// $ANTLR start "listUsersStatement"
	// Parser.g:1049:1: listUsersStatement returns [ListRolesStatement stmt] : K_LIST K_USERS ;
	public final ListRolesStatement listUsersStatement() throws RecognitionException {
		ListRolesStatement stmt = null;


		try {
			// Parser.g:1050:5: ( K_LIST K_USERS )
			// Parser.g:1050:7: K_LIST K_USERS
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement7218); 
			match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement7220); 
			 stmt = new ListUsersStatement(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listUsersStatement"



	// $ANTLR start "createRoleStatement"
	// Parser.g:1062:1: createRoleStatement returns [CreateRoleStatement stmt] : K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final CreateRoleStatement createRoleStatement() throws RecognitionException {
		CreateRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		        boolean ifNotExists = false;
		    
		try {
			// Parser.g:1067:5: ( K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1067:7: K_CREATE K_ROLE ( K_IF K_NOT K_EXISTS )? name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createRoleStatement7254); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_createRoleStatement7256); 
			// Parser.g:1067:23: ( K_IF K_NOT K_EXISTS )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==K_IF) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// Parser.g:1067:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createRoleStatement7259); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createRoleStatement7261); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createRoleStatement7263); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_createRoleStatement7271);
			name=userOrRoleName();
			state._fsp--;

			// Parser.g:1068:7: ( K_WITH roleOptions[opts] )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==K_WITH) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// Parser.g:1068:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createRoleStatement7281); 
					pushFollow(FOLLOW_roleOptions_in_createRoleStatement7283);
					roleOptions(opts);
					state._fsp--;

					}
					break;

			}


			        // set defaults if they weren't explictly supplied
			        if (!opts.getLogin().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.LOGIN, false);
			        }
			        if (!opts.getSuperuser().isPresent())
			        {
			            opts.setOption(IRoleManager.Option.SUPERUSER, false);
			        }
			        stmt = new CreateRoleStatement(name, opts, ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createRoleStatement"



	// $ANTLR start "alterRoleStatement"
	// Parser.g:1092:1: alterRoleStatement returns [AlterRoleStatement stmt] : K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? ;
	public final AlterRoleStatement alterRoleStatement() throws RecognitionException {
		AlterRoleStatement stmt = null;


		RoleName name =null;


		        RoleOptions opts = new RoleOptions();
		    
		try {
			// Parser.g:1096:5: ( K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )? )
			// Parser.g:1096:7: K_ALTER K_ROLE name= userOrRoleName ( K_WITH roleOptions[opts] )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterRoleStatement7327); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_alterRoleStatement7329); 
			pushFollow(FOLLOW_userOrRoleName_in_alterRoleStatement7333);
			name=userOrRoleName();
			state._fsp--;

			// Parser.g:1097:7: ( K_WITH roleOptions[opts] )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==K_WITH) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// Parser.g:1097:9: K_WITH roleOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterRoleStatement7343); 
					pushFollow(FOLLOW_roleOptions_in_alterRoleStatement7345);
					roleOptions(opts);
					state._fsp--;

					}
					break;

			}

			  stmt = new AlterRoleStatement(name, opts); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterRoleStatement"



	// $ANTLR start "dropRoleStatement"
	// Parser.g:1104:1: dropRoleStatement returns [DropRoleStatement stmt] : K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName ;
	public final DropRoleStatement dropRoleStatement() throws RecognitionException {
		DropRoleStatement stmt = null;


		RoleName name =null;


		        boolean ifExists = false;
		    
		try {
			// Parser.g:1108:5: ( K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName )
			// Parser.g:1108:7: K_DROP K_ROLE ( K_IF K_EXISTS )? name= userOrRoleName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropRoleStatement7389); 
			match(input,K_ROLE,FOLLOW_K_ROLE_in_dropRoleStatement7391); 
			// Parser.g:1108:21: ( K_IF K_EXISTS )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==K_IF) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// Parser.g:1108:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropRoleStatement7394); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropRoleStatement7396); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userOrRoleName_in_dropRoleStatement7404);
			name=userOrRoleName();
			state._fsp--;

			 stmt = new DropRoleStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropRoleStatement"



	// $ANTLR start "listRolesStatement"
	// Parser.g:1115:1: listRolesStatement returns [ListRolesStatement stmt] : K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? ;
	public final ListRolesStatement listRolesStatement() throws RecognitionException {
		ListRolesStatement stmt = null;



		        boolean recursive = true;
		        RoleName grantee = new RoleName();
		    
		try {
			// Parser.g:1120:5: ( K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )? )
			// Parser.g:1120:7: K_LIST K_ROLES ( K_OF roleName[grantee] )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listRolesStatement7444); 
			match(input,K_ROLES,FOLLOW_K_ROLES_in_listRolesStatement7446); 
			// Parser.g:1121:7: ( K_OF roleName[grantee] )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==K_OF) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// Parser.g:1121:9: K_OF roleName[grantee]
					{
					match(input,K_OF,FOLLOW_K_OF_in_listRolesStatement7456); 
					pushFollow(FOLLOW_roleName_in_listRolesStatement7458);
					roleName(grantee);
					state._fsp--;

					}
					break;

			}

			// Parser.g:1122:7: ( K_NORECURSIVE )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==K_NORECURSIVE) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// Parser.g:1122:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listRolesStatement7471); 
					 recursive = false; 
					}
					break;

			}

			 stmt = new ListRolesStatement(grantee, recursive); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listRolesStatement"



	// $ANTLR start "roleOptions"
	// Parser.g:1126:1: roleOptions[RoleOptions opts] : roleOption[opts] ( K_AND roleOption[opts] )* ;
	public final void roleOptions(RoleOptions opts) throws RecognitionException {
		try {
			// Parser.g:1127:5: ( roleOption[opts] ( K_AND roleOption[opts] )* )
			// Parser.g:1127:7: roleOption[opts] ( K_AND roleOption[opts] )*
			{
			pushFollow(FOLLOW_roleOption_in_roleOptions7502);
			roleOption(opts);
			state._fsp--;

			// Parser.g:1127:24: ( K_AND roleOption[opts] )*
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==K_AND) ) {
					alt142=1;
				}

				switch (alt142) {
				case 1 :
					// Parser.g:1127:25: K_AND roleOption[opts]
					{
					match(input,K_AND,FOLLOW_K_AND_in_roleOptions7506); 
					pushFollow(FOLLOW_roleOption_in_roleOptions7508);
					roleOption(opts);
					state._fsp--;

					}
					break;

				default :
					break loop142;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOptions"



	// $ANTLR start "roleOption"
	// Parser.g:1130:1: roleOption[RoleOptions opts] : ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= mapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN );
	public final void roleOption(RoleOptions opts) throws RecognitionException {
		Token v=null;
		Token b=null;
		Maps.Literal m =null;

		try {
			// Parser.g:1131:5: ( K_PASSWORD '=' v= STRING_LITERAL | K_OPTIONS '=' m= mapLiteral | K_SUPERUSER '=' b= BOOLEAN | K_LOGIN '=' b= BOOLEAN )
			int alt143=4;
			switch ( input.LA(1) ) {
			case K_PASSWORD:
				{
				alt143=1;
				}
				break;
			case K_OPTIONS:
				{
				alt143=2;
				}
				break;
			case K_SUPERUSER:
				{
				alt143=3;
				}
				break;
			case K_LOGIN:
				{
				alt143=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 143, 0, input);
				throw nvae;
			}
			switch (alt143) {
				case 1 :
					// Parser.g:1131:8: K_PASSWORD '=' v= STRING_LITERAL
					{
					match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_roleOption7530); 
					match(input,187,FOLLOW_187_in_roleOption7532); 
					v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleOption7536); 
					 opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1132:8: K_OPTIONS '=' m= mapLiteral
					{
					match(input,K_OPTIONS,FOLLOW_K_OPTIONS_in_roleOption7547); 
					match(input,187,FOLLOW_187_in_roleOption7549); 
					pushFollow(FOLLOW_mapLiteral_in_roleOption7553);
					m=mapLiteral();
					state._fsp--;

					 opts.setOption(IRoleManager.Option.OPTIONS, convertPropertyMap(m)); 
					}
					break;
				case 3 :
					// Parser.g:1133:8: K_SUPERUSER '=' b= BOOLEAN
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_roleOption7564); 
					match(input,187,FOLLOW_187_in_roleOption7566); 
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption7570); 
					 opts.setOption(IRoleManager.Option.SUPERUSER, Boolean.valueOf((b!=null?b.getText():null))); 
					}
					break;
				case 4 :
					// Parser.g:1134:8: K_LOGIN '=' b= BOOLEAN
					{
					match(input,K_LOGIN,FOLLOW_K_LOGIN_in_roleOption7581); 
					match(input,187,FOLLOW_187_in_roleOption7583); 
					b=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_roleOption7587); 
					 opts.setOption(IRoleManager.Option.LOGIN, Boolean.valueOf((b!=null?b.getText():null))); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleOption"



	// $ANTLR start "userPassword"
	// Parser.g:1138:1: userPassword[RoleOptions opts] : K_PASSWORD v= STRING_LITERAL ;
	public final void userPassword(RoleOptions opts) throws RecognitionException {
		Token v=null;

		try {
			// Parser.g:1139:5: ( K_PASSWORD v= STRING_LITERAL )
			// Parser.g:1139:8: K_PASSWORD v= STRING_LITERAL
			{
			match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userPassword7609); 
			v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userPassword7613); 
			 opts.setOption(IRoleManager.Option.PASSWORD, (v!=null?v.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "userPassword"



	// $ANTLR start "cident"
	// Parser.g:1147:1: cident returns [ColumnDefinition.Raw id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnDefinition.Raw cident() throws RecognitionException {
		ColumnDefinition.Raw id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1148:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt144=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt144=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt144=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt144=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}
			switch (alt144) {
				case 1 :
					// Parser.g:1148:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident7644); 
					 id = ColumnDefinition.Raw.forUnquoted((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1149:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident7669); 
					 id = ColumnDefinition.Raw.forQuoted((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1150:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cident7688);
					k=unreserved_keyword();
					state._fsp--;

					 id = ColumnDefinition.Raw.forUnquoted(k); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "cident"



	// $ANTLR start "ident"
	// Parser.g:1154:1: ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1155:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt145=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt145=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt145=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt145=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}
			switch (alt145) {
				case 1 :
					// Parser.g:1155:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident7714); 
					 id = ColumnIdentifier.getInterned((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1156:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident7739); 
					 id = ColumnIdentifier.getInterned((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1157:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ident7758);
					k=unreserved_keyword();
					state._fsp--;

					 id = ColumnIdentifier.getInterned(k, false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "ident"



	// $ANTLR start "fident"
	// Parser.g:1160:1: fident returns [FieldIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final FieldIdentifier fident() throws RecognitionException {
		FieldIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1161:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt146=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt146=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt146=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt146=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}
			switch (alt146) {
				case 1 :
					// Parser.g:1161:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_fident7783); 
					 id = FieldIdentifier.forUnquoted((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1162:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_fident7808); 
					 id = FieldIdentifier.forQuoted((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1163:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_fident7827);
					k=unreserved_keyword();
					state._fsp--;

					 id = FieldIdentifier.forUnquoted(k); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "fident"



	// $ANTLR start "noncol_ident"
	// Parser.g:1167:1: noncol_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier noncol_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// Parser.g:1168:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt147=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt147=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt147=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt147=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 147, 0, input);
				throw nvae;
			}
			switch (alt147) {
				case 1 :
					// Parser.g:1168:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_noncol_ident7853); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1169:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_noncol_ident7878); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1170:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_noncol_ident7897);
					k=unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "noncol_ident"



	// $ANTLR start "keyspaceName"
	// Parser.g:1174:1: keyspaceName returns [String id] : ksName[name] ;
	public final String keyspaceName() throws RecognitionException {
		String id = null;


		 CFName name = new CFName(); 
		try {
			// Parser.g:1176:5: ( ksName[name] )
			// Parser.g:1176:7: ksName[name]
			{
			pushFollow(FOLLOW_ksName_in_keyspaceName7930);
			ksName(name);
			state._fsp--;

			 id = name.getKeyspace(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "keyspaceName"



	// $ANTLR start "indexName"
	// Parser.g:1179:1: indexName returns [IndexName name] : ( ksName[name] '.' )? idxName[name] ;
	public final IndexName indexName() throws RecognitionException {
		IndexName name = null;


		 name = new IndexName(); 
		try {
			// Parser.g:1181:5: ( ( ksName[name] '.' )? idxName[name] )
			// Parser.g:1181:7: ( ksName[name] '.' )? idxName[name]
			{
			// Parser.g:1181:7: ( ksName[name] '.' )?
			int alt148=2;
			alt148 = dfa148.predict(input);
			switch (alt148) {
				case 1 :
					// Parser.g:1181:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_indexName7964);
					ksName(name);
					state._fsp--;

					match(input,182,FOLLOW_182_in_indexName7967); 
					}
					break;

			}

			pushFollow(FOLLOW_idxName_in_indexName7971);
			idxName(name);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "indexName"



	// $ANTLR start "columnFamilyName"
	// Parser.g:1184:1: columnFamilyName returns [CFName name] : ( ksName[name] '.' )? cfName[name] ;
	public final CFName columnFamilyName() throws RecognitionException {
		CFName name = null;


		 name = new CFName(); 
		try {
			// Parser.g:1186:5: ( ( ksName[name] '.' )? cfName[name] )
			// Parser.g:1186:7: ( ksName[name] '.' )? cfName[name]
			{
			// Parser.g:1186:7: ( ksName[name] '.' )?
			int alt149=2;
			alt149 = dfa149.predict(input);
			switch (alt149) {
				case 1 :
					// Parser.g:1186:8: ksName[name] '.'
					{
					pushFollow(FOLLOW_ksName_in_columnFamilyName8003);
					ksName(name);
					state._fsp--;

					match(input,182,FOLLOW_182_in_columnFamilyName8006); 
					}
					break;

			}

			pushFollow(FOLLOW_cfName_in_columnFamilyName8010);
			cfName(name);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "columnFamilyName"



	// $ANTLR start "userTypeName"
	// Parser.g:1189:1: userTypeName returns [UTName name] : (ks= noncol_ident '.' )? ut= non_type_ident ;
	public final UTName userTypeName() throws RecognitionException {
		UTName name = null;


		ColumnIdentifier ks =null;
		ColumnIdentifier ut =null;

		try {
			// Parser.g:1190:5: ( (ks= noncol_ident '.' )? ut= non_type_ident )
			// Parser.g:1190:7: (ks= noncol_ident '.' )? ut= non_type_ident
			{
			// Parser.g:1190:7: (ks= noncol_ident '.' )?
			int alt150=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA150_1 = input.LA(2);
					if ( (LA150_1==182) ) {
						alt150=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA150_2 = input.LA(2);
					if ( (LA150_2==182) ) {
						alt150=1;
					}
					}
					break;
				case K_AGGREGATE:
				case K_ALL:
				case K_AS:
				case K_CALLED:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_EXISTS:
				case K_FILTERING:
				case K_FINALFUNC:
				case K_FROZEN:
				case K_FUNCTION:
				case K_FUNCTIONS:
				case K_INITCOND:
				case K_INPUT:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIKE:
				case K_LIST:
				case K_LOGIN:
				case K_MAP:
				case K_NOLOGIN:
				case K_NOSUPERUSER:
				case K_OPTIONS:
				case K_PARTITION:
				case K_PASSWORD:
				case K_PER:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_ROLE:
				case K_ROLES:
				case K_SFUNC:
				case K_STATIC:
				case K_STORAGE:
				case K_STYPE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TUPLE:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA150_3 = input.LA(2);
					if ( (LA150_3==182) ) {
						alt150=1;
					}
					}
					break;
				case K_ASCII:
				case K_BIGINT:
				case K_BLOB:
				case K_BOOLEAN:
				case K_CAST:
				case K_COUNT:
				case K_COUNTER:
				case K_DATE:
				case K_DECIMAL:
				case K_DISTINCT:
				case K_DOUBLE:
				case K_FLOAT:
				case K_INET:
				case K_INT:
				case K_JSON:
				case K_SMALLINT:
				case K_TEXT:
				case K_TIME:
				case K_TIMESTAMP:
				case K_TIMEUUID:
				case K_TINYINT:
				case K_TTL:
				case K_UUID:
				case K_VARCHAR:
				case K_VARINT:
				case K_WRITETIME:
					{
					alt150=1;
					}
					break;
				case K_KEY:
					{
					int LA150_5 = input.LA(2);
					if ( (LA150_5==182) ) {
						alt150=1;
					}
					}
					break;
			}
			switch (alt150) {
				case 1 :
					// Parser.g:1190:8: ks= noncol_ident '.'
					{
					pushFollow(FOLLOW_noncol_ident_in_userTypeName8035);
					ks=noncol_ident();
					state._fsp--;

					match(input,182,FOLLOW_182_in_userTypeName8037); 
					}
					break;

			}

			pushFollow(FOLLOW_non_type_ident_in_userTypeName8043);
			ut=non_type_ident();
			state._fsp--;

			 return new UTName(ks, ut); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userTypeName"



	// $ANTLR start "userOrRoleName"
	// Parser.g:1193:1: userOrRoleName returns [RoleName name] : roleName[name] ;
	public final RoleName userOrRoleName() throws RecognitionException {
		RoleName name = null;


		 name = new RoleName(); 
		try {
			// Parser.g:1195:5: ( roleName[name] )
			// Parser.g:1195:7: roleName[name]
			{
			pushFollow(FOLLOW_roleName_in_userOrRoleName8075);
			roleName(name);
			state._fsp--;

			return name;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userOrRoleName"



	// $ANTLR start "ksName"
	// Parser.g:1198:1: ksName[KeyspaceElementName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void ksName(KeyspaceElementName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1199:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt151=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt151=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt151=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt151=3;
				}
				break;
			case QMARK:
				{
				alt151=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}
			switch (alt151) {
				case 1 :
					// Parser.g:1199:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ksName8098); 
					 name.setKeyspace((t!=null?t.getText():null), false);
					}
					break;
				case 2 :
					// Parser.g:1200:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ksName8123); 
					 name.setKeyspace((t!=null?t.getText():null), true);
					}
					break;
				case 3 :
					// Parser.g:1201:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_ksName8142);
					k=unreserved_keyword();
					state._fsp--;

					 name.setKeyspace(k, false);
					}
					break;
				case 4 :
					// Parser.g:1202:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_ksName8152); 
					addRecognitionError("Bind variables cannot be used for keyspace names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ksName"



	// $ANTLR start "cfName"
	// Parser.g:1205:1: cfName[CFName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void cfName(CFName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1206:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt152=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt152=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt152=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt152=3;
				}
				break;
			case QMARK:
				{
				alt152=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 152, 0, input);
				throw nvae;
			}
			switch (alt152) {
				case 1 :
					// Parser.g:1206:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfName8174); 
					 name.setColumnFamily((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1207:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfName8199); 
					 name.setColumnFamily((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1208:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cfName8218);
					k=unreserved_keyword();
					state._fsp--;

					 name.setColumnFamily(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1209:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_cfName8228); 
					addRecognitionError("Bind variables cannot be used for table names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cfName"



	// $ANTLR start "idxName"
	// Parser.g:1212:1: idxName[IndexName name] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void idxName(IndexName name) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// Parser.g:1213:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt153=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt153=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt153=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt153=3;
				}
				break;
			case QMARK:
				{
				alt153=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}
			switch (alt153) {
				case 1 :
					// Parser.g:1213:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_idxName8250); 
					 name.setIndex((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1214:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_idxName8275); 
					 name.setIndex((t!=null?t.getText():null), true);
					}
					break;
				case 3 :
					// Parser.g:1215:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_idxName8294);
					k=unreserved_keyword();
					state._fsp--;

					 name.setIndex(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1216:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_idxName8304); 
					addRecognitionError("Bind variables cannot be used for index names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idxName"



	// $ANTLR start "roleName"
	// Parser.g:1219:1: roleName[RoleName name] : (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK );
	public final void roleName(RoleName name) throws RecognitionException {
		Token t=null;
		Token s=null;
		String k =null;

		try {
			// Parser.g:1220:5: (t= IDENT |s= STRING_LITERAL |t= QUOTED_NAME |k= unreserved_keyword | QMARK )
			int alt154=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt154=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt154=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt154=3;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CAST:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_JSON:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TTL:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt154=4;
				}
				break;
			case QMARK:
				{
				alt154=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}
			switch (alt154) {
				case 1 :
					// Parser.g:1220:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_roleName8326); 
					 name.setName((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1221:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_roleName8351); 
					 name.setName((s!=null?s.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1222:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_roleName8367); 
					 name.setName((t!=null?t.getText():null), true); 
					}
					break;
				case 4 :
					// Parser.g:1223:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_roleName8386);
					k=unreserved_keyword();
					state._fsp--;

					 name.setName(k, false); 
					}
					break;
				case 5 :
					// Parser.g:1224:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_roleName8396); 
					addRecognitionError("Bind variables cannot be used for role names");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "roleName"



	// $ANTLR start "constant"
	// Parser.g:1227:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) );
	public final Constants.Literal constant() throws RecognitionException {
		Constants.Literal constant = null;


		Token t=null;

		try {
			// Parser.g:1228:5: (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) )
			int alt156=7;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt156=1;
				}
				break;
			case INTEGER:
				{
				alt156=2;
				}
				break;
			case FLOAT:
				{
				alt156=3;
				}
				break;
			case BOOLEAN:
				{
				alt156=4;
				}
				break;
			case UUID:
				{
				alt156=5;
				}
				break;
			case HEXNUMBER:
				{
				alt156=6;
				}
				break;
			case K_INFINITY:
			case K_NAN:
			case 181:
				{
				alt156=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}
			switch (alt156) {
				case 1 :
					// Parser.g:1228:7: t= STRING_LITERAL
					{
					t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant8421); 
					 constant = Constants.Literal.string((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// Parser.g:1229:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant8433); 
					 constant = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1230:7: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant8452); 
					 constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 
					}
					break;
				case 4 :
					// Parser.g:1231:7: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant8473); 
					 constant = Constants.Literal.bool((t!=null?t.getText():null)); 
					}
					break;
				case 5 :
					// Parser.g:1232:7: t= UUID
					{
					t=(Token)match(input,UUID,FOLLOW_UUID_in_constant8492); 
					 constant = Constants.Literal.uuid((t!=null?t.getText():null)); 
					}
					break;
				case 6 :
					// Parser.g:1233:7: t= HEXNUMBER
					{
					t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant8514); 
					 constant = Constants.Literal.hex((t!=null?t.getText():null)); 
					}
					break;
				case 7 :
					// Parser.g:1234:7: ( '-' )? t= ( K_NAN | K_INFINITY )
					{
					 String sign=""; 
					// Parser.g:1234:27: ( '-' )?
					int alt155=2;
					int LA155_0 = input.LA(1);
					if ( (LA155_0==181) ) {
						alt155=1;
					}
					switch (alt155) {
						case 1 :
							// Parser.g:1234:28: '-'
							{
							match(input,181,FOLLOW_181_in_constant8532); 
							sign = "-"; 
							}
							break;

					}

					t=input.LT(1);
					if ( input.LA(1)==K_INFINITY||input.LA(1)==K_NAN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 constant = Constants.Literal.floatingPoint(sign + (t!=null?t.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return constant;
	}
	// $ANTLR end "constant"



	// $ANTLR start "mapLiteral"
	// Parser.g:1237:1: mapLiteral returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
	public final Maps.Literal mapLiteral() throws RecognitionException {
		Maps.Literal map = null;


		Term.Raw k1 =null;
		Term.Raw v1 =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		try {
			// Parser.g:1238:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
			// Parser.g:1238:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
			{
			match(input,194,FOLLOW_194_in_mapLiteral8570); 
			 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
			// Parser.g:1239:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==BOOLEAN||LA158_0==FLOAT||LA158_0==HEXNUMBER||(LA158_0 >= IDENT && LA158_0 <= INTEGER)||(LA158_0 >= K_AGGREGATE && LA158_0 <= K_ALL)||LA158_0==K_AS||LA158_0==K_ASCII||(LA158_0 >= K_BIGINT && LA158_0 <= K_BOOLEAN)||(LA158_0 >= K_CALLED && LA158_0 <= K_CLUSTERING)||(LA158_0 >= K_COMPACT && LA158_0 <= K_COUNTER)||(LA158_0 >= K_CUSTOM && LA158_0 <= K_DECIMAL)||(LA158_0 >= K_DISTINCT && LA158_0 <= K_DOUBLE)||(LA158_0 >= K_EXISTS && LA158_0 <= K_FLOAT)||LA158_0==K_FROZEN||(LA158_0 >= K_FUNCTION && LA158_0 <= K_FUNCTIONS)||(LA158_0 >= K_INET && LA158_0 <= K_INPUT)||LA158_0==K_INT||(LA158_0 >= K_JSON && LA158_0 <= K_KEYS)||(LA158_0 >= K_KEYSPACES && LA158_0 <= K_LIKE)||(LA158_0 >= K_LIST && LA158_0 <= K_MAP)||(LA158_0 >= K_NAN && LA158_0 <= K_NOLOGIN)||LA158_0==K_NOSUPERUSER||LA158_0==K_NULL||LA158_0==K_OPTIONS||(LA158_0 >= K_PARTITION && LA158_0 <= K_PERMISSIONS)||LA158_0==K_RETURNS||(LA158_0 >= K_ROLE && LA158_0 <= K_ROLES)||(LA158_0 >= K_SFUNC && LA158_0 <= K_TINYINT)||(LA158_0 >= K_TOKEN && LA158_0 <= K_TRIGGER)||(LA158_0 >= K_TTL && LA158_0 <= K_TYPE)||(LA158_0 >= K_USER && LA158_0 <= K_USERS)||(LA158_0 >= K_UUID && LA158_0 <= K_VARINT)||LA158_0==K_WRITETIME||(LA158_0 >= QMARK && LA158_0 <= QUOTED_NAME)||LA158_0==STRING_LITERAL||LA158_0==UUID||LA158_0==177||LA158_0==181||LA158_0==183||LA158_0==190||LA158_0==194) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// Parser.g:1239:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
					{
					pushFollow(FOLLOW_term_in_mapLiteral8588);
					k1=term();
					state._fsp--;

					match(input,183,FOLLOW_183_in_mapLiteral8590); 
					pushFollow(FOLLOW_term_in_mapLiteral8594);
					v1=term();
					state._fsp--;

					 m.add(Pair.create(k1, v1)); 
					// Parser.g:1239:65: ( ',' kn= term ':' vn= term )*
					loop157:
					while (true) {
						int alt157=2;
						int LA157_0 = input.LA(1);
						if ( (LA157_0==180) ) {
							alt157=1;
						}

						switch (alt157) {
						case 1 :
							// Parser.g:1239:67: ',' kn= term ':' vn= term
							{
							match(input,180,FOLLOW_180_in_mapLiteral8600); 
							pushFollow(FOLLOW_term_in_mapLiteral8604);
							kn=term();
							state._fsp--;

							match(input,183,FOLLOW_183_in_mapLiteral8606); 
							pushFollow(FOLLOW_term_in_mapLiteral8610);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop157;
						}
					}

					}
					break;

			}

			match(input,195,FOLLOW_195_in_mapLiteral8626); 
			 map = new Maps.Literal(m); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return map;
	}
	// $ANTLR end "mapLiteral"



	// $ANTLR start "setOrMapLiteral"
	// Parser.g:1243:1: setOrMapLiteral[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
	public final Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw v =null;
		Term.Raw kn =null;
		Term.Raw vn =null;
		Term.Raw tn =null;

		try {
			// Parser.g:1244:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==183) ) {
				alt161=1;
			}
			else if ( (LA161_0==180||LA161_0==195) ) {
				alt161=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 161, 0, input);
				throw nvae;
			}

			switch (alt161) {
				case 1 :
					// Parser.g:1244:7: ':' v= term ( ',' kn= term ':' vn= term )*
					{
					match(input,183,FOLLOW_183_in_setOrMapLiteral8650); 
					pushFollow(FOLLOW_term_in_setOrMapLiteral8654);
					v=term();
					state._fsp--;

					 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
					// Parser.g:1245:11: ( ',' kn= term ':' vn= term )*
					loop159:
					while (true) {
						int alt159=2;
						int LA159_0 = input.LA(1);
						if ( (LA159_0==180) ) {
							alt159=1;
						}

						switch (alt159) {
						case 1 :
							// Parser.g:1245:13: ',' kn= term ':' vn= term
							{
							match(input,180,FOLLOW_180_in_setOrMapLiteral8670); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8674);
							kn=term();
							state._fsp--;

							match(input,183,FOLLOW_183_in_setOrMapLiteral8676); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8680);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop159;
						}
					}

					 value = new Maps.Literal(m); 
					}
					break;
				case 2 :
					// Parser.g:1247:7: ( ',' tn= term )*
					{
					 List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
					// Parser.g:1248:11: ( ',' tn= term )*
					loop160:
					while (true) {
						int alt160=2;
						int LA160_0 = input.LA(1);
						if ( (LA160_0==180) ) {
							alt160=1;
						}

						switch (alt160) {
						case 1 :
							// Parser.g:1248:13: ',' tn= term
							{
							match(input,180,FOLLOW_180_in_setOrMapLiteral8715); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral8719);
							tn=term();
							state._fsp--;

							 s.add(tn); 
							}
							break;

						default :
							break loop160;
						}
					}

					 value = new Sets.Literal(s); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "setOrMapLiteral"



	// $ANTLR start "collectionLiteral"
	// Parser.g:1252:1: collectionLiteral returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' );
	public final Term.Raw collectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;
		Term.Raw t =null;
		Term.Raw v =null;

		try {
			// Parser.g:1253:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' )
			int alt164=3;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==190) ) {
				alt164=1;
			}
			else if ( (LA164_0==194) ) {
				int LA164_2 = input.LA(2);
				if ( (LA164_2==195) ) {
					alt164=3;
				}
				else if ( (LA164_2==BOOLEAN||LA164_2==FLOAT||LA164_2==HEXNUMBER||(LA164_2 >= IDENT && LA164_2 <= INTEGER)||(LA164_2 >= K_AGGREGATE && LA164_2 <= K_ALL)||LA164_2==K_AS||LA164_2==K_ASCII||(LA164_2 >= K_BIGINT && LA164_2 <= K_BOOLEAN)||(LA164_2 >= K_CALLED && LA164_2 <= K_CLUSTERING)||(LA164_2 >= K_COMPACT && LA164_2 <= K_COUNTER)||(LA164_2 >= K_CUSTOM && LA164_2 <= K_DECIMAL)||(LA164_2 >= K_DISTINCT && LA164_2 <= K_DOUBLE)||(LA164_2 >= K_EXISTS && LA164_2 <= K_FLOAT)||LA164_2==K_FROZEN||(LA164_2 >= K_FUNCTION && LA164_2 <= K_FUNCTIONS)||(LA164_2 >= K_INET && LA164_2 <= K_INPUT)||LA164_2==K_INT||(LA164_2 >= K_JSON && LA164_2 <= K_KEYS)||(LA164_2 >= K_KEYSPACES && LA164_2 <= K_LIKE)||(LA164_2 >= K_LIST && LA164_2 <= K_MAP)||(LA164_2 >= K_NAN && LA164_2 <= K_NOLOGIN)||LA164_2==K_NOSUPERUSER||LA164_2==K_NULL||LA164_2==K_OPTIONS||(LA164_2 >= K_PARTITION && LA164_2 <= K_PERMISSIONS)||LA164_2==K_RETURNS||(LA164_2 >= K_ROLE && LA164_2 <= K_ROLES)||(LA164_2 >= K_SFUNC && LA164_2 <= K_TINYINT)||(LA164_2 >= K_TOKEN && LA164_2 <= K_TRIGGER)||(LA164_2 >= K_TTL && LA164_2 <= K_TYPE)||(LA164_2 >= K_USER && LA164_2 <= K_USERS)||(LA164_2 >= K_UUID && LA164_2 <= K_VARINT)||LA164_2==K_WRITETIME||(LA164_2 >= QMARK && LA164_2 <= QUOTED_NAME)||LA164_2==STRING_LITERAL||LA164_2==UUID||LA164_2==177||LA164_2==181||LA164_2==183||LA164_2==190||LA164_2==194) ) {
					alt164=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 164, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// Parser.g:1253:7: '[' (t1= term ( ',' tn= term )* )? ']'
					{
					match(input,190,FOLLOW_190_in_collectionLiteral8753); 
					 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
					// Parser.g:1254:11: (t1= term ( ',' tn= term )* )?
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( (LA163_0==BOOLEAN||LA163_0==FLOAT||LA163_0==HEXNUMBER||(LA163_0 >= IDENT && LA163_0 <= INTEGER)||(LA163_0 >= K_AGGREGATE && LA163_0 <= K_ALL)||LA163_0==K_AS||LA163_0==K_ASCII||(LA163_0 >= K_BIGINT && LA163_0 <= K_BOOLEAN)||(LA163_0 >= K_CALLED && LA163_0 <= K_CLUSTERING)||(LA163_0 >= K_COMPACT && LA163_0 <= K_COUNTER)||(LA163_0 >= K_CUSTOM && LA163_0 <= K_DECIMAL)||(LA163_0 >= K_DISTINCT && LA163_0 <= K_DOUBLE)||(LA163_0 >= K_EXISTS && LA163_0 <= K_FLOAT)||LA163_0==K_FROZEN||(LA163_0 >= K_FUNCTION && LA163_0 <= K_FUNCTIONS)||(LA163_0 >= K_INET && LA163_0 <= K_INPUT)||LA163_0==K_INT||(LA163_0 >= K_JSON && LA163_0 <= K_KEYS)||(LA163_0 >= K_KEYSPACES && LA163_0 <= K_LIKE)||(LA163_0 >= K_LIST && LA163_0 <= K_MAP)||(LA163_0 >= K_NAN && LA163_0 <= K_NOLOGIN)||LA163_0==K_NOSUPERUSER||LA163_0==K_NULL||LA163_0==K_OPTIONS||(LA163_0 >= K_PARTITION && LA163_0 <= K_PERMISSIONS)||LA163_0==K_RETURNS||(LA163_0 >= K_ROLE && LA163_0 <= K_ROLES)||(LA163_0 >= K_SFUNC && LA163_0 <= K_TINYINT)||(LA163_0 >= K_TOKEN && LA163_0 <= K_TRIGGER)||(LA163_0 >= K_TTL && LA163_0 <= K_TYPE)||(LA163_0 >= K_USER && LA163_0 <= K_USERS)||(LA163_0 >= K_UUID && LA163_0 <= K_VARINT)||LA163_0==K_WRITETIME||(LA163_0 >= QMARK && LA163_0 <= QUOTED_NAME)||LA163_0==STRING_LITERAL||LA163_0==UUID||LA163_0==177||LA163_0==181||LA163_0==183||LA163_0==190||LA163_0==194) ) {
						alt163=1;
					}
					switch (alt163) {
						case 1 :
							// Parser.g:1254:13: t1= term ( ',' tn= term )*
							{
							pushFollow(FOLLOW_term_in_collectionLiteral8771);
							t1=term();
							state._fsp--;

							 l.add(t1); 
							// Parser.g:1254:36: ( ',' tn= term )*
							loop162:
							while (true) {
								int alt162=2;
								int LA162_0 = input.LA(1);
								if ( (LA162_0==180) ) {
									alt162=1;
								}

								switch (alt162) {
								case 1 :
									// Parser.g:1254:38: ',' tn= term
									{
									match(input,180,FOLLOW_180_in_collectionLiteral8777); 
									pushFollow(FOLLOW_term_in_collectionLiteral8781);
									tn=term();
									state._fsp--;

									 l.add(tn); 
									}
									break;

								default :
									break loop162;
								}
							}

							}
							break;

					}

					match(input,192,FOLLOW_192_in_collectionLiteral8797); 
					 value = new Lists.Literal(l); 
					}
					break;
				case 2 :
					// Parser.g:1256:7: '{' t= term v= setOrMapLiteral[t] '}'
					{
					match(input,194,FOLLOW_194_in_collectionLiteral8807); 
					pushFollow(FOLLOW_term_in_collectionLiteral8811);
					t=term();
					state._fsp--;

					pushFollow(FOLLOW_setOrMapLiteral_in_collectionLiteral8815);
					v=setOrMapLiteral(t);
					state._fsp--;

					 value = v; 
					match(input,195,FOLLOW_195_in_collectionLiteral8820); 
					}
					break;
				case 3 :
					// Parser.g:1259:7: '{' '}'
					{
					match(input,194,FOLLOW_194_in_collectionLiteral8838); 
					match(input,195,FOLLOW_195_in_collectionLiteral8840); 
					 value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "usertypeLiteral"
	// Parser.g:1262:1: usertypeLiteral returns [UserTypes.Literal ut] : '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' ;
	public final UserTypes.Literal usertypeLiteral() throws RecognitionException {
		UserTypes.Literal ut = null;


		FieldIdentifier k1 =null;
		Term.Raw v1 =null;
		FieldIdentifier kn =null;
		Term.Raw vn =null;

		 Map<FieldIdentifier, Term.Raw> m = new HashMap<>(); 
		try {
			// Parser.g:1266:5: ( '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}' )
			// Parser.g:1266:7: '{' k1= fident ':' v1= term ( ',' kn= fident ':' vn= term )* '}'
			{
			match(input,194,FOLLOW_194_in_usertypeLiteral8884); 
			pushFollow(FOLLOW_fident_in_usertypeLiteral8888);
			k1=fident();
			state._fsp--;

			match(input,183,FOLLOW_183_in_usertypeLiteral8890); 
			pushFollow(FOLLOW_term_in_usertypeLiteral8894);
			v1=term();
			state._fsp--;

			 m.put(k1, v1); 
			// Parser.g:1266:52: ( ',' kn= fident ':' vn= term )*
			loop165:
			while (true) {
				int alt165=2;
				int LA165_0 = input.LA(1);
				if ( (LA165_0==180) ) {
					alt165=1;
				}

				switch (alt165) {
				case 1 :
					// Parser.g:1266:54: ',' kn= fident ':' vn= term
					{
					match(input,180,FOLLOW_180_in_usertypeLiteral8900); 
					pushFollow(FOLLOW_fident_in_usertypeLiteral8904);
					kn=fident();
					state._fsp--;

					match(input,183,FOLLOW_183_in_usertypeLiteral8906); 
					pushFollow(FOLLOW_term_in_usertypeLiteral8910);
					vn=term();
					state._fsp--;

					 m.put(kn, vn); 
					}
					break;

				default :
					break loop165;
				}
			}

			match(input,195,FOLLOW_195_in_usertypeLiteral8917); 
			}

			 ut = new UserTypes.Literal(m); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ut;
	}
	// $ANTLR end "usertypeLiteral"



	// $ANTLR start "tupleLiteral"
	// Parser.g:1269:1: tupleLiteral returns [Tuples.Literal tt] : '(' t1= term ( ',' tn= term )* ')' ;
	public final Tuples.Literal tupleLiteral() throws RecognitionException {
		Tuples.Literal tt = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1272:5: ( '(' t1= term ( ',' tn= term )* ')' )
			// Parser.g:1272:7: '(' t1= term ( ',' tn= term )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleLiteral8954); 
			pushFollow(FOLLOW_term_in_tupleLiteral8958);
			t1=term();
			state._fsp--;

			 l.add(t1); 
			// Parser.g:1272:34: ( ',' tn= term )*
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==180) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// Parser.g:1272:36: ',' tn= term
					{
					match(input,180,FOLLOW_180_in_tupleLiteral8964); 
					pushFollow(FOLLOW_term_in_tupleLiteral8968);
					tn=term();
					state._fsp--;

					 l.add(tn); 
					}
					break;

				default :
					break loop166;
				}
			}

			match(input,178,FOLLOW_178_in_tupleLiteral8975); 
			}

			 tt = new Tuples.Literal(l); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tt;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "value"
	// Parser.g:1275:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );
	public final Term.Raw value() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		Term.Raw l =null;
		UserTypes.Literal u =null;
		Tuples.Literal t =null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1276:5: (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK )
			int alt167=7;
			alt167 = dfa167.predict(input);
			switch (alt167) {
				case 1 :
					// Parser.g:1276:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_value8998);
					c=constant();
					state._fsp--;

					 value = c; 
					}
					break;
				case 2 :
					// Parser.g:1277:7: l= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_value9020);
					l=collectionLiteral();
					state._fsp--;

					 value = l; 
					}
					break;
				case 3 :
					// Parser.g:1278:7: u= usertypeLiteral
					{
					pushFollow(FOLLOW_usertypeLiteral_in_value9033);
					u=usertypeLiteral();
					state._fsp--;

					 value = u; 
					}
					break;
				case 4 :
					// Parser.g:1279:7: t= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_value9048);
					t=tupleLiteral();
					state._fsp--;

					 value = t; 
					}
					break;
				case 5 :
					// Parser.g:1280:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_value9064); 
					 value = Constants.NULL_LITERAL; 
					}
					break;
				case 6 :
					// Parser.g:1281:7: ':' id= noncol_ident
					{
					match(input,183,FOLLOW_183_in_value9088); 
					pushFollow(FOLLOW_noncol_ident_in_value9092);
					id=noncol_ident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 7 :
					// Parser.g:1282:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_value9103); 
					 value = newBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "value"



	// $ANTLR start "intValue"
	// Parser.g:1285:1: intValue returns [Term.Raw value] : (|t= INTEGER | ':' id= noncol_ident | QMARK );
	public final Term.Raw intValue() throws RecognitionException {
		Term.Raw value = null;


		Token t=null;
		ColumnIdentifier id =null;

		try {
			// Parser.g:1286:5: (|t= INTEGER | ':' id= noncol_ident | QMARK )
			int alt168=4;
			switch ( input.LA(1) ) {
			case EOF:
			case K_ALLOW:
			case K_AND:
			case K_APPLY:
			case K_DELETE:
			case K_INSERT:
			case K_LIMIT:
			case K_SET:
			case K_UPDATE:
			case K_WHERE:
			case 184:
				{
				alt168=1;
				}
				break;
			case INTEGER:
				{
				alt168=2;
				}
				break;
			case 183:
				{
				alt168=3;
				}
				break;
			case QMARK:
				{
				alt168=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 168, 0, input);
				throw nvae;
			}
			switch (alt168) {
				case 1 :
					// Parser.g:1287:5: 
					{
					}
					break;
				case 2 :
					// Parser.g:1287:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue9149); 
					 value = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// Parser.g:1288:7: ':' id= noncol_ident
					{
					match(input,183,FOLLOW_183_in_intValue9163); 
					pushFollow(FOLLOW_noncol_ident_in_intValue9167);
					id=noncol_ident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 4 :
					// Parser.g:1289:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_intValue9178); 
					 value = newBindVariables(null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "intValue"



	// $ANTLR start "functionName"
	// Parser.g:1292:1: functionName returns [FunctionName s] : (ks= keyspaceName '.' )? f= allowedFunctionName ;
	public final FunctionName functionName() throws RecognitionException {
		FunctionName s = null;


		String ks =null;
		String f =null;

		try {
			// Parser.g:1293:5: ( (ks= keyspaceName '.' )? f= allowedFunctionName )
			// Parser.g:1293:7: (ks= keyspaceName '.' )? f= allowedFunctionName
			{
			// Parser.g:1293:7: (ks= keyspaceName '.' )?
			int alt169=2;
			alt169 = dfa169.predict(input);
			switch (alt169) {
				case 1 :
					// Parser.g:1293:8: ks= keyspaceName '.'
					{
					pushFollow(FOLLOW_keyspaceName_in_functionName9212);
					ks=keyspaceName();
					state._fsp--;

					match(input,182,FOLLOW_182_in_functionName9214); 
					}
					break;

			}

			pushFollow(FOLLOW_allowedFunctionName_in_functionName9220);
			f=allowedFunctionName();
			state._fsp--;

			 s = new FunctionName(ks, f); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "functionName"



	// $ANTLR start "allowedFunctionName"
	// Parser.g:1296:1: allowedFunctionName returns [String s] : (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT );
	public final String allowedFunctionName() throws RecognitionException {
		String s = null;


		Token f=null;
		String u =null;

		try {
			// Parser.g:1297:5: (f= IDENT |f= QUOTED_NAME |u= unreserved_function_keyword | K_TOKEN | K_COUNT )
			int alt170=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt170=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt170=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DATE:
			case K_DECIMAL:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FLOAT:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INET:
			case K_INITCOND:
			case K_INPUT:
			case K_INT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_SMALLINT:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIME:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TINYINT:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt170=3;
				}
				break;
			case K_TOKEN:
				{
				alt170=4;
				}
				break;
			case K_COUNT:
				{
				alt170=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 170, 0, input);
				throw nvae;
			}
			switch (alt170) {
				case 1 :
					// Parser.g:1297:7: f= IDENT
					{
					f=(Token)match(input,IDENT,FOLLOW_IDENT_in_allowedFunctionName9247); 
					 s = (f!=null?f.getText():null).toLowerCase(); 
					}
					break;
				case 2 :
					// Parser.g:1298:7: f= QUOTED_NAME
					{
					f=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_allowedFunctionName9281); 
					 s = (f!=null?f.getText():null); 
					}
					break;
				case 3 :
					// Parser.g:1299:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_allowedFunctionName9309);
					u=unreserved_function_keyword();
					state._fsp--;

					 s = u; 
					}
					break;
				case 4 :
					// Parser.g:1300:7: K_TOKEN
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_allowedFunctionName9319); 
					 s = "token"; 
					}
					break;
				case 5 :
					// Parser.g:1301:7: K_COUNT
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_allowedFunctionName9351); 
					 s = "count"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "allowedFunctionName"



	// $ANTLR start "function"
	// Parser.g:1304:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );
	public final Term.Raw function() throws RecognitionException {
		Term.Raw t = null;


		FunctionName f =null;
		List<Term.Raw> args =null;

		try {
			// Parser.g:1305:5: (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' )
			int alt171=2;
			alt171 = dfa171.predict(input);
			switch (alt171) {
				case 1 :
					// Parser.g:1305:7: f= functionName '(' ')'
					{
					pushFollow(FOLLOW_functionName_in_function9398);
					f=functionName();
					state._fsp--;

					match(input,177,FOLLOW_177_in_function9400); 
					match(input,178,FOLLOW_178_in_function9402); 
					 t = new FunctionCall.Raw(f, Collections.<Term.Raw>emptyList()); 
					}
					break;
				case 2 :
					// Parser.g:1306:7: f= functionName '(' args= functionArgs ')'
					{
					pushFollow(FOLLOW_functionName_in_function9432);
					f=functionName();
					state._fsp--;

					match(input,177,FOLLOW_177_in_function9434); 
					pushFollow(FOLLOW_functionArgs_in_function9438);
					args=functionArgs();
					state._fsp--;

					match(input,178,FOLLOW_178_in_function9440); 
					 t = new FunctionCall.Raw(f, args); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionArgs"
	// Parser.g:1309:1: functionArgs returns [List<Term.Raw> args] : t1= term ( ',' tn= term )* ;
	public final List<Term.Raw> functionArgs() throws RecognitionException {
		List<Term.Raw> args = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 args = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1311:5: (t1= term ( ',' tn= term )* )
			// Parser.g:1311:7: t1= term ( ',' tn= term )*
			{
			pushFollow(FOLLOW_term_in_functionArgs9473);
			t1=term();
			state._fsp--;

			args.add(t1); 
			// Parser.g:1311:32: ( ',' tn= term )*
			loop172:
			while (true) {
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==180) ) {
					alt172=1;
				}

				switch (alt172) {
				case 1 :
					// Parser.g:1311:34: ',' tn= term
					{
					match(input,180,FOLLOW_180_in_functionArgs9479); 
					pushFollow(FOLLOW_term_in_functionArgs9483);
					tn=term();
					state._fsp--;

					 args.add(tn); 
					}
					break;

				default :
					break loop172;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return args;
	}
	// $ANTLR end "functionArgs"



	// $ANTLR start "term"
	// Parser.g:1314:1: term returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= term );
	public final Term.Raw term() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw v =null;
		Term.Raw f =null;
		CQL3Type.Raw c =null;
		Term.Raw t =null;

		try {
			// Parser.g:1315:5: (v= value |f= function | '(' c= comparatorType ')' t= term )
			int alt173=3;
			alt173 = dfa173.predict(input);
			switch (alt173) {
				case 1 :
					// Parser.g:1315:7: v= value
					{
					pushFollow(FOLLOW_value_in_term9511);
					v=value();
					state._fsp--;

					 term = v; 
					}
					break;
				case 2 :
					// Parser.g:1316:7: f= function
					{
					pushFollow(FOLLOW_function_in_term9548);
					f=function();
					state._fsp--;

					 term = f; 
					}
					break;
				case 3 :
					// Parser.g:1317:7: '(' c= comparatorType ')' t= term
					{
					match(input,177,FOLLOW_177_in_term9580); 
					pushFollow(FOLLOW_comparatorType_in_term9584);
					c=comparatorType();
					state._fsp--;

					match(input,178,FOLLOW_178_in_term9586); 
					pushFollow(FOLLOW_term_in_term9590);
					t=term();
					state._fsp--;

					 term = new TypeCast(c, t); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "columnOperation"
	// Parser.g:1320:1: columnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations] : key= cident columnOperationDifferentiator[operations, key] ;
	public final void columnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations) throws RecognitionException {
		ColumnDefinition.Raw key =null;

		try {
			// Parser.g:1321:5: (key= cident columnOperationDifferentiator[operations, key] )
			// Parser.g:1321:7: key= cident columnOperationDifferentiator[operations, key]
			{
			pushFollow(FOLLOW_cident_in_columnOperation9613);
			key=cident();
			state._fsp--;

			pushFollow(FOLLOW_columnOperationDifferentiator_in_columnOperation9615);
			columnOperationDifferentiator(operations, key);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperation"



	// $ANTLR start "columnOperationDifferentiator"
	// Parser.g:1324:1: columnOperationDifferentiator[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key] : ( '=' normalColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] );
	public final void columnOperationDifferentiator(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key) throws RecognitionException {
		Term.Raw k =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1325:5: ( '=' normalColumnOperation[operations, key] | '[' k= term ']' collectionColumnOperation[operations, key, k] | '.' field= fident udtColumnOperation[operations, key, field] )
			int alt174=3;
			switch ( input.LA(1) ) {
			case 187:
				{
				alt174=1;
				}
				break;
			case 190:
				{
				alt174=2;
				}
				break;
			case 182:
				{
				alt174=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 174, 0, input);
				throw nvae;
			}
			switch (alt174) {
				case 1 :
					// Parser.g:1325:7: '=' normalColumnOperation[operations, key]
					{
					match(input,187,FOLLOW_187_in_columnOperationDifferentiator9634); 
					pushFollow(FOLLOW_normalColumnOperation_in_columnOperationDifferentiator9636);
					normalColumnOperation(operations, key);
					state._fsp--;

					}
					break;
				case 2 :
					// Parser.g:1326:7: '[' k= term ']' collectionColumnOperation[operations, key, k]
					{
					match(input,190,FOLLOW_190_in_columnOperationDifferentiator9645); 
					pushFollow(FOLLOW_term_in_columnOperationDifferentiator9649);
					k=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_columnOperationDifferentiator9651); 
					pushFollow(FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator9653);
					collectionColumnOperation(operations, key, k);
					state._fsp--;

					}
					break;
				case 3 :
					// Parser.g:1327:7: '.' field= fident udtColumnOperation[operations, key, field]
					{
					match(input,182,FOLLOW_182_in_columnOperationDifferentiator9662); 
					pushFollow(FOLLOW_fident_in_columnOperationDifferentiator9666);
					field=fident();
					state._fsp--;

					pushFollow(FOLLOW_udtColumnOperation_in_columnOperationDifferentiator9668);
					udtColumnOperation(operations, key, field);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnOperationDifferentiator"



	// $ANTLR start "normalColumnOperation"
	// Parser.g:1330:1: normalColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );
	public final void normalColumnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key) throws RecognitionException {
		Token sig=null;
		Token i=null;
		Term.Raw t =null;
		ColumnDefinition.Raw c =null;

		try {
			// Parser.g:1331:5: (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER )
			int alt176=3;
			alt176 = dfa176.predict(input);
			switch (alt176) {
				case 1 :
					// Parser.g:1331:7: t= term ( '+' c= cident )?
					{
					pushFollow(FOLLOW_term_in_normalColumnOperation9689);
					t=term();
					state._fsp--;

					// Parser.g:1331:14: ( '+' c= cident )?
					int alt175=2;
					int LA175_0 = input.LA(1);
					if ( (LA175_0==179) ) {
						alt175=1;
					}
					switch (alt175) {
						case 1 :
							// Parser.g:1331:15: '+' c= cident
							{
							match(input,179,FOLLOW_179_in_normalColumnOperation9692); 
							pushFollow(FOLLOW_cident_in_normalColumnOperation9696);
							c=cident();
							state._fsp--;

							}
							break;

					}


					          if (c == null)
					          {
					              addRawUpdate(operations, key, new Operation.SetValue(t));
					          }
					          else
					          {
					              if (!key.equals(c))
					                  addRecognitionError("Only expressions of the form X = <value> + X are supported.");
					              addRawUpdate(operations, key, new Operation.Prepend(t));
					          }
					      
					}
					break;
				case 2 :
					// Parser.g:1344:7: c= cident sig= ( '+' | '-' ) t= term
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation9717);
					c=cident();
					state._fsp--;

					sig=input.LT(1);
					if ( input.LA(1)==179||input.LA(1)==181 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_normalColumnOperation9731);
					t=term();
					state._fsp--;


					          if (!key.equals(c))
					              addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
					          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
					      
					}
					break;
				case 3 :
					// Parser.g:1350:7: c= cident i= INTEGER
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation9749);
					c=cident();
					state._fsp--;

					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_normalColumnOperation9753); 

					          // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
					          if (!key.equals(c))
					              // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
					              addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
					          addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "normalColumnOperation"



	// $ANTLR start "collectionColumnOperation"
	// Parser.g:1360:1: collectionColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, Term.Raw k] : '=' t= term ;
	public final void collectionColumnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, Term.Raw k) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1361:5: ( '=' t= term )
			// Parser.g:1361:7: '=' t= term
			{
			match(input,187,FOLLOW_187_in_collectionColumnOperation9779); 
			pushFollow(FOLLOW_term_in_collectionColumnOperation9783);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, new Operation.SetElement(k, t));
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "collectionColumnOperation"



	// $ANTLR start "udtColumnOperation"
	// Parser.g:1367:1: udtColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, FieldIdentifier field] : '=' t= term ;
	public final void udtColumnOperation(List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key, FieldIdentifier field) throws RecognitionException {
		Term.Raw t =null;

		try {
			// Parser.g:1368:5: ( '=' t= term )
			// Parser.g:1368:7: '=' t= term
			{
			match(input,187,FOLLOW_187_in_udtColumnOperation9809); 
			pushFollow(FOLLOW_term_in_udtColumnOperation9813);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, new Operation.SetField(field, t));
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "udtColumnOperation"



	// $ANTLR start "columnCondition"
	// Parser.g:1374:1: columnCondition[List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions] : key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) ;
	public final void columnCondition(List<Pair<ColumnDefinition.Raw, ColumnCondition.Raw>> conditions) throws RecognitionException {
		ColumnDefinition.Raw key =null;
		Operator op =null;
		Term.Raw t =null;
		List<Term.Raw> values =null;
		AbstractMarker.INRaw marker =null;
		Term.Raw element =null;
		FieldIdentifier field =null;

		try {
			// Parser.g:1376:5: (key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) )
			// Parser.g:1376:7: key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			{
			pushFollow(FOLLOW_cident_in_columnCondition9846);
			key=cident();
			state._fsp--;

			// Parser.g:1377:9: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) | '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			int alt182=4;
			switch ( input.LA(1) ) {
			case 176:
			case 185:
			case 186:
			case 187:
			case 188:
			case 189:
				{
				alt182=1;
				}
				break;
			case K_IN:
				{
				alt182=2;
				}
				break;
			case 190:
				{
				alt182=3;
				}
				break;
			case 182:
				{
				alt182=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}
			switch (alt182) {
				case 1 :
					// Parser.g:1377:11: op= relationType t= term
					{
					pushFollow(FOLLOW_relationType_in_columnCondition9860);
					op=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_columnCondition9864);
					t=term();
					state._fsp--;

					 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); 
					}
					break;
				case 2 :
					// Parser.g:1378:11: K_IN (values= singleColumnInValues |marker= inMarker )
					{
					match(input,K_IN,FOLLOW_K_IN_in_columnCondition9878); 
					// Parser.g:1379:13: (values= singleColumnInValues |marker= inMarker )
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==177) ) {
						alt177=1;
					}
					else if ( (LA177_0==QMARK||LA177_0==183) ) {
						alt177=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 177, 0, input);
						throw nvae;
					}

					switch (alt177) {
						case 1 :
							// Parser.g:1379:15: values= singleColumnInValues
							{
							pushFollow(FOLLOW_singleColumnInValues_in_columnCondition9896);
							values=singleColumnInValues();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(values))); 
							}
							break;
						case 2 :
							// Parser.g:1380:15: marker= inMarker
							{
							pushFollow(FOLLOW_inMarker_in_columnCondition9916);
							marker=inMarker();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(marker))); 
							}
							break;

					}

					}
					break;
				case 3 :
					// Parser.g:1382:11: '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,190,FOLLOW_190_in_columnCondition9944); 
					pushFollow(FOLLOW_term_in_columnCondition9948);
					element=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_columnCondition9950); 
					// Parser.g:1383:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt179=2;
					int LA179_0 = input.LA(1);
					if ( (LA179_0==176||(LA179_0 >= 185 && LA179_0 <= 189)) ) {
						alt179=1;
					}
					else if ( (LA179_0==K_IN) ) {
						alt179=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 179, 0, input);
						throw nvae;
					}

					switch (alt179) {
						case 1 :
							// Parser.g:1383:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition9968);
							op=relationType();
							state._fsp--;

							pushFollow(FOLLOW_term_in_columnCondition9972);
							t=term();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionCondition(t, element, op))); 
							}
							break;
						case 2 :
							// Parser.g:1384:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition9990); 
							// Parser.g:1385:17: (values= singleColumnInValues |marker= inMarker )
							int alt178=2;
							int LA178_0 = input.LA(1);
							if ( (LA178_0==177) ) {
								alt178=1;
							}
							else if ( (LA178_0==QMARK||LA178_0==183) ) {
								alt178=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 178, 0, input);
								throw nvae;
							}

							switch (alt178) {
								case 1 :
									// Parser.g:1385:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition10012);
									values=singleColumnInValues();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, values))); 
									}
									break;
								case 2 :
									// Parser.g:1386:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition10036);
									marker=inMarker();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, marker))); 
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 4 :
					// Parser.g:1389:11: '.' field= fident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,182,FOLLOW_182_in_columnCondition10082); 
					pushFollow(FOLLOW_fident_in_columnCondition10086);
					field=fident();
					state._fsp--;

					// Parser.g:1390:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==176||(LA181_0 >= 185 && LA181_0 <= 189)) ) {
						alt181=1;
					}
					else if ( (LA181_0==K_IN) ) {
						alt181=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 181, 0, input);
						throw nvae;
					}

					switch (alt181) {
						case 1 :
							// Parser.g:1390:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition10104);
							op=relationType();
							state._fsp--;

							pushFollow(FOLLOW_term_in_columnCondition10108);
							t=term();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldCondition(t, field, op))); 
							}
							break;
						case 2 :
							// Parser.g:1391:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition10126); 
							// Parser.g:1392:17: (values= singleColumnInValues |marker= inMarker )
							int alt180=2;
							int LA180_0 = input.LA(1);
							if ( (LA180_0==177) ) {
								alt180=1;
							}
							else if ( (LA180_0==QMARK||LA180_0==183) ) {
								alt180=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 180, 0, input);
								throw nvae;
							}

							switch (alt180) {
								case 1 :
									// Parser.g:1392:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition10148);
									values=singleColumnInValues();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, values))); 
									}
									break;
								case 2 :
									// Parser.g:1393:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition10172);
									marker=inMarker();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.udtFieldInCondition(field, marker))); 
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "columnCondition"



	// $ANTLR start "properties"
	// Parser.g:1399:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
	public final void properties(PropertyDefinitions props) throws RecognitionException {
		try {
			// Parser.g:1400:5: ( property[props] ( K_AND property[props] )* )
			// Parser.g:1400:7: property[props] ( K_AND property[props] )*
			{
			pushFollow(FOLLOW_property_in_properties10234);
			property(props);
			state._fsp--;

			// Parser.g:1400:23: ( K_AND property[props] )*
			loop183:
			while (true) {
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==K_AND) ) {
					alt183=1;
				}

				switch (alt183) {
				case 1 :
					// Parser.g:1400:24: K_AND property[props]
					{
					match(input,K_AND,FOLLOW_K_AND_in_properties10238); 
					pushFollow(FOLLOW_property_in_properties10240);
					property(props);
					state._fsp--;

					}
					break;

				default :
					break loop183;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "properties"



	// $ANTLR start "property"
	// Parser.g:1403:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral );
	public final void property(PropertyDefinitions props) throws RecognitionException {
		ColumnIdentifier k =null;
		String simple =null;
		Maps.Literal map =null;

		try {
			// Parser.g:1404:5: (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral )
			int alt184=2;
			alt184 = dfa184.predict(input);
			switch (alt184) {
				case 1 :
					// Parser.g:1404:7: k= noncol_ident '=' simple= propertyValue
					{
					pushFollow(FOLLOW_noncol_ident_in_property10263);
					k=noncol_ident();
					state._fsp--;

					match(input,187,FOLLOW_187_in_property10265); 
					pushFollow(FOLLOW_propertyValue_in_property10269);
					simple=propertyValue();
					state._fsp--;

					 try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
					}
					break;
				case 2 :
					// Parser.g:1405:7: k= noncol_ident '=' map= mapLiteral
					{
					pushFollow(FOLLOW_noncol_ident_in_property10281);
					k=noncol_ident();
					state._fsp--;

					match(input,187,FOLLOW_187_in_property10283); 
					pushFollow(FOLLOW_mapLiteral_in_property10287);
					map=mapLiteral();
					state._fsp--;

					 try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "property"



	// $ANTLR start "propertyValue"
	// Parser.g:1408:1: propertyValue returns [String str] : (c= constant |u= unreserved_keyword );
	public final String propertyValue() throws RecognitionException {
		String str = null;


		Constants.Literal c =null;
		String u =null;

		try {
			// Parser.g:1409:5: (c= constant |u= unreserved_keyword )
			int alt185=2;
			int LA185_0 = input.LA(1);
			if ( (LA185_0==BOOLEAN||LA185_0==FLOAT||LA185_0==HEXNUMBER||LA185_0==INTEGER||LA185_0==K_INFINITY||LA185_0==K_NAN||LA185_0==STRING_LITERAL||LA185_0==UUID||LA185_0==181) ) {
				alt185=1;
			}
			else if ( ((LA185_0 >= K_AGGREGATE && LA185_0 <= K_ALL)||LA185_0==K_AS||LA185_0==K_ASCII||(LA185_0 >= K_BIGINT && LA185_0 <= K_BOOLEAN)||(LA185_0 >= K_CALLED && LA185_0 <= K_CLUSTERING)||(LA185_0 >= K_COMPACT && LA185_0 <= K_COUNTER)||(LA185_0 >= K_CUSTOM && LA185_0 <= K_DECIMAL)||(LA185_0 >= K_DISTINCT && LA185_0 <= K_DOUBLE)||(LA185_0 >= K_EXISTS && LA185_0 <= K_FLOAT)||LA185_0==K_FROZEN||(LA185_0 >= K_FUNCTION && LA185_0 <= K_FUNCTIONS)||LA185_0==K_INET||(LA185_0 >= K_INITCOND && LA185_0 <= K_INPUT)||LA185_0==K_INT||(LA185_0 >= K_JSON && LA185_0 <= K_KEYS)||(LA185_0 >= K_KEYSPACES && LA185_0 <= K_LIKE)||(LA185_0 >= K_LIST && LA185_0 <= K_MAP)||LA185_0==K_NOLOGIN||LA185_0==K_NOSUPERUSER||LA185_0==K_OPTIONS||(LA185_0 >= K_PARTITION && LA185_0 <= K_PERMISSIONS)||LA185_0==K_RETURNS||(LA185_0 >= K_ROLE && LA185_0 <= K_ROLES)||(LA185_0 >= K_SFUNC && LA185_0 <= K_TINYINT)||LA185_0==K_TRIGGER||(LA185_0 >= K_TTL && LA185_0 <= K_TYPE)||(LA185_0 >= K_USER && LA185_0 <= K_USERS)||(LA185_0 >= K_UUID && LA185_0 <= K_VARINT)||LA185_0==K_WRITETIME) ) {
				alt185=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 185, 0, input);
				throw nvae;
			}

			switch (alt185) {
				case 1 :
					// Parser.g:1409:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_propertyValue10312);
					c=constant();
					state._fsp--;

					 str = c.getRawText(); 
					}
					break;
				case 2 :
					// Parser.g:1410:7: u= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_propertyValue10334);
					u=unreserved_keyword();
					state._fsp--;

					 str = u; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "propertyValue"



	// $ANTLR start "relationType"
	// Parser.g:1413:1: relationType returns [Operator op] : ( '=' | '<' | '<=' | '>' | '>=' | '!=' );
	public final Operator relationType() throws RecognitionException {
		Operator op = null;


		try {
			// Parser.g:1414:5: ( '=' | '<' | '<=' | '>' | '>=' | '!=' )
			int alt186=6;
			switch ( input.LA(1) ) {
			case 187:
				{
				alt186=1;
				}
				break;
			case 185:
				{
				alt186=2;
				}
				break;
			case 186:
				{
				alt186=3;
				}
				break;
			case 188:
				{
				alt186=4;
				}
				break;
			case 189:
				{
				alt186=5;
				}
				break;
			case 176:
				{
				alt186=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 186, 0, input);
				throw nvae;
			}
			switch (alt186) {
				case 1 :
					// Parser.g:1414:7: '='
					{
					match(input,187,FOLLOW_187_in_relationType10357); 
					 op = Operator.EQ; 
					}
					break;
				case 2 :
					// Parser.g:1415:7: '<'
					{
					match(input,185,FOLLOW_185_in_relationType10368); 
					 op = Operator.LT; 
					}
					break;
				case 3 :
					// Parser.g:1416:7: '<='
					{
					match(input,186,FOLLOW_186_in_relationType10379); 
					 op = Operator.LTE; 
					}
					break;
				case 4 :
					// Parser.g:1417:7: '>'
					{
					match(input,188,FOLLOW_188_in_relationType10389); 
					 op = Operator.GT; 
					}
					break;
				case 5 :
					// Parser.g:1418:7: '>='
					{
					match(input,189,FOLLOW_189_in_relationType10400); 
					 op = Operator.GTE; 
					}
					break;
				case 6 :
					// Parser.g:1419:7: '!='
					{
					match(input,176,FOLLOW_176_in_relationType10410); 
					 op = Operator.NEQ; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "relationType"



	// $ANTLR start "relation"
	// Parser.g:1422:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
	public final void relation(WhereClause.Builder clauses) throws RecognitionException {
		ColumnDefinition.Raw name =null;
		Operator type =null;
		Term.Raw t =null;
		List<ColumnDefinition.Raw> l =null;
		AbstractMarker.INRaw marker =null;
		List<Term.Raw> inValues =null;
		Term.Raw key =null;
		List<ColumnDefinition.Raw> ids =null;
		Tuples.INRaw tupleInMarker =null;
		List<Tuples.Literal> literals =null;
		List<Tuples.Raw> markers =null;
		Tuples.Literal literal =null;
		Tuples.Raw tupleMarker =null;

		try {
			// Parser.g:1423:5: (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
			int alt190=10;
			alt190 = dfa190.predict(input);
			switch (alt190) {
				case 1 :
					// Parser.g:1423:7: name= cident type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation10432);
					name=cident();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation10436);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10440);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, type, t)); 
					}
					break;
				case 2 :
					// Parser.g:1424:7: name= cident K_LIKE t= term
					{
					pushFollow(FOLLOW_cident_in_relation10452);
					name=cident();
					state._fsp--;

					match(input,K_LIKE,FOLLOW_K_LIKE_in_relation10454); 
					pushFollow(FOLLOW_term_in_relation10458);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, Operator.LIKE, t)); 
					}
					break;
				case 3 :
					// Parser.g:1425:7: name= cident K_IS K_NOT K_NULL
					{
					pushFollow(FOLLOW_cident_in_relation10470);
					name=cident();
					state._fsp--;

					match(input,K_IS,FOLLOW_K_IS_in_relation10472); 
					match(input,K_NOT,FOLLOW_K_NOT_in_relation10474); 
					match(input,K_NULL,FOLLOW_K_NULL_in_relation10476); 
					 clauses.add(new SingleColumnRelation(name, Operator.IS_NOT, Constants.NULL_LITERAL)); 
					}
					break;
				case 4 :
					// Parser.g:1426:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation10486); 
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation10490);
					l=tupleOfIdentifiers();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation10494);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10498);
					t=term();
					state._fsp--;

					 clauses.add(new TokenRelation(l, type, t)); 
					}
					break;
				case 5 :
					// Parser.g:1428:7: name= cident K_IN marker= inMarker
					{
					pushFollow(FOLLOW_cident_in_relation10518);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation10520); 
					pushFollow(FOLLOW_inMarker_in_relation10524);
					marker=inMarker();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, Operator.IN, marker)); 
					}
					break;
				case 6 :
					// Parser.g:1430:7: name= cident K_IN inValues= singleColumnInValues
					{
					pushFollow(FOLLOW_cident_in_relation10544);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation10546); 
					pushFollow(FOLLOW_singleColumnInValues_in_relation10550);
					inValues=singleColumnInValues();
					state._fsp--;

					 clauses.add(SingleColumnRelation.createInRelation(name, inValues)); 
					}
					break;
				case 7 :
					// Parser.g:1432:7: name= cident K_CONTAINS ( K_KEY )? t= term
					{
					pushFollow(FOLLOW_cident_in_relation10570);
					name=cident();
					state._fsp--;

					match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_relation10572); 
					 Operator rt = Operator.CONTAINS; 
					// Parser.g:1432:67: ( K_KEY )?
					int alt187=2;
					int LA187_0 = input.LA(1);
					if ( (LA187_0==K_KEY) ) {
						int LA187_1 = input.LA(2);
						if ( (LA187_1==BOOLEAN||LA187_1==FLOAT||LA187_1==HEXNUMBER||(LA187_1 >= IDENT && LA187_1 <= INTEGER)||(LA187_1 >= K_AGGREGATE && LA187_1 <= K_ALL)||LA187_1==K_AS||LA187_1==K_ASCII||(LA187_1 >= K_BIGINT && LA187_1 <= K_BOOLEAN)||(LA187_1 >= K_CALLED && LA187_1 <= K_CLUSTERING)||(LA187_1 >= K_COMPACT && LA187_1 <= K_COUNTER)||(LA187_1 >= K_CUSTOM && LA187_1 <= K_DECIMAL)||(LA187_1 >= K_DISTINCT && LA187_1 <= K_DOUBLE)||(LA187_1 >= K_EXISTS && LA187_1 <= K_FLOAT)||LA187_1==K_FROZEN||(LA187_1 >= K_FUNCTION && LA187_1 <= K_FUNCTIONS)||(LA187_1 >= K_INET && LA187_1 <= K_INPUT)||LA187_1==K_INT||(LA187_1 >= K_JSON && LA187_1 <= K_KEYS)||(LA187_1 >= K_KEYSPACES && LA187_1 <= K_LIKE)||(LA187_1 >= K_LIST && LA187_1 <= K_MAP)||(LA187_1 >= K_NAN && LA187_1 <= K_NOLOGIN)||LA187_1==K_NOSUPERUSER||LA187_1==K_NULL||LA187_1==K_OPTIONS||(LA187_1 >= K_PARTITION && LA187_1 <= K_PERMISSIONS)||LA187_1==K_RETURNS||(LA187_1 >= K_ROLE && LA187_1 <= K_ROLES)||(LA187_1 >= K_SFUNC && LA187_1 <= K_TINYINT)||(LA187_1 >= K_TOKEN && LA187_1 <= K_TRIGGER)||(LA187_1 >= K_TTL && LA187_1 <= K_TYPE)||(LA187_1 >= K_USER && LA187_1 <= K_USERS)||(LA187_1 >= K_UUID && LA187_1 <= K_VARINT)||LA187_1==K_WRITETIME||(LA187_1 >= QMARK && LA187_1 <= QUOTED_NAME)||LA187_1==STRING_LITERAL||LA187_1==UUID||LA187_1==177||LA187_1==181||LA187_1==183||LA187_1==190||LA187_1==194) ) {
							alt187=1;
						}
					}
					switch (alt187) {
						case 1 :
							// Parser.g:1432:68: K_KEY
							{
							match(input,K_KEY,FOLLOW_K_KEY_in_relation10577); 
							 rt = Operator.CONTAINS_KEY; 
							}
							break;

					}

					pushFollow(FOLLOW_term_in_relation10593);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, rt, t)); 
					}
					break;
				case 8 :
					// Parser.g:1434:7: name= cident '[' key= term ']' type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation10605);
					name=cident();
					state._fsp--;

					match(input,190,FOLLOW_190_in_relation10607); 
					pushFollow(FOLLOW_term_in_relation10611);
					key=term();
					state._fsp--;

					match(input,192,FOLLOW_192_in_relation10613); 
					pushFollow(FOLLOW_relationType_in_relation10617);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation10621);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, key, type, t)); 
					}
					break;
				case 9 :
					// Parser.g:1435:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					{
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation10633);
					ids=tupleOfIdentifiers();
					state._fsp--;

					// Parser.g:1436:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					int alt189=3;
					alt189 = dfa189.predict(input);
					switch (alt189) {
						case 1 :
							// Parser.g:1436:9: K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							{
							match(input,K_IN,FOLLOW_K_IN_in_relation10643); 
							// Parser.g:1437:11: ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							int alt188=4;
							int LA188_0 = input.LA(1);
							if ( (LA188_0==177) ) {
								switch ( input.LA(2) ) {
								case 178:
									{
									alt188=1;
									}
									break;
								case 177:
									{
									alt188=3;
									}
									break;
								case QMARK:
								case 183:
									{
									alt188=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 188, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA188_0==QMARK||LA188_0==183) ) {
								alt188=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 188, 0, input);
								throw nvae;
							}

							switch (alt188) {
								case 1 :
									// Parser.g:1437:13: '(' ')'
									{
									match(input,177,FOLLOW_177_in_relation10657); 
									match(input,178,FOLLOW_178_in_relation10659); 
									 clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); 
									}
									break;
								case 2 :
									// Parser.g:1439:13: tupleInMarker= inMarkerForTuple
									{
									pushFollow(FOLLOW_inMarkerForTuple_in_relation10691);
									tupleInMarker=inMarkerForTuple();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); 
									}
									break;
								case 3 :
									// Parser.g:1441:13: literals= tupleOfTupleLiterals
									{
									pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation10725);
									literals=tupleOfTupleLiterals();
									state._fsp--;


									                  clauses.add(MultiColumnRelation.createInRelation(ids, literals));
									              
									}
									break;
								case 4 :
									// Parser.g:1445:13: markers= tupleOfMarkersForTuples
									{
									pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation10759);
									markers=tupleOfMarkersForTuples();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createInRelation(ids, markers)); 
									}
									break;

							}

							}
							break;
						case 2 :
							// Parser.g:1448:9: type= relationType literal= tupleLiteral
							{
							pushFollow(FOLLOW_relationType_in_relation10801);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_tupleLiteral_in_relation10805);
							literal=tupleLiteral();
							state._fsp--;


							              clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
							          
							}
							break;
						case 3 :
							// Parser.g:1452:9: type= relationType tupleMarker= markerForTuple
							{
							pushFollow(FOLLOW_relationType_in_relation10831);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_markerForTuple_in_relation10835);
							tupleMarker=markerForTuple();
							state._fsp--;

							 clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); 
							}
							break;

					}

					}
					break;
				case 10 :
					// Parser.g:1455:7: '(' relation[$clauses] ')'
					{
					match(input,177,FOLLOW_177_in_relation10865); 
					pushFollow(FOLLOW_relation_in_relation10867);
					relation(clauses);
					state._fsp--;

					match(input,178,FOLLOW_178_in_relation10870); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relation"



	// $ANTLR start "inMarker"
	// Parser.g:1458:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final AbstractMarker.INRaw inMarker() throws RecognitionException {
		AbstractMarker.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1459:5: ( QMARK | ':' name= noncol_ident )
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==QMARK) ) {
				alt191=1;
			}
			else if ( (LA191_0==183) ) {
				alt191=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 191, 0, input);
				throw nvae;
			}

			switch (alt191) {
				case 1 :
					// Parser.g:1459:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarker10891); 
					 marker = newINBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1460:7: ':' name= noncol_ident
					{
					match(input,183,FOLLOW_183_in_inMarker10901); 
					pushFollow(FOLLOW_noncol_ident_in_inMarker10905);
					name=noncol_ident();
					state._fsp--;

					 marker = newINBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarker"



	// $ANTLR start "tupleOfIdentifiers"
	// Parser.g:1463:1: tupleOfIdentifiers returns [List<ColumnDefinition.Raw> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
	public final List<ColumnDefinition.Raw> tupleOfIdentifiers() throws RecognitionException {
		List<ColumnDefinition.Raw> ids = null;


		ColumnDefinition.Raw n1 =null;
		ColumnDefinition.Raw ni =null;

		 ids = new ArrayList<ColumnDefinition.Raw>(); 
		try {
			// Parser.g:1465:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
			// Parser.g:1465:7: '(' n1= cident ( ',' ni= cident )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleOfIdentifiers10937); 
			pushFollow(FOLLOW_cident_in_tupleOfIdentifiers10941);
			n1=cident();
			state._fsp--;

			 ids.add(n1); 
			// Parser.g:1465:39: ( ',' ni= cident )*
			loop192:
			while (true) {
				int alt192=2;
				int LA192_0 = input.LA(1);
				if ( (LA192_0==180) ) {
					alt192=1;
				}

				switch (alt192) {
				case 1 :
					// Parser.g:1465:40: ',' ni= cident
					{
					match(input,180,FOLLOW_180_in_tupleOfIdentifiers10946); 
					pushFollow(FOLLOW_cident_in_tupleOfIdentifiers10950);
					ni=cident();
					state._fsp--;

					 ids.add(ni); 
					}
					break;

				default :
					break loop192;
				}
			}

			match(input,178,FOLLOW_178_in_tupleOfIdentifiers10956); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "tupleOfIdentifiers"



	// $ANTLR start "singleColumnInValues"
	// Parser.g:1468:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
	public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
		List<Term.Raw> terms = null;


		Term.Raw t1 =null;
		Term.Raw ti =null;

		 terms = new ArrayList<Term.Raw>(); 
		try {
			// Parser.g:1470:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
			// Parser.g:1470:7: '(' (t1= term ( ',' ti= term )* )? ')'
			{
			match(input,177,FOLLOW_177_in_singleColumnInValues10986); 
			// Parser.g:1470:11: (t1= term ( ',' ti= term )* )?
			int alt194=2;
			int LA194_0 = input.LA(1);
			if ( (LA194_0==BOOLEAN||LA194_0==FLOAT||LA194_0==HEXNUMBER||(LA194_0 >= IDENT && LA194_0 <= INTEGER)||(LA194_0 >= K_AGGREGATE && LA194_0 <= K_ALL)||LA194_0==K_AS||LA194_0==K_ASCII||(LA194_0 >= K_BIGINT && LA194_0 <= K_BOOLEAN)||(LA194_0 >= K_CALLED && LA194_0 <= K_CLUSTERING)||(LA194_0 >= K_COMPACT && LA194_0 <= K_COUNTER)||(LA194_0 >= K_CUSTOM && LA194_0 <= K_DECIMAL)||(LA194_0 >= K_DISTINCT && LA194_0 <= K_DOUBLE)||(LA194_0 >= K_EXISTS && LA194_0 <= K_FLOAT)||LA194_0==K_FROZEN||(LA194_0 >= K_FUNCTION && LA194_0 <= K_FUNCTIONS)||(LA194_0 >= K_INET && LA194_0 <= K_INPUT)||LA194_0==K_INT||(LA194_0 >= K_JSON && LA194_0 <= K_KEYS)||(LA194_0 >= K_KEYSPACES && LA194_0 <= K_LIKE)||(LA194_0 >= K_LIST && LA194_0 <= K_MAP)||(LA194_0 >= K_NAN && LA194_0 <= K_NOLOGIN)||LA194_0==K_NOSUPERUSER||LA194_0==K_NULL||LA194_0==K_OPTIONS||(LA194_0 >= K_PARTITION && LA194_0 <= K_PERMISSIONS)||LA194_0==K_RETURNS||(LA194_0 >= K_ROLE && LA194_0 <= K_ROLES)||(LA194_0 >= K_SFUNC && LA194_0 <= K_TINYINT)||(LA194_0 >= K_TOKEN && LA194_0 <= K_TRIGGER)||(LA194_0 >= K_TTL && LA194_0 <= K_TYPE)||(LA194_0 >= K_USER && LA194_0 <= K_USERS)||(LA194_0 >= K_UUID && LA194_0 <= K_VARINT)||LA194_0==K_WRITETIME||(LA194_0 >= QMARK && LA194_0 <= QUOTED_NAME)||LA194_0==STRING_LITERAL||LA194_0==UUID||LA194_0==177||LA194_0==181||LA194_0==183||LA194_0==190||LA194_0==194) ) {
				alt194=1;
			}
			switch (alt194) {
				case 1 :
					// Parser.g:1470:13: t1= term ( ',' ti= term )*
					{
					pushFollow(FOLLOW_term_in_singleColumnInValues10994);
					t1=term();
					state._fsp--;

					 terms.add(t1); 
					// Parser.g:1470:43: ( ',' ti= term )*
					loop193:
					while (true) {
						int alt193=2;
						int LA193_0 = input.LA(1);
						if ( (LA193_0==180) ) {
							alt193=1;
						}

						switch (alt193) {
						case 1 :
							// Parser.g:1470:44: ',' ti= term
							{
							match(input,180,FOLLOW_180_in_singleColumnInValues10999); 
							pushFollow(FOLLOW_term_in_singleColumnInValues11003);
							ti=term();
							state._fsp--;

							 terms.add(ti); 
							}
							break;

						default :
							break loop193;
						}
					}

					}
					break;

			}

			match(input,178,FOLLOW_178_in_singleColumnInValues11012); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return terms;
	}
	// $ANTLR end "singleColumnInValues"



	// $ANTLR start "tupleOfTupleLiterals"
	// Parser.g:1473:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
	public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
		List<Tuples.Literal> literals = null;


		Tuples.Literal t1 =null;
		Tuples.Literal ti =null;

		 literals = new ArrayList<>(); 
		try {
			// Parser.g:1475:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
			// Parser.g:1475:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleOfTupleLiterals11042); 
			pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11046);
			t1=tupleLiteral();
			state._fsp--;

			 literals.add(t1); 
			// Parser.g:1475:50: ( ',' ti= tupleLiteral )*
			loop195:
			while (true) {
				int alt195=2;
				int LA195_0 = input.LA(1);
				if ( (LA195_0==180) ) {
					alt195=1;
				}

				switch (alt195) {
				case 1 :
					// Parser.g:1475:51: ',' ti= tupleLiteral
					{
					match(input,180,FOLLOW_180_in_tupleOfTupleLiterals11051); 
					pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11055);
					ti=tupleLiteral();
					state._fsp--;

					 literals.add(ti); 
					}
					break;

				default :
					break loop195;
				}
			}

			match(input,178,FOLLOW_178_in_tupleOfTupleLiterals11061); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literals;
	}
	// $ANTLR end "tupleOfTupleLiterals"



	// $ANTLR start "markerForTuple"
	// Parser.g:1478:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.Raw markerForTuple() throws RecognitionException {
		Tuples.Raw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1479:5: ( QMARK | ':' name= noncol_ident )
			int alt196=2;
			int LA196_0 = input.LA(1);
			if ( (LA196_0==QMARK) ) {
				alt196=1;
			}
			else if ( (LA196_0==183) ) {
				alt196=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 196, 0, input);
				throw nvae;
			}

			switch (alt196) {
				case 1 :
					// Parser.g:1479:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_markerForTuple11082); 
					 marker = newTupleBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1480:7: ':' name= noncol_ident
					{
					match(input,183,FOLLOW_183_in_markerForTuple11092); 
					pushFollow(FOLLOW_noncol_ident_in_markerForTuple11096);
					name=noncol_ident();
					state._fsp--;

					 marker = newTupleBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "markerForTuple"



	// $ANTLR start "tupleOfMarkersForTuples"
	// Parser.g:1483:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
	public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
		List<Tuples.Raw> markers = null;


		Tuples.Raw m1 =null;
		Tuples.Raw mi =null;

		 markers = new ArrayList<Tuples.Raw>(); 
		try {
			// Parser.g:1485:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
			// Parser.g:1485:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
			{
			match(input,177,FOLLOW_177_in_tupleOfMarkersForTuples11128); 
			pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11132);
			m1=markerForTuple();
			state._fsp--;

			 markers.add(m1); 
			// Parser.g:1485:51: ( ',' mi= markerForTuple )*
			loop197:
			while (true) {
				int alt197=2;
				int LA197_0 = input.LA(1);
				if ( (LA197_0==180) ) {
					alt197=1;
				}

				switch (alt197) {
				case 1 :
					// Parser.g:1485:52: ',' mi= markerForTuple
					{
					match(input,180,FOLLOW_180_in_tupleOfMarkersForTuples11137); 
					pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11141);
					mi=markerForTuple();
					state._fsp--;

					 markers.add(mi); 
					}
					break;

				default :
					break loop197;
				}
			}

			match(input,178,FOLLOW_178_in_tupleOfMarkersForTuples11147); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return markers;
	}
	// $ANTLR end "tupleOfMarkersForTuples"



	// $ANTLR start "inMarkerForTuple"
	// Parser.g:1488:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= noncol_ident );
	public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
		Tuples.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// Parser.g:1489:5: ( QMARK | ':' name= noncol_ident )
			int alt198=2;
			int LA198_0 = input.LA(1);
			if ( (LA198_0==QMARK) ) {
				alt198=1;
			}
			else if ( (LA198_0==183) ) {
				alt198=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 198, 0, input);
				throw nvae;
			}

			switch (alt198) {
				case 1 :
					// Parser.g:1489:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple11168); 
					 marker = newTupleINBindVariables(null); 
					}
					break;
				case 2 :
					// Parser.g:1490:7: ':' name= noncol_ident
					{
					match(input,183,FOLLOW_183_in_inMarkerForTuple11178); 
					pushFollow(FOLLOW_noncol_ident_in_inMarkerForTuple11182);
					name=noncol_ident();
					state._fsp--;

					 marker = newTupleINBindVariables(name); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return marker;
	}
	// $ANTLR end "inMarkerForTuple"



	// $ANTLR start "comparatorType"
	// Parser.g:1493:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );
	public final CQL3Type.Raw comparatorType() throws RecognitionException {
		CQL3Type.Raw t = null;


		Token s=null;
		CQL3Type n =null;
		CQL3Type.Raw c =null;
		CQL3Type.Raw tt =null;
		UTName id =null;
		CQL3Type.Raw f =null;

		try {
			// Parser.g:1494:5: (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL )
			int alt199=6;
			alt199 = dfa199.predict(input);
			switch (alt199) {
				case 1 :
					// Parser.g:1494:7: n= native_type
					{
					pushFollow(FOLLOW_native_type_in_comparatorType11207);
					n=native_type();
					state._fsp--;

					 t = CQL3Type.Raw.from(n); 
					}
					break;
				case 2 :
					// Parser.g:1495:7: c= collection_type
					{
					pushFollow(FOLLOW_collection_type_in_comparatorType11223);
					c=collection_type();
					state._fsp--;

					 t = c; 
					}
					break;
				case 3 :
					// Parser.g:1496:7: tt= tuple_type
					{
					pushFollow(FOLLOW_tuple_type_in_comparatorType11235);
					tt=tuple_type();
					state._fsp--;

					 t = tt; 
					}
					break;
				case 4 :
					// Parser.g:1497:7: id= userTypeName
					{
					pushFollow(FOLLOW_userTypeName_in_comparatorType11251);
					id=userTypeName();
					state._fsp--;

					 t = CQL3Type.Raw.userType(id); 
					}
					break;
				case 5 :
					// Parser.g:1498:7: K_FROZEN '<' f= comparatorType '>'
					{
					match(input,K_FROZEN,FOLLOW_K_FROZEN_in_comparatorType11263); 
					match(input,185,FOLLOW_185_in_comparatorType11265); 
					pushFollow(FOLLOW_comparatorType_in_comparatorType11269);
					f=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_comparatorType11271); 

					        try {
					            t = CQL3Type.Raw.frozen(f);
					        } catch (InvalidRequestException e) {
					            addRecognitionError(e.getMessage());
					        }
					      
					}
					break;
				case 6 :
					// Parser.g:1506:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType11289); 

					        try {
					            t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
					        } catch (SyntaxException e) {
					            addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        } catch (ConfigurationException e) {
					            addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        }
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "comparatorType"



	// $ANTLR start "native_type"
	// Parser.g:1518:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME );
	public final CQL3Type native_type() throws RecognitionException {
		CQL3Type t = null;


		try {
			// Parser.g:1519:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_SMALLINT | K_TEXT | K_TIMESTAMP | K_TINYINT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_DATE | K_TIME )
			int alt200=20;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				alt200=1;
				}
				break;
			case K_BIGINT:
				{
				alt200=2;
				}
				break;
			case K_BLOB:
				{
				alt200=3;
				}
				break;
			case K_BOOLEAN:
				{
				alt200=4;
				}
				break;
			case K_COUNTER:
				{
				alt200=5;
				}
				break;
			case K_DECIMAL:
				{
				alt200=6;
				}
				break;
			case K_DOUBLE:
				{
				alt200=7;
				}
				break;
			case K_FLOAT:
				{
				alt200=8;
				}
				break;
			case K_INET:
				{
				alt200=9;
				}
				break;
			case K_INT:
				{
				alt200=10;
				}
				break;
			case K_SMALLINT:
				{
				alt200=11;
				}
				break;
			case K_TEXT:
				{
				alt200=12;
				}
				break;
			case K_TIMESTAMP:
				{
				alt200=13;
				}
				break;
			case K_TINYINT:
				{
				alt200=14;
				}
				break;
			case K_UUID:
				{
				alt200=15;
				}
				break;
			case K_VARCHAR:
				{
				alt200=16;
				}
				break;
			case K_VARINT:
				{
				alt200=17;
				}
				break;
			case K_TIMEUUID:
				{
				alt200=18;
				}
				break;
			case K_DATE:
				{
				alt200=19;
				}
				break;
			case K_TIME:
				{
				alt200=20;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 200, 0, input);
				throw nvae;
			}
			switch (alt200) {
				case 1 :
					// Parser.g:1519:7: K_ASCII
					{
					match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type11318); 
					 t = CQL3Type.Native.ASCII; 
					}
					break;
				case 2 :
					// Parser.g:1520:7: K_BIGINT
					{
					match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type11332); 
					 t = CQL3Type.Native.BIGINT; 
					}
					break;
				case 3 :
					// Parser.g:1521:7: K_BLOB
					{
					match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type11345); 
					 t = CQL3Type.Native.BLOB; 
					}
					break;
				case 4 :
					// Parser.g:1522:7: K_BOOLEAN
					{
					match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type11360); 
					 t = CQL3Type.Native.BOOLEAN; 
					}
					break;
				case 5 :
					// Parser.g:1523:7: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type11372); 
					 t = CQL3Type.Native.COUNTER; 
					}
					break;
				case 6 :
					// Parser.g:1524:7: K_DECIMAL
					{
					match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type11384); 
					 t = CQL3Type.Native.DECIMAL; 
					}
					break;
				case 7 :
					// Parser.g:1525:7: K_DOUBLE
					{
					match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type11396); 
					 t = CQL3Type.Native.DOUBLE; 
					}
					break;
				case 8 :
					// Parser.g:1526:7: K_FLOAT
					{
					match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type11409); 
					 t = CQL3Type.Native.FLOAT; 
					}
					break;
				case 9 :
					// Parser.g:1527:7: K_INET
					{
					match(input,K_INET,FOLLOW_K_INET_in_native_type11423); 
					 t = CQL3Type.Native.INET;
					}
					break;
				case 10 :
					// Parser.g:1528:7: K_INT
					{
					match(input,K_INT,FOLLOW_K_INT_in_native_type11438); 
					 t = CQL3Type.Native.INT; 
					}
					break;
				case 11 :
					// Parser.g:1529:7: K_SMALLINT
					{
					match(input,K_SMALLINT,FOLLOW_K_SMALLINT_in_native_type11454); 
					 t = CQL3Type.Native.SMALLINT; 
					}
					break;
				case 12 :
					// Parser.g:1530:7: K_TEXT
					{
					match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type11465); 
					 t = CQL3Type.Native.TEXT; 
					}
					break;
				case 13 :
					// Parser.g:1531:7: K_TIMESTAMP
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type11480); 
					 t = CQL3Type.Native.TIMESTAMP; 
					}
					break;
				case 14 :
					// Parser.g:1532:7: K_TINYINT
					{
					match(input,K_TINYINT,FOLLOW_K_TINYINT_in_native_type11490); 
					 t = CQL3Type.Native.TINYINT; 
					}
					break;
				case 15 :
					// Parser.g:1533:7: K_UUID
					{
					match(input,K_UUID,FOLLOW_K_UUID_in_native_type11502); 
					 t = CQL3Type.Native.UUID; 
					}
					break;
				case 16 :
					// Parser.g:1534:7: K_VARCHAR
					{
					match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type11517); 
					 t = CQL3Type.Native.VARCHAR; 
					}
					break;
				case 17 :
					// Parser.g:1535:7: K_VARINT
					{
					match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type11529); 
					 t = CQL3Type.Native.VARINT; 
					}
					break;
				case 18 :
					// Parser.g:1536:7: K_TIMEUUID
					{
					match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type11542); 
					 t = CQL3Type.Native.TIMEUUID; 
					}
					break;
				case 19 :
					// Parser.g:1537:7: K_DATE
					{
					match(input,K_DATE,FOLLOW_K_DATE_in_native_type11553); 
					 t = CQL3Type.Native.DATE; 
					}
					break;
				case 20 :
					// Parser.g:1538:7: K_TIME
					{
					match(input,K_TIME,FOLLOW_K_TIME_in_native_type11568); 
					 t = CQL3Type.Native.TIME; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "native_type"



	// $ANTLR start "collection_type"
	// Parser.g:1541:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
	public final CQL3Type.Raw collection_type() throws RecognitionException {
		CQL3Type.Raw pt = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw t2 =null;
		CQL3Type.Raw t =null;

		try {
			// Parser.g:1542:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
			int alt201=3;
			switch ( input.LA(1) ) {
			case K_MAP:
				{
				alt201=1;
				}
				break;
			case K_LIST:
				{
				alt201=2;
				}
				break;
			case K_SET:
				{
				alt201=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 201, 0, input);
				throw nvae;
			}
			switch (alt201) {
				case 1 :
					// Parser.g:1542:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
					{
					match(input,K_MAP,FOLLOW_K_MAP_in_collection_type11596); 
					match(input,185,FOLLOW_185_in_collection_type11599); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11603);
					t1=comparatorType();
					state._fsp--;

					match(input,180,FOLLOW_180_in_collection_type11605); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11609);
					t2=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_collection_type11611); 

					            // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
					            if (t1 != null && t2 != null)
					                pt = CQL3Type.Raw.map(t1, t2);
					        
					}
					break;
				case 2 :
					// Parser.g:1548:7: K_LIST '<' t= comparatorType '>'
					{
					match(input,K_LIST,FOLLOW_K_LIST_in_collection_type11629); 
					match(input,185,FOLLOW_185_in_collection_type11631); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11635);
					t=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_collection_type11637); 
					 if (t != null) pt = CQL3Type.Raw.list(t); 
					}
					break;
				case 3 :
					// Parser.g:1550:7: K_SET '<' t= comparatorType '>'
					{
					match(input,K_SET,FOLLOW_K_SET_in_collection_type11655); 
					match(input,185,FOLLOW_185_in_collection_type11658); 
					pushFollow(FOLLOW_comparatorType_in_collection_type11662);
					t=comparatorType();
					state._fsp--;

					match(input,188,FOLLOW_188_in_collection_type11664); 
					 if (t != null) pt = CQL3Type.Raw.set(t); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pt;
	}
	// $ANTLR end "collection_type"



	// $ANTLR start "tuple_type"
	// Parser.g:1554:1: tuple_type returns [CQL3Type.Raw t] : K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' ;
	public final CQL3Type.Raw tuple_type() throws RecognitionException {
		CQL3Type.Raw t = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw tn =null;

		try {
			// Parser.g:1555:5: ( K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' )
			// Parser.g:1555:7: K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>'
			{
			match(input,K_TUPLE,FOLLOW_K_TUPLE_in_tuple_type11695); 
			match(input,185,FOLLOW_185_in_tuple_type11697); 
			 List<CQL3Type.Raw> types = new ArrayList<>(); 
			pushFollow(FOLLOW_comparatorType_in_tuple_type11712);
			t1=comparatorType();
			state._fsp--;

			 types.add(t1); 
			// Parser.g:1556:47: ( ',' tn= comparatorType )*
			loop202:
			while (true) {
				int alt202=2;
				int LA202_0 = input.LA(1);
				if ( (LA202_0==180) ) {
					alt202=1;
				}

				switch (alt202) {
				case 1 :
					// Parser.g:1556:48: ',' tn= comparatorType
					{
					match(input,180,FOLLOW_180_in_tuple_type11717); 
					pushFollow(FOLLOW_comparatorType_in_tuple_type11721);
					tn=comparatorType();
					state._fsp--;

					 types.add(tn); 
					}
					break;

				default :
					break loop202;
				}
			}

			match(input,188,FOLLOW_188_in_tuple_type11733); 
			 t = CQL3Type.Raw.tuple(types); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "tuple_type"


	public static class username_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "username"
	// Parser.g:1560:1: username : ( IDENT | STRING_LITERAL | QUOTED_NAME );
	public final Cql_Parser.username_return username() throws RecognitionException {
		Cql_Parser.username_return retval = new Cql_Parser.username_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1561:5: ( IDENT | STRING_LITERAL | QUOTED_NAME )
			int alt203=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt203=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt203=2;
				}
				break;
			case QUOTED_NAME:
				{
				alt203=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 203, 0, input);
				throw nvae;
			}
			switch (alt203) {
				case 1 :
					// Parser.g:1561:7: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_username11752); 
					}
					break;
				case 2 :
					// Parser.g:1562:7: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_username11760); 
					}
					break;
				case 3 :
					// Parser.g:1563:7: QUOTED_NAME
					{
					match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_username11768); 
					 addRecognitionError("Quoted strings are are not supported for user names and USER is deprecated, please use ROLE");
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "username"


	public static class mbean_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "mbean"
	// Parser.g:1566:1: mbean : STRING_LITERAL ;
	public final Cql_Parser.mbean_return mbean() throws RecognitionException {
		Cql_Parser.mbean_return retval = new Cql_Parser.mbean_return();
		retval.start = input.LT(1);

		try {
			// Parser.g:1567:5: ( STRING_LITERAL )
			// Parser.g:1567:7: STRING_LITERAL
			{
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_mbean11787); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mbean"



	// $ANTLR start "non_type_ident"
	// Parser.g:1572:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY );
	public final ColumnIdentifier non_type_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		Token kk=null;
		String k =null;

		try {
			// Parser.g:1573:5: (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY )
			int alt204=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt204=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt204=2;
				}
				break;
			case K_AGGREGATE:
			case K_ALL:
			case K_AS:
			case K_CALLED:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_EXISTS:
			case K_FILTERING:
			case K_FINALFUNC:
			case K_FROZEN:
			case K_FUNCTION:
			case K_FUNCTIONS:
			case K_INITCOND:
			case K_INPUT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIKE:
			case K_LIST:
			case K_LOGIN:
			case K_MAP:
			case K_NOLOGIN:
			case K_NOSUPERUSER:
			case K_OPTIONS:
			case K_PARTITION:
			case K_PASSWORD:
			case K_PER:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_ROLE:
			case K_ROLES:
			case K_SFUNC:
			case K_STATIC:
			case K_STORAGE:
			case K_STYPE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TUPLE:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				alt204=3;
				}
				break;
			case K_KEY:
				{
				alt204=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 204, 0, input);
				throw nvae;
			}
			switch (alt204) {
				case 1 :
					// Parser.g:1573:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident11812); 
					 if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// Parser.g:1574:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident11843); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// Parser.g:1575:7: k= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident11868);
					k=basic_unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
					}
					break;
				case 4 :
					// Parser.g:1576:7: kk= K_KEY
					{
					kk=(Token)match(input,K_KEY,FOLLOW_K_KEY_in_non_type_ident11880); 
					 id = new ColumnIdentifier((kk!=null?kk.getText():null), false); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "non_type_ident"



	// $ANTLR start "unreserved_keyword"
	// Parser.g:1579:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) );
	public final String unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;
		String u =null;

		try {
			// Parser.g:1580:5: (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT ) )
			int alt205=2;
			int LA205_0 = input.LA(1);
			if ( ((LA205_0 >= K_AGGREGATE && LA205_0 <= K_ALL)||LA205_0==K_AS||LA205_0==K_ASCII||(LA205_0 >= K_BIGINT && LA205_0 <= K_BOOLEAN)||LA205_0==K_CALLED||LA205_0==K_CLUSTERING||(LA205_0 >= K_COMPACT && LA205_0 <= K_CONTAINS)||LA205_0==K_COUNTER||(LA205_0 >= K_CUSTOM && LA205_0 <= K_DECIMAL)||LA205_0==K_DOUBLE||(LA205_0 >= K_EXISTS && LA205_0 <= K_FLOAT)||LA205_0==K_FROZEN||(LA205_0 >= K_FUNCTION && LA205_0 <= K_FUNCTIONS)||LA205_0==K_INET||(LA205_0 >= K_INITCOND && LA205_0 <= K_INPUT)||LA205_0==K_INT||LA205_0==K_KEYS||(LA205_0 >= K_KEYSPACES && LA205_0 <= K_LIKE)||(LA205_0 >= K_LIST && LA205_0 <= K_MAP)||LA205_0==K_NOLOGIN||LA205_0==K_NOSUPERUSER||LA205_0==K_OPTIONS||(LA205_0 >= K_PARTITION && LA205_0 <= K_PERMISSIONS)||LA205_0==K_RETURNS||(LA205_0 >= K_ROLE && LA205_0 <= K_ROLES)||(LA205_0 >= K_SFUNC && LA205_0 <= K_TINYINT)||LA205_0==K_TRIGGER||(LA205_0 >= K_TUPLE && LA205_0 <= K_TYPE)||(LA205_0 >= K_USER && LA205_0 <= K_USERS)||(LA205_0 >= K_UUID && LA205_0 <= K_VARINT)) ) {
				alt205=1;
			}
			else if ( (LA205_0==K_CAST||LA205_0==K_COUNT||LA205_0==K_DISTINCT||(LA205_0 >= K_JSON && LA205_0 <= K_KEY)||LA205_0==K_TTL||LA205_0==K_WRITETIME) ) {
				alt205=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 205, 0, input);
				throw nvae;
			}

			switch (alt205) {
				case 1 :
					// Parser.g:1580:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword11923);
					u=unreserved_function_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// Parser.g:1581:7: k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY | K_CAST | K_JSON | K_DISTINCT )
					{
					k=input.LT(1);
					if ( input.LA(1)==K_CAST||input.LA(1)==K_COUNT||input.LA(1)==K_DISTINCT||(input.LA(1) >= K_JSON && input.LA(1) <= K_KEY)||input.LA(1)==K_TTL||input.LA(1)==K_WRITETIME ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 str = (k!=null?k.getText():null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_keyword"



	// $ANTLR start "unreserved_function_keyword"
	// Parser.g:1584:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword |t= native_type );
	public final String unreserved_function_keyword() throws RecognitionException {
		String str = null;


		String u =null;
		CQL3Type t =null;

		try {
			// Parser.g:1585:5: (u= basic_unreserved_keyword |t= native_type )
			int alt206=2;
			int LA206_0 = input.LA(1);
			if ( ((LA206_0 >= K_AGGREGATE && LA206_0 <= K_ALL)||LA206_0==K_AS||LA206_0==K_CALLED||LA206_0==K_CLUSTERING||(LA206_0 >= K_COMPACT && LA206_0 <= K_CONTAINS)||LA206_0==K_CUSTOM||(LA206_0 >= K_EXISTS && LA206_0 <= K_FINALFUNC)||LA206_0==K_FROZEN||(LA206_0 >= K_FUNCTION && LA206_0 <= K_FUNCTIONS)||(LA206_0 >= K_INITCOND && LA206_0 <= K_INPUT)||LA206_0==K_KEYS||(LA206_0 >= K_KEYSPACES && LA206_0 <= K_LIKE)||(LA206_0 >= K_LIST && LA206_0 <= K_MAP)||LA206_0==K_NOLOGIN||LA206_0==K_NOSUPERUSER||LA206_0==K_OPTIONS||(LA206_0 >= K_PARTITION && LA206_0 <= K_PERMISSIONS)||LA206_0==K_RETURNS||(LA206_0 >= K_ROLE && LA206_0 <= K_ROLES)||LA206_0==K_SFUNC||(LA206_0 >= K_STATIC && LA206_0 <= K_SUPERUSER)||LA206_0==K_TRIGGER||(LA206_0 >= K_TUPLE && LA206_0 <= K_TYPE)||(LA206_0 >= K_USER && LA206_0 <= K_USERS)||LA206_0==K_VALUES) ) {
				alt206=1;
			}
			else if ( (LA206_0==K_ASCII||(LA206_0 >= K_BIGINT && LA206_0 <= K_BOOLEAN)||LA206_0==K_COUNTER||(LA206_0 >= K_DATE && LA206_0 <= K_DECIMAL)||LA206_0==K_DOUBLE||LA206_0==K_FLOAT||LA206_0==K_INET||LA206_0==K_INT||LA206_0==K_SMALLINT||(LA206_0 >= K_TEXT && LA206_0 <= K_TINYINT)||LA206_0==K_UUID||(LA206_0 >= K_VARCHAR && LA206_0 <= K_VARINT)) ) {
				alt206=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 206, 0, input);
				throw nvae;
			}

			switch (alt206) {
				case 1 :
					// Parser.g:1585:7: u= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword11990);
					u=basic_unreserved_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// Parser.g:1586:7: t= native_type
					{
					pushFollow(FOLLOW_native_type_in_unreserved_function_keyword12002);
					t=native_type();
					state._fsp--;

					 str = t.toString(); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "unreserved_function_keyword"



	// $ANTLR start "basic_unreserved_keyword"
	// Parser.g:1589:1: basic_unreserved_keyword returns [String str] : k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION ) ;
	public final String basic_unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;

		try {
			// Parser.g:1590:5: (k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION ) )
			// Parser.g:1590:7: k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_ROLE | K_ROLES | K_SUPERUSER | K_NOSUPERUSER | K_LOGIN | K_NOLOGIN | K_OPTIONS | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_CONTAINS | K_STATIC | K_FROZEN | K_TUPLE | K_FUNCTION | K_FUNCTIONS | K_AGGREGATE | K_SFUNC | K_STYPE | K_FINALFUNC | K_INITCOND | K_RETURNS | K_LANGUAGE | K_CALLED | K_INPUT | K_LIKE | K_PER | K_PARTITION )
			{
			k=input.LT(1);
			if ( (input.LA(1) >= K_AGGREGATE && input.LA(1) <= K_ALL)||input.LA(1)==K_AS||input.LA(1)==K_CALLED||input.LA(1)==K_CLUSTERING||(input.LA(1) >= K_COMPACT && input.LA(1) <= K_CONTAINS)||input.LA(1)==K_CUSTOM||(input.LA(1) >= K_EXISTS && input.LA(1) <= K_FINALFUNC)||input.LA(1)==K_FROZEN||(input.LA(1) >= K_FUNCTION && input.LA(1) <= K_FUNCTIONS)||(input.LA(1) >= K_INITCOND && input.LA(1) <= K_INPUT)||input.LA(1)==K_KEYS||(input.LA(1) >= K_KEYSPACES && input.LA(1) <= K_LIKE)||(input.LA(1) >= K_LIST && input.LA(1) <= K_MAP)||input.LA(1)==K_NOLOGIN||input.LA(1)==K_NOSUPERUSER||input.LA(1)==K_OPTIONS||(input.LA(1) >= K_PARTITION && input.LA(1) <= K_PERMISSIONS)||input.LA(1)==K_RETURNS||(input.LA(1) >= K_ROLE && input.LA(1) <= K_ROLES)||input.LA(1)==K_SFUNC||(input.LA(1) >= K_STATIC && input.LA(1) <= K_SUPERUSER)||input.LA(1)==K_TRIGGER||(input.LA(1) >= K_TUPLE && input.LA(1) <= K_TYPE)||(input.LA(1) >= K_USER && input.LA(1) <= K_USERS)||input.LA(1)==K_VALUES ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 str = (k!=null?k.getText():null); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "basic_unreserved_keyword"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA40 dfa40 = new DFA40(this);
	protected DFA148 dfa148 = new DFA148(this);
	protected DFA149 dfa149 = new DFA149(this);
	protected DFA167 dfa167 = new DFA167(this);
	protected DFA169 dfa169 = new DFA169(this);
	protected DFA171 dfa171 = new DFA171(this);
	protected DFA173 dfa173 = new DFA173(this);
	protected DFA176 dfa176 = new DFA176(this);
	protected DFA184 dfa184 = new DFA184(this);
	protected DFA190 dfa190 = new DFA190(this);
	protected DFA189 dfa189 = new DFA189(this);
	protected DFA199 dfa199 = new DFA199(this);
	static final String DFA1_eotS =
		"\63\uffff";
	static final String DFA1_eofS =
		"\63\uffff";
	static final String DFA1_minS =
		"\1\34\7\uffff\2\31\1\54\2\24\1\32\10\uffff\1\163\22\uffff\1\150\2\uffff"+
		"\1\101\5\uffff\1\31";
	static final String DFA1_maxS =
		"\1\u008e\7\uffff\3\u008f\2\u00a6\1\u0090\10\uffff\1\163\22\uffff\1\u0085"+
		"\2\uffff\1\160\5\uffff\1\104";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\10\1\11\1\23\1\27\1\31"+
		"\1\40\1\46\1\12\1\uffff\1\34\1\36\1\13\1\14\1\15\1\25\1\30\1\33\1\35\1"+
		"\37\1\42\1\47\1\16\1\17\1\24\1\32\1\41\1\50\1\uffff\1\20\1\44\1\uffff"+
		"\1\21\1\45\1\26\1\43\1\22\1\uffff";
	static final String DFA1_specialS =
		"\63\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\12\7\uffff\1\4\14\uffff\1\10\3\uffff\1\5\4\uffff\1\11\13\uffff\1\13"+
			"\7\uffff\1\2\13\uffff\1\15\32\uffff\1\14\2\uffff\1\1\17\uffff\1\7\4\uffff"+
			"\1\3\1\6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30\22\uffff\1\17\5\uffff\1\25\21\uffff\1\27\4\uffff\1\25\13\uffff"+
			"\1\16\7\uffff\1\24\14\uffff\1\26\13\uffff\1\23\20\uffff\1\21\3\uffff"+
			"\1\22\3\uffff\1\20",
			"\1\40\22\uffff\1\32\27\uffff\1\37\4\uffff\1\33\13\uffff\1\31\7\uffff"+
			"\1\42\30\uffff\1\41\20\uffff\1\35\3\uffff\1\36\3\uffff\1\34",
			"\1\43\50\uffff\1\44\7\uffff\1\50\30\uffff\1\47\24\uffff\1\46\3\uffff"+
			"\1\45",
			"\1\53\4\uffff\1\53\1\51\1\uffff\1\52\2\uffff\1\53\1\uffff\1\53\1\52"+
			"\2\uffff\3\53\1\uffff\3\53\1\uffff\4\53\1\52\3\53\2\uffff\1\52\2\53\1"+
			"\52\1\uffff\1\52\4\53\1\uffff\1\53\1\uffff\2\53\4\uffff\1\53\1\uffff"+
			"\2\53\1\uffff\1\53\2\uffff\3\53\1\uffff\3\53\1\uffff\3\53\3\uffff\1\52"+
			"\1\uffff\1\53\1\uffff\1\53\4\uffff\1\53\2\uffff\5\53\3\uffff\1\53\1\uffff"+
			"\2\53\1\52\1\uffff\13\53\2\uffff\1\53\1\uffff\3\53\3\uffff\2\53\1\uffff"+
			"\4\53\3\uffff\1\53\10\uffff\2\53\2\uffff\1\53",
			"\1\56\4\uffff\1\56\1\54\1\uffff\1\55\2\uffff\1\56\1\uffff\1\56\1\55"+
			"\2\uffff\3\56\1\uffff\3\56\1\uffff\4\56\1\55\3\56\2\uffff\1\55\2\56\1"+
			"\55\1\uffff\1\55\4\56\1\uffff\1\56\1\uffff\2\56\4\uffff\1\56\1\uffff"+
			"\2\56\1\uffff\1\56\2\uffff\3\56\1\uffff\3\56\1\uffff\3\56\3\uffff\1\55"+
			"\1\uffff\1\56\1\uffff\1\56\4\uffff\1\56\2\uffff\5\56\3\uffff\1\56\1\uffff"+
			"\2\56\1\55\1\uffff\13\56\2\uffff\1\56\1\uffff\3\56\3\uffff\2\56\1\uffff"+
			"\4\56\3\uffff\1\56\10\uffff\2\56\2\uffff\1\56",
			"\1\61\1\uffff\1\61\5\uffff\1\61\16\uffff\1\61\5\uffff\1\61\2\uffff\1"+
			"\61\1\uffff\1\61\43\uffff\1\61\26\uffff\1\60\1\61\27\uffff\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52\7\uffff\1\52\24\uffff\1\53",
			"",
			"",
			"\1\56\46\uffff\1\55\7\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"\1\30\52\uffff\1\27"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "188:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantPermissionsStatement |st17= revokePermissionsStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= createAggregateStatement |st31= dropAggregateStatement |st32= createRoleStatement |st33= alterRoleStatement |st34= dropRoleStatement |st35= listRolesStatement |st36= grantRoleStatement |st37= revokeRoleStatement |st38= createMaterializedViewStatement |st39= dropMaterializedViewStatement |st40= alterMaterializedViewStatement );";
		}
	}

	static final String DFA13_eotS =
		"\176\uffff";
	static final String DFA13_eofS =
		"\176\uffff";
	static final String DFA13_minS =
		"\1\6\30\37\1\uffff\1\6\5\37\1\uffff\1\24\1\uffff\1\6\1\u00b2\30\u00b1"+
		"\1\u00b2\2\u00b1\1\uffff\1\u00b1\1\u00b6\1\u00b1\1\24\3\uffff\30\37\1"+
		"\uffff\1\6\1\24\30\37\3\u00b1";
	static final String DFA13_maxS =
		"\1\u00c2\30\u00b6\1\uffff\1\u00c2\5\u00b6\1\uffff\1\u00a3\1\uffff\1\u00c2"+
		"\1\u00b4\2\u00b6\1\u00b9\26\u00b6\2\u00b9\1\uffff\1\u00b9\2\u00b6\1\u00a3"+
		"\3\uffff\30\u00b6\1\uffff\1\u00c2\1\u00a3\30\u00b6\3\u00b2";
	static final String DFA13_acceptS =
		"\31\uffff\1\2\6\uffff\1\10\1\uffff\1\1\35\uffff\1\3\4\uffff\1\5\1\6\1"+
		"\7\30\uffff\1\4\35\uffff";
	static final String DFA13_specialS =
		"\176\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\31\7\uffff\1\31\3\uffff\1\31\1\uffff\1\1\1\31\3\uffff\2\3\4\uffff"+
			"\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff\1\3\1\36\1\3\1\uffff\2\3"+
			"\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\37\1\12\3\uffff\3\3\1\13\1"+
			"\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\31\2\3\1\uffff\1\15\2\uffff\2\37"+
			"\1\3\1\uffff\3\3\1\uffff\3\3\4\uffff\1\31\1\3\1\uffff\1\3\1\uffff\1\31"+
			"\2\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff\1\3\1\16\4\3"+
			"\1\17\1\27\1\20\1\25\1\21\1\uffff\1\40\1\3\1\uffff\1\35\2\3\3\uffff\2"+
			"\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\34\10\uffff\1\33\1\2\2\uffff"+
			"\1\31\2\uffff\1\31\7\uffff\1\32\3\uffff\1\31\1\uffff\1\31\6\uffff\1\31"+
			"\3\uffff\1\31",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\43\1\42\1\uffff\1\42\1\uffff\1\41",
			"",
			"\1\31\7\uffff\1\31\3\uffff\1\31\1\uffff\1\45\1\31\3\uffff\2\103\4\uffff"+
			"\1\103\1\uffff\1\50\3\uffff\1\51\1\52\1\53\1\uffff\1\103\1\102\1\103"+
			"\1\uffff\2\103\1\74\1\54\1\uffff\1\103\1\72\1\55\3\uffff\1\102\1\56\3"+
			"\uffff\3\103\1\57\1\uffff\1\101\1\uffff\2\103\4\uffff\1\60\1\31\2\103"+
			"\1\uffff\1\61\2\uffff\1\102\1\75\1\103\1\uffff\3\103\1\uffff\1\76\1\103"+
			"\1\47\4\uffff\1\31\1\103\1\uffff\1\103\1\uffff\1\31\2\uffff\1\103\2\uffff"+
			"\5\103\3\uffff\1\103\1\uffff\2\103\1\uffff\1\100\1\103\1\62\4\103\1\63"+
			"\1\73\1\64\1\71\1\65\1\uffff\1\31\1\103\1\uffff\1\102\1\77\1\103\3\uffff"+
			"\2\103\1\uffff\1\66\1\103\1\67\1\70\3\uffff\1\102\10\uffff\1\31\1\46"+
			"\2\uffff\1\44\2\uffff\1\31\7\uffff\1\31\3\uffff\1\31\1\uffff\1\31\6\uffff"+
			"\1\31\3\uffff\1\31",
			"\1\31\41\uffff\1\31\160\uffff\1\31\1\uffff\1\31\1\uffff\1\104",
			"\1\42\41\uffff\1\42\157\uffff\1\105\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\106\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\157\uffff\1\107\1\42\1\uffff\1\42\1\uffff\1\41",
			"\1\42\41\uffff\1\42\160\uffff\1\42\1\uffff\1\42\1\uffff\1\41",
			"",
			"\1\110\4\uffff\2\112\4\uffff\1\112\1\uffff\1\113\3\uffff\1\114\1\115"+
			"\1\116\1\uffff\1\112\1\42\1\112\1\uffff\2\112\1\137\1\117\1\uffff\1\112"+
			"\1\135\1\120\3\uffff\1\42\1\121\3\uffff\3\112\1\122\1\uffff\1\112\1\uffff"+
			"\2\112\4\uffff\1\123\1\uffff\2\112\1\uffff\1\124\2\uffff\2\42\1\112\1"+
			"\uffff\3\112\1\uffff\3\112\5\uffff\1\112\1\uffff\1\112\4\uffff\1\112"+
			"\2\uffff\5\112\3\uffff\1\112\1\uffff\2\112\2\uffff\1\112\1\125\4\112"+
			"\1\126\1\136\1\127\1\134\1\130\1\uffff\1\40\1\112\1\uffff\1\42\2\112"+
			"\3\uffff\2\112\1\uffff\1\131\1\112\1\132\1\133\3\uffff\1\42\11\uffff"+
			"\1\111",
			"",
			"\1\40\7\uffff\1\40\3\uffff\1\40\1\uffff\2\40\3\uffff\2\40\4\uffff\1"+
			"\40\1\uffff\1\40\3\uffff\3\40\1\uffff\3\40\1\uffff\4\40\1\uffff\3\40"+
			"\3\uffff\2\40\3\uffff\4\40\1\uffff\1\40\1\uffff\2\40\4\uffff\4\40\1\uffff"+
			"\1\40\2\uffff\3\40\1\uffff\3\40\1\uffff\3\40\4\uffff\2\40\1\uffff\1\40"+
			"\1\uffff\1\40\2\uffff\1\40\2\uffff\5\40\3\uffff\1\40\1\uffff\2\40\2\uffff"+
			"\13\40\1\uffff\2\40\1\uffff\3\40\3\uffff\2\40\1\uffff\4\40\3\uffff\1"+
			"\40\10\uffff\2\40\2\uffff\1\40\2\uffff\1\40\7\uffff\2\40\2\uffff\1\40"+
			"\1\uffff\1\40\6\uffff\1\40\1\140\2\uffff\1\40",
			"\1\141\1\uffff\1\31",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142\2\uffff\1\100",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\31\4\uffff\1\142",
			"\1\100\3\uffff\1\142",
			"\1\31\1\100\3\uffff\1\142\2\uffff\1\100",
			"\1\31\1\100\3\uffff\1\142\2\uffff\1\100",
			"",
			"\1\31\1\100\3\uffff\1\142\2\uffff\1\100",
			"\1\142",
			"\1\31\1\100\3\uffff\1\142",
			"\1\143\4\uffff\2\145\4\uffff\1\145\1\uffff\1\146\3\uffff\1\147\1\150"+
			"\1\151\1\uffff\1\145\1\31\1\145\1\uffff\2\145\1\172\1\152\1\uffff\1\145"+
			"\1\170\1\153\3\uffff\1\31\1\154\3\uffff\3\145\1\155\1\uffff\1\145\1\uffff"+
			"\2\145\4\uffff\1\156\1\uffff\2\145\1\uffff\1\157\2\uffff\2\31\1\145\1"+
			"\uffff\3\145\1\uffff\3\145\5\uffff\1\145\1\uffff\1\145\4\uffff\1\145"+
			"\2\uffff\5\145\3\uffff\1\145\1\uffff\2\145\2\uffff\1\145\1\160\4\145"+
			"\1\161\1\171\1\162\1\167\1\163\1\uffff\1\40\1\145\1\uffff\1\31\2\145"+
			"\3\uffff\2\145\1\uffff\1\164\1\145\1\165\1\166\3\uffff\1\31\11\uffff"+
			"\1\144",
			"",
			"",
			"",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"\1\42\41\uffff\1\42\157\uffff\1\40\1\42\1\uffff\1\42\1\uffff\1\42",
			"",
			"\1\100\7\uffff\1\100\3\uffff\1\100\2\uffff\1\100\11\uffff\1\31\41\uffff"+
			"\1\31\11\uffff\1\100\25\uffff\1\100\4\uffff\1\100\73\uffff\1\100\3\uffff"+
			"\1\100\2\uffff\1\100\7\uffff\1\100\1\31\1\uffff\1\31\1\100\1\31\1\100"+
			"\6\uffff\1\100\3\uffff\1\100",
			"\1\173\4\uffff\2\175\4\uffff\1\175\1\uffff\1\31\3\uffff\3\31\1\uffff"+
			"\1\175\1\uffff\1\175\1\uffff\2\175\2\31\1\uffff\1\175\2\31\4\uffff\1"+
			"\31\3\uffff\3\175\1\31\1\uffff\1\175\1\uffff\2\175\4\uffff\1\31\1\uffff"+
			"\2\175\1\uffff\1\31\3\uffff\1\100\1\175\1\uffff\3\175\1\uffff\3\175\5"+
			"\uffff\1\175\1\uffff\1\175\4\uffff\1\175\2\uffff\5\175\3\uffff\1\175"+
			"\1\uffff\2\175\2\uffff\1\175\1\31\4\175\5\31\1\uffff\1\31\1\175\2\uffff"+
			"\2\175\3\uffff\2\175\1\uffff\1\31\1\175\2\31\15\uffff\1\174",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\41\uffff\1\31\157\uffff\1\40\1\31\1\uffff\1\31\1\uffff\1\31",
			"\1\31\1\100",
			"\1\31\1\100",
			"\1\31\1\100"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "289:8: (c= cident |v= value | '(' ct= comparatorType ')' v= value | K_COUNT '(' '\\*' ')' | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | K_CAST '(' sn= unaliasedSelector K_AS t= native_type ')' |f= functionName args= selectionFunctionArgs )";
		}
	}

	static final String DFA40_eotS =
		"\34\uffff";
	static final String DFA40_eofS =
		"\34\uffff";
	static final String DFA40_minS =
		"\1\24\30\101\3\uffff";
	static final String DFA40_maxS =
		"\1\u00a3\30\u00be\3\uffff";
	static final String DFA40_acceptS =
		"\31\uffff\1\1\1\2\1\3";
	static final String DFA40_specialS =
		"\34\uffff}>";
	static final String[] DFA40_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\30"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\2\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff\1\3"+
			"\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\11\uffff\1\2",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"\1\31\162\uffff\1\31\1\uffff\1\33\7\uffff\1\32",
			"",
			"",
			""
	};

	static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
	static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
	static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
	static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
	static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
	static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
	static final short[][] DFA40_transition;

	static {
		int numStates = DFA40_transitionS.length;
		DFA40_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
		}
	}

	protected class DFA40 extends DFA {

		public DFA40(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 40;
			this.eot = DFA40_eot;
			this.eof = DFA40_eof;
			this.min = DFA40_min;
			this.max = DFA40_max;
			this.accept = DFA40_accept;
			this.special = DFA40_special;
			this.transition = DFA40_transition;
		}
		@Override
		public String getDescription() {
			return "455:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' |c= cident '.' field= fident );";
		}
	}

	static final String DFA148_eotS =
		"\34\uffff";
	static final String DFA148_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA148_minS =
		"\1\24\31\u00b6\2\uffff";
	static final String DFA148_maxS =
		"\1\u00a3\31\u00b8\2\uffff";
	static final String DFA148_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA148_specialS =
		"\34\uffff}>";
	static final String[] DFA148_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\30"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\2\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff\1\3"+
			"\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\10\uffff\1\31\1\2",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"\1\32\1\uffff\1\33",
			"",
			""
	};

	static final short[] DFA148_eot = DFA.unpackEncodedString(DFA148_eotS);
	static final short[] DFA148_eof = DFA.unpackEncodedString(DFA148_eofS);
	static final char[] DFA148_min = DFA.unpackEncodedStringToUnsignedChars(DFA148_minS);
	static final char[] DFA148_max = DFA.unpackEncodedStringToUnsignedChars(DFA148_maxS);
	static final short[] DFA148_accept = DFA.unpackEncodedString(DFA148_acceptS);
	static final short[] DFA148_special = DFA.unpackEncodedString(DFA148_specialS);
	static final short[][] DFA148_transition;

	static {
		int numStates = DFA148_transitionS.length;
		DFA148_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA148_transition[i] = DFA.unpackEncodedString(DFA148_transitionS[i]);
		}
	}

	protected class DFA148 extends DFA {

		public DFA148(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 148;
			this.eot = DFA148_eot;
			this.eof = DFA148_eof;
			this.min = DFA148_min;
			this.max = DFA148_max;
			this.accept = DFA148_accept;
			this.special = DFA148_special;
			this.transition = DFA148_transition;
		}
		@Override
		public String getDescription() {
			return "1181:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA149_eotS =
		"\34\uffff";
	static final String DFA149_eofS =
		"\1\uffff\31\33\2\uffff";
	static final String DFA149_minS =
		"\1\24\31\30\2\uffff";
	static final String DFA149_maxS =
		"\1\u00a3\31\u00b8\2\uffff";
	static final String DFA149_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA149_specialS =
		"\34\uffff}>";
	static final String[] DFA149_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\30"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\2\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff\1\3"+
			"\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\10\uffff\1\31\1\2",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"\1\33\2\uffff\2\33\2\uffff\1\33\32\uffff\1\33\6\uffff\1\33\20\uffff"+
			"\1\33\6\uffff\1\33\11\uffff\1\33\3\uffff\1\33\3\uffff\1\33\2\uffff\1"+
			"\33\2\uffff\2\33\6\uffff\1\33\13\uffff\1\33\13\uffff\1\33\5\uffff\2\33"+
			"\30\uffff\1\33\4\uffff\1\32\1\uffff\1\33",
			"",
			""
	};

	static final short[] DFA149_eot = DFA.unpackEncodedString(DFA149_eotS);
	static final short[] DFA149_eof = DFA.unpackEncodedString(DFA149_eofS);
	static final char[] DFA149_min = DFA.unpackEncodedStringToUnsignedChars(DFA149_minS);
	static final char[] DFA149_max = DFA.unpackEncodedStringToUnsignedChars(DFA149_maxS);
	static final short[] DFA149_accept = DFA.unpackEncodedString(DFA149_acceptS);
	static final short[] DFA149_special = DFA.unpackEncodedString(DFA149_specialS);
	static final short[][] DFA149_transition;

	static {
		int numStates = DFA149_transitionS.length;
		DFA149_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA149_transition[i] = DFA.unpackEncodedString(DFA149_transitionS[i]);
		}
	}

	protected class DFA149 extends DFA {

		public DFA149(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 149;
			this.eot = DFA149_eot;
			this.eof = DFA149_eof;
			this.min = DFA149_min;
			this.max = DFA149_max;
			this.accept = DFA149_accept;
			this.special = DFA149_special;
			this.transition = DFA149_transition;
		}
		@Override
		public String getDescription() {
			return "1186:7: ( ksName[name] '.' )?";
		}
	}

	static final String DFA167_eotS =
		"\42\uffff";
	static final String DFA167_eofS =
		"\42\uffff";
	static final String DFA167_minS =
		"\1\6\2\uffff\1\6\4\uffff\30\u00b1\1\u00b6\1\uffff";
	static final String DFA167_maxS =
		"\1\u00c2\2\uffff\1\u00c3\4\uffff\31\u00b7\1\uffff";
	static final String DFA167_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\31\uffff\1\3";
	static final String DFA167_specialS =
		"\42\uffff}>";
	static final String[] DFA167_transitionS = {
			"\1\1\7\uffff\1\1\3\uffff\1\1\2\uffff\1\1\65\uffff\1\1\25\uffff\1\1\4"+
			"\uffff\1\5\73\uffff\1\7\3\uffff\1\1\2\uffff\1\1\7\uffff\1\4\3\uffff\1"+
			"\1\1\uffff\1\6\6\uffff\1\2\3\uffff\1\3",
			"",
			"",
			"\1\2\7\uffff\1\2\3\uffff\1\2\1\uffff\1\10\1\2\3\uffff\2\12\4\uffff\1"+
			"\12\1\uffff\1\13\3\uffff\1\14\1\15\1\16\1\uffff\1\12\1\40\1\12\1\uffff"+
			"\2\12\1\37\1\17\1\uffff\1\12\1\35\1\20\3\uffff\1\40\1\21\3\uffff\3\12"+
			"\1\22\1\uffff\1\12\1\uffff\2\12\4\uffff\1\23\1\2\2\12\1\uffff\1\24\2"+
			"\uffff\2\40\1\12\1\uffff\3\12\1\uffff\3\12\4\uffff\1\2\1\12\1\uffff\1"+
			"\12\1\uffff\1\2\2\uffff\1\12\2\uffff\5\12\3\uffff\1\12\1\uffff\2\12\2"+
			"\uffff\1\12\1\25\4\12\1\26\1\36\1\27\1\34\1\30\1\uffff\1\2\1\12\1\uffff"+
			"\1\40\2\12\3\uffff\2\12\1\uffff\1\31\1\12\1\32\1\33\3\uffff\1\40\10\uffff"+
			"\1\2\1\11\2\uffff\1\2\2\uffff\1\2\7\uffff\1\2\3\uffff\1\2\1\uffff\1\2"+
			"\6\uffff\1\2\3\uffff\2\2",
			"",
			"",
			"",
			"",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\4\uffff\1\2\1\41",
			"\1\2\1\41",
			""
	};

	static final short[] DFA167_eot = DFA.unpackEncodedString(DFA167_eotS);
	static final short[] DFA167_eof = DFA.unpackEncodedString(DFA167_eofS);
	static final char[] DFA167_min = DFA.unpackEncodedStringToUnsignedChars(DFA167_minS);
	static final char[] DFA167_max = DFA.unpackEncodedStringToUnsignedChars(DFA167_maxS);
	static final short[] DFA167_accept = DFA.unpackEncodedString(DFA167_acceptS);
	static final short[] DFA167_special = DFA.unpackEncodedString(DFA167_specialS);
	static final short[][] DFA167_transition;

	static {
		int numStates = DFA167_transitionS.length;
		DFA167_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA167_transition[i] = DFA.unpackEncodedString(DFA167_transitionS[i]);
		}
	}

	protected class DFA167 extends DFA {

		public DFA167(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 167;
			this.eot = DFA167_eot;
			this.eof = DFA167_eof;
			this.min = DFA167_min;
			this.max = DFA167_max;
			this.accept = DFA167_accept;
			this.special = DFA167_special;
			this.transition = DFA167_transition;
		}
		@Override
		public String getDescription() {
			return "1275:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= noncol_ident | QMARK );";
		}
	}

	static final String DFA169_eotS =
		"\33\uffff";
	static final String DFA169_eofS =
		"\1\uffff\30\32\2\uffff";
	static final String DFA169_minS =
		"\1\24\30\u00b1\2\uffff";
	static final String DFA169_maxS =
		"\1\u00a3\30\u00b8\2\uffff";
	static final String DFA169_acceptS =
		"\31\uffff\1\1\1\2";
	static final String DFA169_specialS =
		"\33\uffff}>";
	static final String[] DFA169_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\31\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\31"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\2\31\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff\1\3"+
			"\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\1\uffff\1\32\1\3\1\uffff\1\31"+
			"\2\3\3\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\31\10\uffff\1\31"+
			"\1\2",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"\1\32\4\uffff\1\31\1\uffff\1\32",
			"",
			""
	};

	static final short[] DFA169_eot = DFA.unpackEncodedString(DFA169_eotS);
	static final short[] DFA169_eof = DFA.unpackEncodedString(DFA169_eofS);
	static final char[] DFA169_min = DFA.unpackEncodedStringToUnsignedChars(DFA169_minS);
	static final char[] DFA169_max = DFA.unpackEncodedStringToUnsignedChars(DFA169_maxS);
	static final short[] DFA169_accept = DFA.unpackEncodedString(DFA169_acceptS);
	static final short[] DFA169_special = DFA.unpackEncodedString(DFA169_specialS);
	static final short[][] DFA169_transition;

	static {
		int numStates = DFA169_transitionS.length;
		DFA169_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA169_transition[i] = DFA.unpackEncodedString(DFA169_transitionS[i]);
		}
	}

	protected class DFA169 extends DFA {

		public DFA169(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 169;
			this.eot = DFA169_eot;
			this.eof = DFA169_eof;
			this.min = DFA169_min;
			this.max = DFA169_max;
			this.accept = DFA169_accept;
			this.special = DFA169_special;
			this.transition = DFA169_transition;
		}
		@Override
		public String getDescription() {
			return "1293:7: (ks= keyspaceName '.' )?";
		}
	}

	static final String DFA171_eotS =
		"\70\uffff";
	static final String DFA171_eofS =
		"\70\uffff";
	static final String DFA171_minS =
		"\1\24\30\u00b1\1\u00b6\1\u00b1\1\u00b6\1\24\1\6\30\u00b1\2\uffff";
	static final String DFA171_maxS =
		"\1\u00a3\31\u00b6\1\u00b1\1\u00b6\1\u00a3\1\u00c2\30\u00b1\2\uffff";
	static final String DFA171_acceptS =
		"\66\uffff\1\1\1\2";
	static final String DFA171_specialS =
		"\70\uffff}>";
	static final String[] DFA171_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\33\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\33"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\2\33\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff\1\3"+
			"\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\1\uffff\1\32\1\3\1\uffff\1\33"+
			"\2\3\3\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\33\10\uffff\1\31"+
			"\1\2",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\35\4\uffff\1\34",
			"\1\34",
			"\1\35",
			"\1\34",
			"\1\36\4\uffff\2\40\4\uffff\1\40\1\uffff\1\41\3\uffff\1\42\1\43\1\44"+
			"\1\uffff\1\40\1\uffff\1\40\1\uffff\2\40\1\65\1\45\1\uffff\1\40\1\63\1"+
			"\46\4\uffff\1\47\3\uffff\3\40\1\50\1\uffff\1\40\1\uffff\2\40\4\uffff"+
			"\1\51\1\uffff\2\40\1\uffff\1\52\4\uffff\1\40\1\uffff\3\40\1\uffff\3\40"+
			"\5\uffff\1\40\1\uffff\1\40\4\uffff\1\40\2\uffff\5\40\3\uffff\1\40\1\uffff"+
			"\2\40\2\uffff\1\40\1\53\4\40\1\54\1\64\1\55\1\62\1\56\1\uffff\1\32\1"+
			"\40\2\uffff\2\40\3\uffff\2\40\1\uffff\1\57\1\40\1\60\1\61\15\uffff\1"+
			"\37",
			"\1\67\7\uffff\1\67\3\uffff\1\67\1\uffff\2\67\3\uffff\2\67\4\uffff\1"+
			"\67\1\uffff\1\67\3\uffff\3\67\1\uffff\3\67\1\uffff\4\67\1\uffff\3\67"+
			"\3\uffff\2\67\3\uffff\4\67\1\uffff\1\67\1\uffff\2\67\4\uffff\4\67\1\uffff"+
			"\1\67\2\uffff\3\67\1\uffff\3\67\1\uffff\3\67\4\uffff\2\67\1\uffff\1\67"+
			"\1\uffff\1\67\2\uffff\1\67\2\uffff\5\67\3\uffff\1\67\1\uffff\2\67\2\uffff"+
			"\13\67\1\uffff\2\67\1\uffff\3\67\3\uffff\2\67\1\uffff\4\67\3\uffff\1"+
			"\67\10\uffff\2\67\2\uffff\1\67\2\uffff\1\67\7\uffff\1\67\1\66\2\uffff"+
			"\1\67\1\uffff\1\67\6\uffff\1\67\3\uffff\1\67",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"\1\35",
			"",
			""
	};

	static final short[] DFA171_eot = DFA.unpackEncodedString(DFA171_eotS);
	static final short[] DFA171_eof = DFA.unpackEncodedString(DFA171_eofS);
	static final char[] DFA171_min = DFA.unpackEncodedStringToUnsignedChars(DFA171_minS);
	static final char[] DFA171_max = DFA.unpackEncodedStringToUnsignedChars(DFA171_maxS);
	static final short[] DFA171_accept = DFA.unpackEncodedString(DFA171_acceptS);
	static final short[] DFA171_special = DFA.unpackEncodedString(DFA171_specialS);
	static final short[][] DFA171_transition;

	static {
		int numStates = DFA171_transitionS.length;
		DFA171_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA171_transition[i] = DFA.unpackEncodedString(DFA171_transitionS[i]);
		}
	}

	protected class DFA171 extends DFA {

		public DFA171(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 171;
			this.eot = DFA171_eot;
			this.eof = DFA171_eof;
			this.min = DFA171_min;
			this.max = DFA171_max;
			this.accept = DFA171_accept;
			this.special = DFA171_special;
			this.transition = DFA171_transition;
		}
		@Override
		public String getDescription() {
			return "1304:1: function returns [Term.Raw t] : (f= functionName '(' ')' |f= functionName '(' args= functionArgs ')' );";
		}
	}

	static final String DFA173_eotS =
		"\105\uffff";
	static final String DFA173_eofS =
		"\3\uffff\1\1\41\uffff\1\1\6\uffff\31\41";
	static final String DFA173_minS =
		"\1\6\1\uffff\1\6\1\33\1\uffff\1\u00b2\30\u00b1\1\u00b2\2\u00b1\1\uffff"+
		"\1\u00b1\1\u00b6\1\u00b1\1\6\1\24\1\6\1\154\3\u00b1\31\33";
	static final String DFA173_maxS =
		"\1\u00c2\1\uffff\1\u00c2\1\u00c3\1\uffff\1\u00b4\2\u00b6\1\u00b9\26\u00b6"+
		"\2\u00b9\1\uffff\1\u00b9\2\u00b6\1\u00c3\1\u00a3\1\u00c2\1\u00b6\3\u00b2"+
		"\31\u00c3";
	static final String DFA173_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\34\uffff\1\3\43\uffff";
	static final String DFA173_specialS =
		"\105\uffff}>";
	static final String[] DFA173_transitionS = {
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\4\1\1\3\uffff\2\4\4\uffff\1\4"+
			"\1\uffff\1\4\3\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff\3\4\3\uffff"+
			"\2\4\3\uffff\4\4\1\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\1\2\4\1\uffff"+
			"\1\4\2\uffff\3\4\1\uffff\3\4\1\uffff\3\4\4\uffff\1\1\1\4\1\uffff\1\4"+
			"\1\uffff\1\1\2\uffff\1\4\2\uffff\5\4\3\uffff\1\4\1\uffff\2\4\2\uffff"+
			"\13\4\1\uffff\2\4\1\uffff\3\4\3\uffff\2\4\1\uffff\4\4\3\uffff\1\4\10"+
			"\uffff\1\3\1\4\2\uffff\1\1\2\uffff\1\1\7\uffff\1\2\3\uffff\1\1\1\uffff"+
			"\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\6\1\1\3\uffff\2\44\4\uffff\1"+
			"\44\1\uffff\1\11\3\uffff\1\12\1\13\1\14\1\uffff\1\44\1\43\1\44\1\uffff"+
			"\2\44\1\35\1\15\1\uffff\1\44\1\33\1\16\3\uffff\1\43\1\17\3\uffff\3\44"+
			"\1\20\1\uffff\1\42\1\uffff\2\44\4\uffff\1\21\1\1\2\44\1\uffff\1\22\2"+
			"\uffff\1\43\1\36\1\44\1\uffff\3\44\1\uffff\1\37\1\44\1\10\4\uffff\1\1"+
			"\1\44\1\uffff\1\44\1\uffff\1\1\2\uffff\1\44\2\uffff\5\44\3\uffff\1\44"+
			"\1\uffff\2\44\1\uffff\1\41\1\44\1\23\4\44\1\24\1\34\1\25\1\32\1\26\1"+
			"\uffff\1\1\1\44\1\uffff\1\43\1\40\1\44\3\uffff\2\44\1\uffff\1\27\1\44"+
			"\1\30\1\31\3\uffff\1\43\10\uffff\1\1\1\7\2\uffff\1\5\2\uffff\1\1\7\uffff"+
			"\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"\1\1\1\uffff\2\1\26\uffff\1\1\21\uffff\1\1\6\uffff\1\1\12\uffff\1\1"+
			"\21\uffff\1\1\2\uffff\1\1\2\uffff\1\1\33\uffff\1\1\11\uffff\1\1\32\uffff"+
			"\3\1\1\uffff\1\4\2\1\7\uffff\1\1\2\uffff\1\1",
			"",
			"\1\45\1\uffff\1\1",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\1\4\uffff\1\46",
			"\1\41\3\uffff\1\46",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"",
			"\1\1\1\41\3\uffff\1\46\2\uffff\1\41",
			"\1\46",
			"\1\1\1\41\3\uffff\1\46",
			"\1\41\7\uffff\1\41\3\uffff\1\41\1\uffff\2\41\3\uffff\2\41\1\1\1\uffff"+
			"\2\1\1\41\1\uffff\1\41\3\uffff\3\41\1\uffff\3\41\1\uffff\4\41\1\uffff"+
			"\3\41\1\1\2\uffff\2\41\3\uffff\4\41\1\uffff\1\41\1\uffff\2\41\1\uffff"+
			"\1\1\2\uffff\4\41\1\1\1\41\2\uffff\3\41\1\uffff\3\41\1\1\3\41\4\uffff"+
			"\2\41\1\uffff\1\41\1\uffff\1\41\2\uffff\1\41\1\uffff\1\1\2\41\1\50\2"+
			"\41\1\1\2\uffff\1\41\1\uffff\2\41\2\uffff\13\41\1\uffff\2\41\1\uffff"+
			"\3\41\1\uffff\1\1\1\uffff\2\41\1\uffff\4\41\1\uffff\1\1\1\uffff\1\41"+
			"\10\uffff\2\41\2\uffff\1\41\2\uffff\1\41\7\uffff\1\41\3\1\1\41\1\uffff"+
			"\1\47\1\1\5\uffff\1\41\1\uffff\1\1\1\uffff\1\41\1\1",
			"\1\51\4\uffff\2\53\4\uffff\1\53\1\uffff\1\1\3\uffff\3\1\1\uffff\1\53"+
			"\1\uffff\1\53\1\uffff\2\53\2\1\1\uffff\1\53\2\1\4\uffff\1\1\3\uffff\3"+
			"\53\1\1\1\uffff\1\53\1\uffff\2\53\4\uffff\1\1\1\uffff\2\53\1\uffff\1"+
			"\1\3\uffff\1\41\1\53\1\uffff\3\53\1\uffff\3\53\5\uffff\1\53\1\uffff\1"+
			"\53\4\uffff\1\53\2\uffff\5\53\3\uffff\1\53\1\uffff\2\53\2\uffff\1\53"+
			"\1\1\4\53\5\1\1\uffff\1\1\1\53\2\uffff\2\53\3\uffff\2\53\1\uffff\1\1"+
			"\1\53\2\1\15\uffff\1\52",
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\54\1\1\3\uffff\2\56\4\uffff\1"+
			"\56\1\uffff\1\57\3\uffff\1\60\1\61\1\62\1\uffff\1\56\1\104\1\56\1\uffff"+
			"\2\56\1\103\1\63\1\uffff\1\56\1\101\1\64\3\uffff\1\104\1\65\3\uffff\3"+
			"\56\1\66\1\uffff\1\56\1\uffff\2\56\4\uffff\1\67\1\1\2\56\1\uffff\1\70"+
			"\2\uffff\2\104\1\56\1\uffff\3\56\1\uffff\3\56\4\uffff\1\1\1\56\1\uffff"+
			"\1\56\1\uffff\1\1\2\uffff\1\56\2\uffff\5\56\3\uffff\1\56\1\uffff\2\56"+
			"\2\uffff\1\56\1\71\4\56\1\72\1\102\1\73\1\100\1\74\1\uffff\1\1\1\56\1"+
			"\uffff\1\104\2\56\3\uffff\2\56\1\uffff\1\75\1\56\1\76\1\77\3\uffff\1"+
			"\104\10\uffff\1\1\1\55\2\uffff\1\1\2\uffff\1\1\7\uffff\1\1\3\uffff\1"+
			"\1\1\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"\1\1\104\uffff\1\41\4\uffff\1\41",
			"\1\1\1\41",
			"\1\1\1\41",
			"\1\1\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\31\uffff\1\1\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41",
			"\1\41\1\uffff\2\41\26\uffff\1\41\21\uffff\1\41\6\uffff\1\41\12\uffff"+
			"\1\41\21\uffff\1\41\2\uffff\1\41\2\uffff\1\41\33\uffff\1\41\11\uffff"+
			"\1\41\32\uffff\3\41\1\uffff\1\1\2\41\7\uffff\1\41\2\uffff\1\41"
	};

	static final short[] DFA173_eot = DFA.unpackEncodedString(DFA173_eotS);
	static final short[] DFA173_eof = DFA.unpackEncodedString(DFA173_eofS);
	static final char[] DFA173_min = DFA.unpackEncodedStringToUnsignedChars(DFA173_minS);
	static final char[] DFA173_max = DFA.unpackEncodedStringToUnsignedChars(DFA173_maxS);
	static final short[] DFA173_accept = DFA.unpackEncodedString(DFA173_acceptS);
	static final short[] DFA173_special = DFA.unpackEncodedString(DFA173_specialS);
	static final short[][] DFA173_transition;

	static {
		int numStates = DFA173_transitionS.length;
		DFA173_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA173_transition[i] = DFA.unpackEncodedString(DFA173_transitionS[i]);
		}
	}

	protected class DFA173 extends DFA {

		public DFA173(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 173;
			this.eot = DFA173_eot;
			this.eof = DFA173_eof;
			this.min = DFA173_min;
			this.max = DFA173_max;
			this.accept = DFA173_accept;
			this.special = DFA173_special;
			this.transition = DFA173_transition;
		}
		@Override
		public String getDescription() {
			return "1314:1: term returns [Term.Raw term] : (v= value |f= function | '(' c= comparatorType ')' t= term );";
		}
	}

	static final String DFA176_eotS =
		"\35\uffff";
	static final String DFA176_eofS =
		"\35\uffff";
	static final String DFA176_minS =
		"\1\6\1\uffff\31\25\2\uffff";
	static final String DFA176_maxS =
		"\1\u00c2\1\uffff\31\u00b6\2\uffff";
	static final String DFA176_acceptS =
		"\1\uffff\1\1\31\uffff\1\2\1\3";
	static final String DFA176_specialS =
		"\35\uffff}>";
	static final String[] DFA176_transitionS = {
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\2\1\1\3\uffff\2\4\4\uffff\1\4"+
			"\1\uffff\1\5\3\uffff\1\6\1\7\1\10\1\uffff\1\4\1\32\1\4\1\uffff\2\4\1"+
			"\31\1\11\1\uffff\1\4\1\27\1\12\3\uffff\1\32\1\13\3\uffff\3\4\1\14\1\uffff"+
			"\1\4\1\uffff\2\4\4\uffff\1\15\1\1\2\4\1\uffff\1\16\2\uffff\2\32\1\4\1"+
			"\uffff\3\4\1\uffff\3\4\4\uffff\1\1\1\4\1\uffff\1\4\1\uffff\1\1\2\uffff"+
			"\1\4\2\uffff\5\4\3\uffff\1\4\1\uffff\2\4\2\uffff\1\4\1\17\4\4\1\20\1"+
			"\30\1\21\1\26\1\22\1\uffff\1\1\1\4\1\uffff\1\32\2\4\3\uffff\2\4\1\uffff"+
			"\1\23\1\4\1\24\1\25\3\uffff\1\32\10\uffff\1\1\1\3\2\uffff\1\1\2\uffff"+
			"\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\3\uffff\1\1",
			"",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009b\uffff\1\1\1\uffff\1\33\1\uffff\1\33\1\1",
			"\1\34\u009d\uffff\1\33\1\uffff\1\33\1\1",
			"",
			""
	};

	static final short[] DFA176_eot = DFA.unpackEncodedString(DFA176_eotS);
	static final short[] DFA176_eof = DFA.unpackEncodedString(DFA176_eofS);
	static final char[] DFA176_min = DFA.unpackEncodedStringToUnsignedChars(DFA176_minS);
	static final char[] DFA176_max = DFA.unpackEncodedStringToUnsignedChars(DFA176_maxS);
	static final short[] DFA176_accept = DFA.unpackEncodedString(DFA176_acceptS);
	static final short[] DFA176_special = DFA.unpackEncodedString(DFA176_specialS);
	static final short[][] DFA176_transition;

	static {
		int numStates = DFA176_transitionS.length;
		DFA176_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA176_transition[i] = DFA.unpackEncodedString(DFA176_transitionS[i]);
		}
	}

	protected class DFA176 extends DFA {

		public DFA176(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 176;
			this.eot = DFA176_eot;
			this.eof = DFA176_eof;
			this.min = DFA176_min;
			this.max = DFA176_max;
			this.accept = DFA176_accept;
			this.special = DFA176_special;
			this.transition = DFA176_transition;
		}
		@Override
		public String getDescription() {
			return "1330:1: normalColumnOperation[List<Pair<ColumnDefinition.Raw, Operation.RawUpdate>> operations, ColumnDefinition.Raw key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );";
		}
	}

	static final String DFA184_eotS =
		"\34\uffff";
	static final String DFA184_eofS =
		"\34\uffff";
	static final String DFA184_minS =
		"\1\24\30\u00bb\1\6\2\uffff";
	static final String DFA184_maxS =
		"\1\u00a3\30\u00bb\1\u00c2\2\uffff";
	static final String DFA184_acceptS =
		"\32\uffff\1\1\1\2";
	static final String DFA184_specialS =
		"\34\uffff}>";
	static final String[] DFA184_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\30"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\2\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff\1\3"+
			"\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\2\uffff\1\3\1\uffff\1\30\2\3\3"+
			"\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\11\uffff\1\2",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\31",
			"\1\32\7\uffff\1\32\3\uffff\1\32\2\uffff\1\32\3\uffff\2\32\4\uffff\1"+
			"\32\1\uffff\1\32\3\uffff\3\32\1\uffff\3\32\1\uffff\4\32\1\uffff\3\32"+
			"\3\uffff\2\32\3\uffff\4\32\1\uffff\1\32\1\uffff\2\32\4\uffff\4\32\1\uffff"+
			"\1\32\2\uffff\3\32\1\uffff\3\32\1\uffff\3\32\4\uffff\2\32\1\uffff\1\32"+
			"\4\uffff\1\32\2\uffff\5\32\3\uffff\1\32\1\uffff\2\32\2\uffff\13\32\2"+
			"\uffff\1\32\1\uffff\3\32\3\uffff\2\32\1\uffff\4\32\3\uffff\1\32\14\uffff"+
			"\1\32\2\uffff\1\32\13\uffff\1\32\14\uffff\1\33",
			"",
			""
	};

	static final short[] DFA184_eot = DFA.unpackEncodedString(DFA184_eotS);
	static final short[] DFA184_eof = DFA.unpackEncodedString(DFA184_eofS);
	static final char[] DFA184_min = DFA.unpackEncodedStringToUnsignedChars(DFA184_minS);
	static final char[] DFA184_max = DFA.unpackEncodedStringToUnsignedChars(DFA184_maxS);
	static final short[] DFA184_accept = DFA.unpackEncodedString(DFA184_acceptS);
	static final short[] DFA184_special = DFA.unpackEncodedString(DFA184_specialS);
	static final short[][] DFA184_transition;

	static {
		int numStates = DFA184_transitionS.length;
		DFA184_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA184_transition[i] = DFA.unpackEncodedString(DFA184_transitionS[i]);
		}
	}

	protected class DFA184 extends DFA {

		public DFA184(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 184;
			this.eot = DFA184_eot;
			this.eof = DFA184_eof;
			this.min = DFA184_min;
			this.max = DFA184_max;
			this.accept = DFA184_accept;
			this.special = DFA184_special;
			this.transition = DFA184_transition;
		}
		@Override
		public String getDescription() {
			return "1403:1: property[PropertyDefinitions props] : (k= noncol_ident '=' simple= propertyValue |k= noncol_ident '=' map= mapLiteral );";
		}
	}

	static final String DFA190_eotS =
		"\75\uffff";
	static final String DFA190_eofS =
		"\75\uffff";
	static final String DFA190_minS =
		"\1\24\30\56\1\uffff\1\24\3\uffff\1\u00a2\2\uffff\30\56\4\uffff";
	static final String DFA190_maxS =
		"\1\u00b1\30\u00be\1\uffff\1\u00b1\3\uffff\1\u00b7\2\uffff\30\u00be\4\uffff";
	static final String DFA190_acceptS =
		"\31\uffff\1\4\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\30\uffff\1\12\1\5\1"+
		"\6\1\11";
	static final String DFA190_specialS =
		"\75\uffff}>";
	static final String[] DFA190_transitionS = {
			"\1\1\4\uffff\2\3\4\uffff\1\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\uffff"+
			"\1\3\1\30\1\3\1\uffff\2\3\1\30\1\10\1\uffff\1\3\1\26\1\11\3\uffff\1\30"+
			"\1\12\3\uffff\3\3\1\13\1\uffff\1\3\1\uffff\2\3\4\uffff\1\14\1\uffff\2"+
			"\3\1\uffff\1\15\2\uffff\2\30\1\3\1\uffff\3\3\1\uffff\3\3\5\uffff\1\3"+
			"\1\uffff\1\3\4\uffff\1\3\2\uffff\5\3\3\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\16\4\3\1\17\1\27\1\20\1\25\1\21\1\uffff\1\31\1\3\1\uffff\1\30"+
			"\2\3\3\uffff\2\3\1\uffff\1\22\1\3\1\23\1\24\3\uffff\1\30\11\uffff\1\2"+
			"\15\uffff\1\32",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"\1\37\31\uffff\1\36\10\uffff\1\35\6\uffff\1\34\127\uffff\1\33\10\uffff"+
			"\5\33\1\40",
			"",
			"\1\41\4\uffff\2\43\4\uffff\1\43\1\uffff\1\44\3\uffff\1\45\1\46\1\47"+
			"\1\uffff\1\43\1\70\1\43\1\uffff\2\43\1\70\1\50\1\uffff\1\43\1\66\1\51"+
			"\3\uffff\1\70\1\52\3\uffff\3\43\1\53\1\uffff\1\43\1\uffff\2\43\4\uffff"+
			"\1\54\1\uffff\2\43\1\uffff\1\55\2\uffff\2\70\1\43\1\uffff\3\43\1\uffff"+
			"\3\43\5\uffff\1\43\1\uffff\1\43\4\uffff\1\43\2\uffff\5\43\3\uffff\1\43"+
			"\1\uffff\2\43\2\uffff\1\43\1\56\4\43\1\57\1\67\1\60\1\65\1\61\1\uffff"+
			"\1\71\1\43\1\uffff\1\70\2\43\3\uffff\2\43\1\uffff\1\62\1\43\1\63\1\64"+
			"\3\uffff\1\70\11\uffff\1\42\15\uffff\1\71",
			"",
			"",
			"",
			"\1\72\16\uffff\1\73\5\uffff\1\72",
			"",
			"",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"\1\71\31\uffff\1\71\10\uffff\1\71\6\uffff\1\71\127\uffff\1\71\1\uffff"+
			"\1\74\1\uffff\1\74\4\uffff\6\71",
			"",
			"",
			"",
			""
	};

	static final short[] DFA190_eot = DFA.unpackEncodedString(DFA190_eotS);
	static final short[] DFA190_eof = DFA.unpackEncodedString(DFA190_eofS);
	static final char[] DFA190_min = DFA.unpackEncodedStringToUnsignedChars(DFA190_minS);
	static final char[] DFA190_max = DFA.unpackEncodedStringToUnsignedChars(DFA190_maxS);
	static final short[] DFA190_accept = DFA.unpackEncodedString(DFA190_acceptS);
	static final short[] DFA190_special = DFA.unpackEncodedString(DFA190_specialS);
	static final short[][] DFA190_transition;

	static {
		int numStates = DFA190_transitionS.length;
		DFA190_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA190_transition[i] = DFA.unpackEncodedString(DFA190_transitionS[i]);
		}
	}

	protected class DFA190 extends DFA {

		public DFA190(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 190;
			this.eot = DFA190_eot;
			this.eof = DFA190_eof;
			this.min = DFA190_min;
			this.max = DFA190_max;
			this.accept = DFA190_accept;
			this.special = DFA190_special;
			this.transition = DFA190_transition;
		}
		@Override
		public String getDescription() {
			return "1422:1: relation[WhereClause.Builder clauses] : (name= cident type= relationType t= term |name= cident K_LIKE t= term |name= cident K_IS K_NOT K_NULL | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |name= cident '[' key= term ']' type= relationType t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
		}
	}

	static final String DFA189_eotS =
		"\12\uffff";
	static final String DFA189_eofS =
		"\12\uffff";
	static final String DFA189_minS =
		"\1\110\1\uffff\6\u00a2\2\uffff";
	static final String DFA189_maxS =
		"\1\u00bd\1\uffff\6\u00b7\2\uffff";
	static final String DFA189_acceptS =
		"\1\uffff\1\1\6\uffff\1\2\1\3";
	static final String DFA189_specialS =
		"\12\uffff}>";
	static final String[] DFA189_transitionS = {
			"\1\1\147\uffff\1\7\10\uffff\1\3\1\4\1\2\1\5\1\6",
			"",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"\1\11\16\uffff\1\10\5\uffff\1\11",
			"",
			""
	};

	static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
	static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
	static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
	static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
	static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
	static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
	static final short[][] DFA189_transition;

	static {
		int numStates = DFA189_transitionS.length;
		DFA189_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
		}
	}

	protected class DFA189 extends DFA {

		public DFA189(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 189;
			this.eot = DFA189_eot;
			this.eof = DFA189_eof;
			this.min = DFA189_min;
			this.max = DFA189_max;
			this.accept = DFA189_accept;
			this.special = DFA189_special;
			this.transition = DFA189_transition;
		}
		@Override
		public String getDescription() {
			return "1436:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )";
		}
	}

	static final String DFA199_eotS =
		"\37\uffff";
	static final String DFA199_eofS =
		"\1\uffff\24\34\2\31\1\uffff\1\31\1\uffff\1\31\4\uffff";
	static final String DFA199_minS =
		"\1\24\26\77\1\uffff\1\77\1\uffff\1\77\4\uffff";
	static final String DFA199_maxS =
		"\1\u00a6\26\u00bc\1\uffff\1\u00bc\1\uffff\1\u00bc\4\uffff";
	static final String DFA199_acceptS =
		"\27\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\1\1\3\1\5";
	static final String DFA199_specialS =
		"\37\uffff}>";
	static final String[] DFA199_transitionS = {
			"\1\31\4\uffff\2\31\4\uffff\1\31\1\uffff\1\1\3\uffff\1\2\1\3\1\4\1\uffff"+
			"\3\31\1\uffff\3\31\1\5\1\uffff\1\31\1\23\1\6\3\uffff\1\31\1\7\3\uffff"+
			"\3\31\1\10\1\uffff\1\32\1\uffff\2\31\4\uffff\1\11\1\uffff\2\31\1\uffff"+
			"\1\12\2\uffff\3\31\1\uffff\3\31\1\uffff\1\26\1\31\1\25\5\uffff\1\31\1"+
			"\uffff\1\31\4\uffff\1\31\2\uffff\5\31\3\uffff\1\31\1\uffff\2\31\1\uffff"+
			"\1\27\1\31\1\13\4\31\1\14\1\24\1\15\1\22\1\16\2\uffff\1\31\1\uffff\1"+
			"\31\1\30\1\31\3\uffff\2\31\1\uffff\1\17\1\31\1\20\1\21\3\uffff\1\31\11"+
			"\uffff\1\31\2\uffff\1\33",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\34\14\uffff\1\34\12\uffff\1\34\31\uffff\1\34\12\uffff\1\34\65\uffff"+
			"\1\34\1\uffff\1\34\1\uffff\1\31\1\uffff\1\34\3\uffff\1\34",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\27\2\uffff\1\31",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\27\2\uffff\1\31",
			"",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\35\2\uffff\1\31",
			"",
			"\1\31\14\uffff\1\31\12\uffff\1\31\31\uffff\1\31\12\uffff\1\31\65\uffff"+
			"\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\36\2\uffff\1\31",
			"",
			"",
			"",
			""
	};

	static final short[] DFA199_eot = DFA.unpackEncodedString(DFA199_eotS);
	static final short[] DFA199_eof = DFA.unpackEncodedString(DFA199_eofS);
	static final char[] DFA199_min = DFA.unpackEncodedStringToUnsignedChars(DFA199_minS);
	static final char[] DFA199_max = DFA.unpackEncodedStringToUnsignedChars(DFA199_maxS);
	static final short[] DFA199_accept = DFA.unpackEncodedString(DFA199_acceptS);
	static final short[] DFA199_special = DFA.unpackEncodedString(DFA199_specialS);
	static final short[][] DFA199_transition;

	static {
		int numStates = DFA199_transitionS.length;
		DFA199_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA199_transition[i] = DFA.unpackEncodedString(DFA199_transitionS[i]);
		}
	}

	protected class DFA199 extends DFA {

		public DFA199(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 199;
			this.eot = DFA199_eot;
			this.eof = DFA199_eof;
			this.min = DFA199_min;
			this.max = DFA199_max;
			this.accept = DFA199_accept;
			this.special = DFA199_special;
			this.transition = DFA199_transition;
		}
		@Override
		public String getDescription() {
			return "1493:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );";
		}
	}

	public static final BitSet FOLLOW_selectStatement_in_cqlStatement59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_cqlStatement88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_cqlStatement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_batchStatement_in_cqlStatement146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_cqlStatement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_cqlStatement205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_cqlStatement237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_cqlStatement285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantPermissionsStatement_in_cqlStatement448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokePermissionsStatement_in_cqlStatement466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createUserStatement_in_cqlStatement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createFunctionStatement_in_cqlStatement721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_cqlStatement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createAggregateStatement_in_cqlStatement763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropAggregateStatement_in_cqlStatement782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createRoleStatement_in_cqlStatement803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterRoleStatement_in_cqlStatement827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropRoleStatement_in_cqlStatement852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listRolesStatement_in_cqlStatement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantRoleStatement_in_cqlStatement903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokeRoleStatement_in_cqlStatement928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createMaterializedViewStatement_in_cqlStatement952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropMaterializedViewStatement_in_cqlStatement964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMaterializedViewStatement_in_cqlStatement978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_useStatement1004 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_useStatement1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SELECT_in_selectStatement1042 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0xC0A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_K_JSON_in_selectStatement1052 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0xC0A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_K_DISTINCT_in_selectStatement1069 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0xC0A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_selectClause_in_selectStatement1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_selectStatement1088 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_selectStatement1092 = new BitSet(new long[]{0x0000000008000002L,0x0000480002000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_selectStatement1102 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_selectStatement1106 = new BitSet(new long[]{0x0000000008000002L,0x0000480002000000L});
	public static final BitSet FOLLOW_K_ORDER_in_selectStatement1119 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1121 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1123 = new BitSet(new long[]{0x0000000008000002L,0x0000400002000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_selectStatement1128 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1130 = new BitSet(new long[]{0x0000000008000002L,0x0000400002000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_PER_in_selectStatement1147 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_K_PARTITION_in_selectStatement1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1151 = new BitSet(new long[]{0x0000000008200000L,0x0000000002000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1155 = new BitSet(new long[]{0x0000000008000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1170 = new BitSet(new long[]{0x0000000008200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1174 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_K_ALLOW_in_selectStatement1189 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_K_FILTERING_in_selectStatement1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_selectClause1228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_selectClause1233 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_selector_in_selectClause1237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_191_in_selectClause1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selector1282 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_K_AS_in_selector1285 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_selector1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_value_in_unaliasedSelector1380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1427 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_unaliasedSelector1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1433 = new BitSet(new long[]{0x0000000000244040L,0x0000004200000800L,0x40A2024400000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_unaliasedSelector1437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_COUNT_in_unaliasedSelector1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_191_in_unaliasedSelector1462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1500 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1540 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_CAST_in_unaliasedSelector1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_unaliasedSelector1579 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_unaliasedSelector_in_unaliasedSelector1583 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_K_AS_in_unaliasedSelector1585 = new BitSet(new long[]{0x021900E200000000L,0x0800000000008401L,0x000000000034001FL});
	public static final BitSet FOLLOW_native_type_in_unaliasedSelector1589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_unaliasedSelector1591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_functionName_in_unaliasedSelector1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_unaliasedSelector1625 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_unaliasedSelector1629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_177_in_selectionFunctionArgs1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_selectionFunctionArgs1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_selectionFunctionArgs1669 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_selectionFunctionArgs1689 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_selectionFunctionArgs1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause1737 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_whereClause1741 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_relationOrExpression_in_whereClause1743 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_relation_in_relationOrExpression1765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_customIndexExpression_in_relationOrExpression1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_193_in_customIndexExpression1802 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_idxName_in_customIndexExpression1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_customIndexExpression1807 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_customIndexExpression1811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_customIndexExpression1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_orderByClause1843 = new BitSet(new long[]{0x0040000100000002L});
	public static final BitSet FOLLOW_K_ASC_in_orderByClause1846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_orderByClause1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INSERT_in_insertStatement1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_INTO_in_insertStatement1881 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0002000000000000L});
	public static final BitSet FOLLOW_normalInsertStatement_in_insertStatement1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_JSON_in_insertStatement1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0080004400020000L});
	public static final BitSet FOLLOW_jsonInsertStatement_in_insertStatement1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_normalInsertStatement1954 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_normalInsertStatement1965 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_normalInsertStatement1969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_normalInsertStatement1976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_VALUES_in_normalInsertStatement1984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_normalInsertStatement1992 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_normalInsertStatement2002 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_normalInsertStatement2006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_normalInsertStatement2013 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_IF_in_normalInsertStatement2023 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_normalInsertStatement2025 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_normalInsertStatement2027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_usingClause_in_normalInsertStatement2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jsonValue_in_jsonInsertStatement2088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_IF_in_jsonInsertStatement2098 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_jsonInsertStatement2100 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_jsonInsertStatement2102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_usingClause_in_jsonInsertStatement2117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_jsonValue2158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_jsonValue2168 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_jsonValue2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_jsonValue2186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClause2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000204L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause2219 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_usingClause2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000204L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause2226 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective2248 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective2252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective2262 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective2266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UPDATE_in_updateStatement2300 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_updateStatement2304 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_usingClause_in_updateStatement2314 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_SET_in_updateStatement2326 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement2328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000800000L});
	public static final BitSet FOLLOW_180_in_updateStatement2332 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_updateStatement2345 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_updateStatement2349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_IF_in_updateStatement2359 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_EXISTS_in_updateStatement2363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_updateStatement2371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions2413 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_updateConditions2418 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions2420 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_DELETE_in_deleteStatement2457 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB437L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_deleteSelection_in_deleteStatement2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_deleteStatement2476 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000820000L});
	public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement2490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_deleteStatement2502 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_deleteStatement2506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_IF_in_deleteStatement2516 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement2520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_deleteStatement2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_deleteSelection2590 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2594 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_cident_in_deleteOp2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp2648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_deleteOp2650 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_deleteOp2654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_deleteOp2656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_deleteOp2670 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_deleteOp2674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClauseDelete2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete2696 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseDelete2700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BEGIN_in_batchStatement2734 = new BitSet(new long[]{0x0001000800000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement2744 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_K_COUNTER_in_batchStatement2750 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2763 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0000000000022000L});
	public static final BitSet FOLLOW_usingClause_in_batchStatement2767 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0000000000002000L});
	public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement2787 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0100000000002000L});
	public static final BitSet FOLLOW_184_in_batchStatement2789 = new BitSet(new long[]{0x0020000040000000L,0x0000000000004000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_APPLY_in_batchStatement2803 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createAggregateStatement2895 = new BitSet(new long[]{0x0000000002000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_OR_in_createAggregateStatement2898 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createAggregateStatement2900 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_createAggregateStatement2912 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_createAggregateStatement2921 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createAggregateStatement2923 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createAggregateStatement2925 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_createAggregateStatement2939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createAggregateStatement2947 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement2971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createAggregateStatement2987 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement2991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createAggregateStatement3015 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_SFUNC_in_createAggregateStatement3023 = new BitSet(new long[]{0xE21DEAE286100000L,0xFCD1F2141DD0B435L,0x00000008003D8CDFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement3029 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_K_STYPE_in_createAggregateStatement3037 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createAggregateStatement3043 = new BitSet(new long[]{0x8000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_FINALFUNC_in_createAggregateStatement3061 = new BitSet(new long[]{0xE21DEAE286100000L,0xFCD1F2141DD0B435L,0x00000008003D8CDFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_createAggregateStatement3067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_K_INITCOND_in_createAggregateStatement3094 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_createAggregateStatement3100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropAggregateStatement3147 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_K_AGGREGATE_in_dropAggregateStatement3149 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_dropAggregateStatement3158 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropAggregateStatement3160 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_dropAggregateStatement3175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_dropAggregateStatement3193 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_dropAggregateStatement3239 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropAggregateStatement3243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_dropAggregateStatement3271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createFunctionStatement3328 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000010L});
	public static final BitSet FOLLOW_K_OR_in_createFunctionStatement3331 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createFunctionStatement3333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_FUNCTION_in_createFunctionStatement3345 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_createFunctionStatement3354 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createFunctionStatement3356 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createFunctionStatement3358 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_createFunctionStatement3372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createFunctionStatement3380 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00040008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement3404 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createFunctionStatement3424 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_createFunctionStatement3428 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createFunctionStatement3456 = new BitSet(new long[]{0x0000020000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement3467 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement3469 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_CALLED_in_createFunctionStatement3475 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_createFunctionStatement3481 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_NULL_in_createFunctionStatement3483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_K_INPUT_in_createFunctionStatement3485 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement3493 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_LANGUAGE_in_createFunctionStatement3507 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_createFunctionStatement3513 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_K_AS_in_createFunctionStatement3521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement3527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropFunctionStatement3565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_K_FUNCTION_in_dropFunctionStatement3567 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_K_IF_in_dropFunctionStatement3576 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropFunctionStatement3578 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_dropFunctionStatement3593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_dropFunctionStatement3611 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement3639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_dropFunctionStatement3657 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement3661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_dropFunctionStatement3689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement3748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement3750 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement3753 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement3755 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement3757 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement3766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement3774 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_createKeyspaceStatement3776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTableStatement3811 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement3813 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createTableStatement3816 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTableStatement3818 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement3820 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement3835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement3845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_cfamDefinition3864 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD3F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_cfamDefinition3871 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD3F2141DDCB435L,0x00140008023D8E9FL});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_cfamDefinition3880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_cfamDefinition3890 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3892 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_cfamDefinition3897 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3899 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ident_in_cfamColumns3925 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_cfamColumns3929 = new BitSet(new long[]{0x0000000000000002L,0x1002000000000000L});
	public static final BitSet FOLLOW_K_STATIC_in_cfamColumns3934 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns3953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns3965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns3967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_cfamColumns3969 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8E9FL});
	public static final BitSet FOLLOW_pkDef_in_cfamColumns3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_cfamColumns3975 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_ident_in_cfamColumns3979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_cfamColumns3986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_pkDef4006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_pkDef4016 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_ident_in_pkDef4022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_pkDef4028 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_ident_in_pkDef4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_pkDef4039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_cfamProperty4059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty4068 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty4070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty4080 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_ORDER_in_cfamProperty4082 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_K_BY_in_cfamProperty4084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_cfamProperty4086 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_cfamProperty4092 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty4094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_cfamProperty4099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_cfamOrdering4127 = new BitSet(new long[]{0x0040000100000000L});
	public static final BitSet FOLLOW_K_ASC_in_cfamOrdering4130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_cfamOrdering4134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement4173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement4175 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createTypeStatement4178 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTypeStatement4180 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement4182 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_userTypeName_in_createTypeStatement4200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createTypeStatement4213 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement4215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createTypeStatement4220 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00140008023D8E9FL});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement4222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createTypeStatement4229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fident_in_typeColumns4249 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_typeColumns4253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement4288 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement4291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement4297 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F3141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createIndexStatement4300 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createIndexStatement4302 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement4304 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F3141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_idxName_in_createIndexStatement4320 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_createIndexStatement4325 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement4329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createIndexStatement4331 = new BitSet(new long[]{0xEB1DEEE286100000L,0xFCD1F2141DDCB43DL,0x00040008023D8E9FL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement4334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createIndexStatement4338 = new BitSet(new long[]{0xEB1DEEE286100000L,0xFCD1F2141DDCB43DL,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement4340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createIndexStatement4347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001020000L});
	public static final BitSet FOLLOW_K_USING_in_createIndexStatement4358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement4362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createIndexStatement4377 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_createIndexStatement4379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_indexIdent4411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VALUES_in_indexIdent4439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4441 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYS_in_indexIdent4458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4460 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ENTRIES_in_indexIdent4479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4481 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FULL_in_indexIdent4497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_indexIdent4499 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_indexIdent4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_indexIdent4505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createMaterializedViewStatement4542 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_createMaterializedViewStatement4544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_VIEW_in_createMaterializedViewStatement4546 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createMaterializedViewStatement4549 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createMaterializedViewStatement4551 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createMaterializedViewStatement4553 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement4561 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_K_AS_in_createMaterializedViewStatement4563 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_K_SELECT_in_createMaterializedViewStatement4573 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0xC0A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_selectClause_in_createMaterializedViewStatement4577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_createMaterializedViewStatement4579 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createMaterializedViewStatement4583 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_K_WHERE_in_createMaterializedViewStatement4594 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL,0x0000000000000002L});
	public static final BitSet FOLLOW_whereClause_in_createMaterializedViewStatement4598 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_createMaterializedViewStatement4610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_KEY_in_createMaterializedViewStatement4612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createMaterializedViewStatement4624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_createMaterializedViewStatement4626 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createMaterializedViewStatement4636 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createMaterializedViewStatement4647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createMaterializedViewStatement4651 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createMaterializedViewStatement4662 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_177_in_createMaterializedViewStatement4672 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_createMaterializedViewStatement4682 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createMaterializedViewStatement4686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_createMaterializedViewStatement4693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createMaterializedViewStatement4725 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement4727 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_createMaterializedViewStatement4732 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cfamProperty_in_createMaterializedViewStatement4734 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement4772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement4774 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createTriggerStatement4777 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createTriggerStatement4779 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTriggerStatement4781 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_createTriggerStatement4791 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_createTriggerStatement4802 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement4806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_USING_in_createTriggerStatement4808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement4812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement4853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement4855 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropTriggerStatement4858 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTriggerStatement4860 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_dropTriggerStatement4870 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement4873 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement4877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement4917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement4919 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement4923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement4933 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement4935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement4970 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement4972 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement4976 = new BitSet(new long[]{0x0400000011000000L,0x0004000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement4990 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement4994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement4997 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTableStatement5020 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5035 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5041 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_alterTableStatement5076 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5081 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5086 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_alterTableStatement5120 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5124 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement5129 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_cfisStatic_in_alterTableStatement5134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_alterTableStatement5141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement5161 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_alterTableStatement5204 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_alterTableStatement5238 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_alterTableStatement5249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_alterTableStatement5268 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_alterTableStatement5271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement5304 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement5360 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5364 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTableStatement5385 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement5391 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_alterTableStatement5395 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_STATIC_in_cfisStatic5448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterMaterializedViewStatement5484 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_alterMaterializedViewStatement5486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_VIEW_in_alterMaterializedViewStatement5488 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_alterMaterializedViewStatement5492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterMaterializedViewStatement5504 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_properties_in_alterMaterializedViewStatement5506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement5537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement5539 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement5543 = new BitSet(new long[]{0x0000000011000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement5557 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement5563 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement5567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement5583 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5589 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement5593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement5616 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement5656 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5660 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTypeStatement5683 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement5689 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_alterTypeStatement5693 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement5760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement5762 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement5765 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement5767 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement5776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTableStatement5810 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement5812 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropTableStatement5815 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement5817 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement5826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement5860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement5862 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropTypeStatement5865 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement5867 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement5876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement5910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement5912 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropIndexStatement5915 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement5917 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_indexName_in_dropIndexStatement5926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropMaterializedViewStatement5966 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_MATERIALIZED_in_dropMaterializedViewStatement5968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_VIEW_in_dropMaterializedViewStatement5970 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropMaterializedViewStatement5973 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropMaterializedViewStatement5975 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dropMaterializedViewStatement5984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement6015 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_truncateStatement6018 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement6024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantPermissionsStatement6049 = new BitSet(new long[]{0x1482000414000000L,0x0100000100000000L});
	public static final BitSet FOLLOW_permissionOrAll_in_grantPermissionsStatement6061 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_grantPermissionsStatement6069 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F214DDFCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_resource_in_grantPermissionsStatement6081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_grantPermissionsStatement6089 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantPermissionsStatement6103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokePermissionsStatement6134 = new BitSet(new long[]{0x1482000414000000L,0x0100000100000000L});
	public static final BitSet FOLLOW_permissionOrAll_in_revokePermissionsStatement6146 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_K_ON_in_revokePermissionsStatement6154 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F214DDFCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_resource_in_revokePermissionsStatement6166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_revokePermissionsStatement6174 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokePermissionsStatement6188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantRoleStatement6219 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement6233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_TO_in_grantRoleStatement6241 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_grantRoleStatement6255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokeRoleStatement6286 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement6300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROM_in_revokeRoleStatement6308 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_revokeRoleStatement6322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement6360 = new BitSet(new long[]{0x1482000414000000L,0x0100000100000000L});
	public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement6372 = new BitSet(new long[]{0x0000000000000002L,0x0000018800000000L});
	public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement6382 = new BitSet(new long[]{0xE31DFEE286100000L,0xFCD1F214DDFCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_resource_in_listPermissionsStatement6384 = new BitSet(new long[]{0x0000000000000002L,0x0000008800000000L});
	public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement6399 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_roleName_in_listPermissionsStatement6401 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement6415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_permission6451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_permissionOrAll6508 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll6512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll6533 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll6537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataResource_in_resource6565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleResource_in_resource6577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionResource_in_resource6589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jmxResource_in_resource6601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource6624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource6626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource6636 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource6642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource6654 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_columnFamilyName_in_dataResource6663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_jmxResource6692 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource6694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEAN_in_jmxResource6714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource6716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MBEANS_in_jmxResource6726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_mbean_in_jmxResource6728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_roleResource6751 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_roleResource6753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ROLE_in_roleResource6763 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_roleResource6769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource6801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource6803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_functionResource6813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_K_FUNCTIONS_in_functionResource6815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_IN_in_functionResource6817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_functionResource6819 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_keyspaceName_in_functionResource6825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FUNCTION_in_functionResource6840 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8EDFL});
	public static final BitSet FOLLOW_functionName_in_functionResource6844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_functionResource6862 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00040048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource6890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_functionResource6908 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_functionResource6912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_functionResource6940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createUserStatement6988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_USER_in_createUserStatement6990 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L,0x0000004800000000L});
	public static final BitSet FOLLOW_K_IF_in_createUserStatement6993 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createUserStatement6995 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement6997 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000004800000000L});
	public static final BitSet FOLLOW_username_in_createUserStatement7005 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createUserStatement7017 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_userPassword_in_createUserStatement7019 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement7033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement7039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement7084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_USER_in_alterUserStatement7086 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000004800000000L});
	public static final BitSet FOLLOW_username_in_alterUserStatement7090 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterUserStatement7102 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_userPassword_in_alterUserStatement7104 = new BitSet(new long[]{0x0000000000000002L,0x8000001000000000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement7118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement7132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropUserStatement7178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_K_USER_in_dropUserStatement7180 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L,0x0000004800000000L});
	public static final BitSet FOLLOW_K_IF_in_dropUserStatement7183 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement7185 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000004800000000L});
	public static final BitSet FOLLOW_username_in_dropUserStatement7193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listUsersStatement7218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_USERS_in_listUsersStatement7220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createRoleStatement7254 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_createRoleStatement7256 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_createRoleStatement7259 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_createRoleStatement7261 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createRoleStatement7263 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_createRoleStatement7271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_createRoleStatement7281 = new BitSet(new long[]{0x0000000000000000L,0x8000220008000000L});
	public static final BitSet FOLLOW_roleOptions_in_createRoleStatement7283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterRoleStatement7327 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_alterRoleStatement7329 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_alterRoleStatement7333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_WITH_in_alterRoleStatement7343 = new BitSet(new long[]{0x0000000000000000L,0x8000220008000000L});
	public static final BitSet FOLLOW_roleOptions_in_alterRoleStatement7345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropRoleStatement7389 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_K_ROLE_in_dropRoleStatement7391 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB4B5L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_K_IF_in_dropRoleStatement7394 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropRoleStatement7396 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_userOrRoleName_in_dropRoleStatement7404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listRolesStatement7444 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_K_ROLES_in_listRolesStatement7446 = new BitSet(new long[]{0x0000000000000002L,0x0000008800000000L});
	public static final BitSet FOLLOW_K_OF_in_listRolesStatement7456 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000004C023D8E9FL});
	public static final BitSet FOLLOW_roleName_in_listRolesStatement7458 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listRolesStatement7471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions7502 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_roleOptions7506 = new BitSet(new long[]{0x0000000000000000L,0x8000220008000000L});
	public static final BitSet FOLLOW_roleOption_in_roleOptions7508 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_roleOption7530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleOption7536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_OPTIONS_in_roleOption7547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_mapLiteral_in_roleOption7553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_roleOption7564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7566 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption7570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LOGIN_in_roleOption7581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_roleOption7583 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BOOLEAN_in_roleOption7587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userPassword7609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userPassword7613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cident7644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cident7669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cident7688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident7714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ident7739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ident7758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fident7783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_fident7808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_fident7827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_noncol_ident7853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_noncol_ident7878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_noncol_ident7897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_keyspaceName7930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_indexName7964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_indexName7967 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_idxName_in_indexName7971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ksName_in_columnFamilyName8003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_columnFamilyName8006 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x0000000C023D8E9FL});
	public static final BitSet FOLLOW_cfName_in_columnFamilyName8010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_userTypeName8035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_userTypeName8037 = new BitSet(new long[]{0xE0046A0086100000L,0xF4D1F2141DD83034L,0x0000000800098C80L});
	public static final BitSet FOLLOW_non_type_ident_in_userTypeName8043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_roleName_in_userOrRoleName8075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ksName8098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_ksName8123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_ksName8142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_ksName8152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cfName8174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cfName8199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cfName8218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_cfName8228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idxName8250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_idxName8275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_idxName8294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_idxName8304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_roleName8326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_roleName8351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_roleName8367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_roleName8386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_roleName8396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant8421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant8433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant8452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant8473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UUID_in_constant8492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMBER_in_constant8514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_181_in_constant8532 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000800L});
	public static final BitSet FOLLOW_set_in_constant8541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_mapLiteral8570 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x000000000000000CL});
	public static final BitSet FOLLOW_term_in_mapLiteral8588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_mapLiteral8590 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_mapLiteral8594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_180_in_mapLiteral8600 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_mapLiteral8604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_mapLiteral8606 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_mapLiteral8610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_mapLiteral8626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_setOrMapLiteral8650 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_setOrMapLiteral8670 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_setOrMapLiteral8676 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_setOrMapLiteral8715 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral8719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_190_in_collectionLiteral8753 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000005L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_180_in_collectionLiteral8777 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_collectionLiteral8797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_collectionLiteral8807 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_collectionLiteral8811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0090000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_setOrMapLiteral_in_collectionLiteral8815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_collectionLiteral8820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_collectionLiteral8838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_collectionLiteral8840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_194_in_usertypeLiteral8884 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral8888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_usertypeLiteral8890 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral8894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_180_in_usertypeLiteral8900 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_usertypeLiteral8904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_183_in_usertypeLiteral8906 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral8910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_195_in_usertypeLiteral8917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleLiteral8954 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_tupleLiteral8958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleLiteral8964 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_tupleLiteral8968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleLiteral8975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value8998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_value9020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usertypeLiteral_in_value9033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_value9048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_value9064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_value9088 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_value9092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_value9103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_intValue9149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_intValue9163 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_intValue9167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_intValue9178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyspaceName_in_functionName9212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_182_in_functionName9214 = new BitSet(new long[]{0xE21DEAE286100000L,0xFCD1F2141DD0B435L,0x00000008003D8CDFL});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName9220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_allowedFunctionName9247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_allowedFunctionName9281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_allowedFunctionName9309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_allowedFunctionName9319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNT_in_allowedFunctionName9351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function9398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_function9400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_function9402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function9432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_177_in_function9434 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_functionArgs_in_function9438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_function9440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_functionArgs9473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_functionArgs9479 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_functionArgs9483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_value_in_term9511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_term9548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_term9580 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_term9584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_term9586 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_term9590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnOperation9613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4840000000000000L});
	public static final BitSet FOLLOW_columnOperationDifferentiator_in_columnOperation9615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_columnOperationDifferentiator9634 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_normalColumnOperation_in_columnOperationDifferentiator9636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_190_in_columnOperationDifferentiator9645 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnOperationDifferentiator9649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_columnOperationDifferentiator9651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_collectionColumnOperation_in_columnOperationDifferentiator9653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_182_in_columnOperationDifferentiator9662 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_columnOperationDifferentiator9666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_udtColumnOperation_in_columnOperationDifferentiator9668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation9689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_179_in_normalColumnOperation9692 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0028000000000000L});
	public static final BitSet FOLLOW_set_in_normalColumnOperation9721 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation9731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation9749 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_INTEGER_in_normalColumnOperation9753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_collectionColumnOperation9779 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_collectionColumnOperation9783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_udtColumnOperation9809 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_udtColumnOperation9813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnCondition9846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x7E41000000000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition9860 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition9864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition9878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition9896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition9916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_190_in_columnCondition9944 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition9948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_columnCondition9950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition9968 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition9972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition9990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition10012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition10036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_182_in_columnCondition10082 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_fident_in_columnCondition10086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition10104 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_columnCondition10108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition10126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition10148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition10172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_properties10234 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_K_AND_in_properties10238 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_property_in_properties10240 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property10263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_property10265 = new BitSet(new long[]{0xE31DEEE286244040L,0xFCD1F2161DDCBC35L,0x00200240023D8E9FL});
	public static final BitSet FOLLOW_propertyValue_in_property10269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_noncol_ident_in_property10281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_187_in_property10283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_mapLiteral_in_property10287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_propertyValue10312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue10334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_relationType10357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_185_in_relationType10368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_186_in_relationType10379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_188_in_relationType10389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_189_in_relationType10400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_176_in_relationType10410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_relation10436 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10452 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_LIKE_in_relation10454 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_K_IS_in_relation10472 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_NOT_in_relation10474 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_NULL_in_relation10476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_relation10486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation10490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_relation10494 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_IN_in_relation10520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_inMarker_in_relation10524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_IN_in_relation10546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_relation10550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10570 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_K_CONTAINS_in_relation10572 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_K_KEY_in_relation10577 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation10605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_190_in_relation10607 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_192_in_relation10613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3E01000000000000L});
	public static final BitSet FOLLOW_relationType_in_relation10617 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_relation10621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation10633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x3E01000000000000L});
	public static final BitSet FOLLOW_K_IN_in_relation10643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0082000400000000L});
	public static final BitSet FOLLOW_177_in_relation10657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_relation10659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarkerForTuple_in_relation10691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation10725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation10759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation10801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_relation10805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation10831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_markerForTuple_in_relation10835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_relation10865 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00020008023D8EDFL});
	public static final BitSet FOLLOW_relation_in_relation10867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_178_in_relation10870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarker10891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_inMarker10901 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarker10905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleOfIdentifiers10937 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers10941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleOfIdentifiers10946 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers10950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleOfIdentifiers10956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_singleColumnInValues10986 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A6024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues10994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_singleColumnInValues10999 = new BitSet(new long[]{0xE31DEEE286344040L,0xFCD1F2561DDCBC35L,0x40A2024C023D8EDFL,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues11003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_singleColumnInValues11012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleOfTupleLiterals11042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleOfTupleLiterals11051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals11055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleOfTupleLiterals11061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_markerForTuple11082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_markerForTuple11092 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_markerForTuple11096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_177_in_tupleOfMarkersForTuples11128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_180_in_tupleOfMarkersForTuples11137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000400000000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples11141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0014000000000000L});
	public static final BitSet FOLLOW_178_in_tupleOfMarkersForTuples11147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple11168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_inMarkerForTuple11178 = new BitSet(new long[]{0xE31DEEE286100000L,0xFCD1F2141DDCB435L,0x00000008023D8E9FL});
	public static final BitSet FOLLOW_noncol_ident_in_inMarkerForTuple11182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_comparatorType11207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_type_in_comparatorType11223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_type_in_comparatorType11235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userTypeName_in_comparatorType11251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROZEN_in_comparatorType11263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_comparatorType11265 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_comparatorType11269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_comparatorType11271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType11289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASCII_in_native_type11318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BIGINT_in_native_type11332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BLOB_in_native_type11345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BOOLEAN_in_native_type11360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNTER_in_native_type11372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DECIMAL_in_native_type11384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DOUBLE_in_native_type11396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_native_type11409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INET_in_native_type11423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_native_type11438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SMALLINT_in_native_type11454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TEXT_in_native_type11465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type11480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TINYINT_in_native_type11490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UUID_in_native_type11502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARCHAR_in_native_type11517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARINT_in_native_type11529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMEUUID_in_native_type11542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DATE_in_native_type11553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIME_in_native_type11568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAP_in_collection_type11596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_collection_type11599 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_180_in_collection_type11605 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_collection_type11611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_collection_type11629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_collection_type11631 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_collection_type11637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SET_in_collection_type11655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_collection_type11658 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_collection_type11662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_188_in_collection_type11664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TUPLE_in_tuple_type11695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_185_in_tuple_type11697 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type11712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1010000000000000L});
	public static final BitSet FOLLOW_180_in_tuple_type11717 = new BitSet(new long[]{0xE31DEEE286100000L,0xFED1F2141DDCB435L,0x00000048023D8E9FL});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type11721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1010000000000000L});
	public static final BitSet FOLLOW_188_in_tuple_type11733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_username11752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_username11760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_username11768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_mbean11787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_non_type_ident11812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident11843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident11868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEY_in_non_type_ident11880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword11923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unreserved_keyword11939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword11990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword12002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_basic_unreserved_keyword12040 = new BitSet(new long[]{0x0000000000000002L});
}
