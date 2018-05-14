// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon May 14 00:28:09 PDT 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("movie_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.movie_id = (Integer)value;
      }
    });
    setters.put("movie_title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.movie_title = (String)value;
      }
    });
    setters.put("release_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.release_date = (String)value;
      }
    });
    setters.put("video_release_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.video_release_date = (String)value;
      }
    });
    setters.put("IMDb_URL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.IMDb_URL = (String)value;
      }
    });
    setters.put("group_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        QueryResult.this.group_name = (String)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private Integer movie_id;
  public Integer get_movie_id() {
    return movie_id;
  }
  public void set_movie_id(Integer movie_id) {
    this.movie_id = movie_id;
  }
  public QueryResult with_movie_id(Integer movie_id) {
    this.movie_id = movie_id;
    return this;
  }
  private String movie_title;
  public String get_movie_title() {
    return movie_title;
  }
  public void set_movie_title(String movie_title) {
    this.movie_title = movie_title;
  }
  public QueryResult with_movie_title(String movie_title) {
    this.movie_title = movie_title;
    return this;
  }
  private String release_date;
  public String get_release_date() {
    return release_date;
  }
  public void set_release_date(String release_date) {
    this.release_date = release_date;
  }
  public QueryResult with_release_date(String release_date) {
    this.release_date = release_date;
    return this;
  }
  private String video_release_date;
  public String get_video_release_date() {
    return video_release_date;
  }
  public void set_video_release_date(String video_release_date) {
    this.video_release_date = video_release_date;
  }
  public QueryResult with_video_release_date(String video_release_date) {
    this.video_release_date = video_release_date;
    return this;
  }
  private String IMDb_URL;
  public String get_IMDb_URL() {
    return IMDb_URL;
  }
  public void set_IMDb_URL(String IMDb_URL) {
    this.IMDb_URL = IMDb_URL;
  }
  public QueryResult with_IMDb_URL(String IMDb_URL) {
    this.IMDb_URL = IMDb_URL;
    return this;
  }
  private String group_name;
  public String get_group_name() {
    return group_name;
  }
  public void set_group_name(String group_name) {
    this.group_name = group_name;
  }
  public QueryResult with_group_name(String group_name) {
    this.group_name = group_name;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.movie_id == null ? that.movie_id == null : this.movie_id.equals(that.movie_id));
    equal = equal && (this.movie_title == null ? that.movie_title == null : this.movie_title.equals(that.movie_title));
    equal = equal && (this.release_date == null ? that.release_date == null : this.release_date.equals(that.release_date));
    equal = equal && (this.video_release_date == null ? that.video_release_date == null : this.video_release_date.equals(that.video_release_date));
    equal = equal && (this.IMDb_URL == null ? that.IMDb_URL == null : this.IMDb_URL.equals(that.IMDb_URL));
    equal = equal && (this.group_name == null ? that.group_name == null : this.group_name.equals(that.group_name));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.movie_id == null ? that.movie_id == null : this.movie_id.equals(that.movie_id));
    equal = equal && (this.movie_title == null ? that.movie_title == null : this.movie_title.equals(that.movie_title));
    equal = equal && (this.release_date == null ? that.release_date == null : this.release_date.equals(that.release_date));
    equal = equal && (this.video_release_date == null ? that.video_release_date == null : this.video_release_date.equals(that.video_release_date));
    equal = equal && (this.IMDb_URL == null ? that.IMDb_URL == null : this.IMDb_URL.equals(that.IMDb_URL));
    equal = equal && (this.group_name == null ? that.group_name == null : this.group_name.equals(that.group_name));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.movie_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.movie_title = JdbcWritableBridge.readString(2, __dbResults);
    this.release_date = JdbcWritableBridge.readString(3, __dbResults);
    this.video_release_date = JdbcWritableBridge.readString(4, __dbResults);
    this.IMDb_URL = JdbcWritableBridge.readString(5, __dbResults);
    this.group_name = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.movie_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.movie_title = JdbcWritableBridge.readString(2, __dbResults);
    this.release_date = JdbcWritableBridge.readString(3, __dbResults);
    this.video_release_date = JdbcWritableBridge.readString(4, __dbResults);
    this.IMDb_URL = JdbcWritableBridge.readString(5, __dbResults);
    this.group_name = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(movie_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(movie_title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(release_date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(video_release_date, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IMDb_URL, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(group_name, 6 + __off, -1, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(movie_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(movie_title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(release_date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(video_release_date, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(IMDb_URL, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(group_name, 6 + __off, -1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.movie_id = null;
    } else {
    this.movie_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.movie_title = null;
    } else {
    this.movie_title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.release_date = null;
    } else {
    this.release_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.video_release_date = null;
    } else {
    this.video_release_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.IMDb_URL = null;
    } else {
    this.IMDb_URL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.group_name = null;
    } else {
    this.group_name = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.movie_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_id);
    }
    if (null == this.movie_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_title);
    }
    if (null == this.release_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, release_date);
    }
    if (null == this.video_release_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, video_release_date);
    }
    if (null == this.IMDb_URL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IMDb_URL);
    }
    if (null == this.group_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, group_name);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.movie_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_id);
    }
    if (null == this.movie_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_title);
    }
    if (null == this.release_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, release_date);
    }
    if (null == this.video_release_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, video_release_date);
    }
    if (null == this.IMDb_URL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, IMDb_URL);
    }
    if (null == this.group_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, group_name);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(movie_id==null?"null":"" + movie_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_title==null?"null":movie_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(release_date==null?"null":release_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(video_release_date==null?"null":video_release_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IMDb_URL==null?"null":IMDb_URL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_name==null?"null":group_name, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(movie_id==null?"null":"" + movie_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_title==null?"null":movie_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(release_date==null?"null":release_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(video_release_date==null?"null":video_release_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IMDb_URL==null?"null":IMDb_URL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_name==null?"null":group_name, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_id = null; } else {
      this.movie_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_title = null; } else {
      this.movie_title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.release_date = null; } else {
      this.release_date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.video_release_date = null; } else {
      this.video_release_date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.IMDb_URL = null; } else {
      this.IMDb_URL = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.group_name = null; } else {
      this.group_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_id = null; } else {
      this.movie_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.movie_title = null; } else {
      this.movie_title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.release_date = null; } else {
      this.release_date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.video_release_date = null; } else {
      this.video_release_date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.IMDb_URL = null; } else {
      this.IMDb_URL = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.group_name = null; } else {
      this.group_name = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("movie_id", this.movie_id);
    __sqoop$field_map.put("movie_title", this.movie_title);
    __sqoop$field_map.put("release_date", this.release_date);
    __sqoop$field_map.put("video_release_date", this.video_release_date);
    __sqoop$field_map.put("IMDb_URL", this.IMDb_URL);
    __sqoop$field_map.put("group_name", this.group_name);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("movie_id", this.movie_id);
    __sqoop$field_map.put("movie_title", this.movie_title);
    __sqoop$field_map.put("release_date", this.release_date);
    __sqoop$field_map.put("video_release_date", this.video_release_date);
    __sqoop$field_map.put("IMDb_URL", this.IMDb_URL);
    __sqoop$field_map.put("group_name", this.group_name);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
