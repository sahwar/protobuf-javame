package net.jarlehansen.proto2javame.generated.sourcecode.tests.tempfiles;
// Generated by proto2javame, Sun Sep 05 02:05:37 CEST 2010.

import java.io.IOException;
import java.io.InputStream;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.DelimitedInputStream;
import net.jarlehansen.protobuf.javame.input.DelimitedSizeUtil;
import net.jarlehansen.protobuf.javame.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.AbstractOutputWriter;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;

public final class JunitTestLargeObject extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int id;
	private static final int fieldNumberId = 1;

	private final long number2;
	private static final int fieldNumberNumber2 = 2;

	private final String name;
	private static final int fieldNumberName = 3;

	private final boolean boolVal;
	private static final int fieldNumberBoolVal = 4;

	private final double amount;
	private static final int fieldNumberAmount = 5;

	private final float floatNum;
	private static final int fieldNumberFloatNum = 6;

	private final net.jarlehansen.protobuf.javame.ByteString byteStringObj;
	private static final int fieldNumberByteStringObj = 7;

	private final int idOptional;
	private static final int fieldNumberIdOptional = 8;
	private final boolean hasIdOptional;

	private final long number2Optional;
	private static final int fieldNumberNumber2Optional = 9;
	private final boolean hasNumber2Optional;

	private final String nameOptional;
	private static final int fieldNumberNameOptional = 10;
	private final boolean hasNameOptional;

	private final boolean boolValOptional;
	private static final int fieldNumberBoolValOptional = 11;
	private final boolean hasBoolValOptional;

	private final double amountOptional;
	private static final int fieldNumberAmountOptional = 12;
	private final boolean hasAmountOptional;

	private final float floatNumOptional;
	private static final int fieldNumberFloatNumOptional = 13;
	private final boolean hasFloatNumOptional;

	private final net.jarlehansen.protobuf.javame.ByteString byteStringObjOptional;
	private static final int fieldNumberByteStringObjOptional = 14;
	private final boolean hasByteStringObjOptional;

	private final java.util.Vector idList;
	private static final int fieldNumberIdList = 15;

	private final java.util.Vector number2List;
	private static final int fieldNumberNumber2List = 16;

	private final java.util.Vector nameList;
	private static final int fieldNumberNameList = 17;

	private final java.util.Vector boolValList;
	private static final int fieldNumberBoolValList = 18;

	private final java.util.Vector amountList;
	private static final int fieldNumberAmountList = 19;

	private final java.util.Vector floatNumList;
	private static final int fieldNumberFloatNumList = 20;

	private final java.util.Vector byteStringObjList;
	private static final int fieldNumberByteStringObjList = 21;


	public static Builder newBuilder() {
		return new Builder();
	}

	private JunitTestLargeObject(final Builder builder) {
		if (builder.hasId && builder.hasNumber2 && builder.hasName && builder.hasBoolVal && builder.hasAmount && builder.hasFloatNum && builder.hasByteStringObj ) {
			this.id = builder.id;
			this.number2 = builder.number2;
			this.name = builder.name;
			this.boolVal = builder.boolVal;
			this.amount = builder.amount;
			this.floatNum = builder.floatNum;
			this.byteStringObj = builder.byteStringObj;
			this.idOptional = builder.idOptional;
			this.hasIdOptional = builder.hasIdOptional;
			this.number2Optional = builder.number2Optional;
			this.hasNumber2Optional = builder.hasNumber2Optional;
			this.nameOptional = builder.nameOptional;
			this.hasNameOptional = builder.hasNameOptional;
			this.boolValOptional = builder.boolValOptional;
			this.hasBoolValOptional = builder.hasBoolValOptional;
			this.amountOptional = builder.amountOptional;
			this.hasAmountOptional = builder.hasAmountOptional;
			this.floatNumOptional = builder.floatNumOptional;
			this.hasFloatNumOptional = builder.hasFloatNumOptional;
			this.byteStringObjOptional = builder.byteStringObjOptional;
			this.hasByteStringObjOptional = builder.hasByteStringObjOptional;
			this.idList = builder.idList;
			this.number2List = builder.number2List;
			this.nameList = builder.nameList;
			this.boolValList = builder.boolValList;
			this.amountList = builder.amountList;
			this.floatNumList = builder.floatNumList;
			this.byteStringObjList = builder.byteStringObjList;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" id:" + builder.hasId + " number2:" + builder.hasNumber2 + " name:" + builder.hasName + " boolVal:" + builder.hasBoolVal + " amount:" + builder.hasAmount + " floatNum:" + builder.hasFloatNum + " byteStringObj:" + builder.hasByteStringObj + "");
		}
	}

	public static class Builder {
		private int id;
		private boolean hasId = false;

		private long number2;
		private boolean hasNumber2 = false;

		private String name;
		private boolean hasName = false;

		private boolean boolVal;
		private boolean hasBoolVal = false;

		private double amount;
		private boolean hasAmount = false;

		private float floatNum;
		private boolean hasFloatNum = false;

		private net.jarlehansen.protobuf.javame.ByteString byteStringObj;
		private boolean hasByteStringObj = false;

		private int idOptional;
		private boolean hasIdOptional = false;

		private long number2Optional;
		private boolean hasNumber2Optional = false;

		private String nameOptional;
		private boolean hasNameOptional = false;

		private boolean boolValOptional;
		private boolean hasBoolValOptional = false;

		private double amountOptional;
		private boolean hasAmountOptional = false;

		private float floatNumOptional;
		private boolean hasFloatNumOptional = false;

		private net.jarlehansen.protobuf.javame.ByteString byteStringObjOptional;
		private boolean hasByteStringObjOptional = false;

		private java.util.Vector idList = new java.util.Vector();
		private boolean hasIdList = false;

		private java.util.Vector number2List = new java.util.Vector();
		private boolean hasNumber2List = false;

		private java.util.Vector nameList = new java.util.Vector();
		private boolean hasNameList = false;

		private java.util.Vector boolValList = new java.util.Vector();
		private boolean hasBoolValList = false;

		private java.util.Vector amountList = new java.util.Vector();
		private boolean hasAmountList = false;

		private java.util.Vector floatNumList = new java.util.Vector();
		private boolean hasFloatNumList = false;

		private java.util.Vector byteStringObjList = new java.util.Vector();
		private boolean hasByteStringObjList = false;


		private Builder() {
		}

		public Builder setId(final int id) {
			this.id = id;
			this.hasId = true;
			return this;
		}

		public Builder setNumber2(final long number2) {
			this.number2 = number2;
			this.hasNumber2 = true;
			return this;
		}

		public Builder setName(final String name) {
			this.name = name;
			this.hasName = true;
			return this;
		}

		public Builder setBoolVal(final boolean boolVal) {
			this.boolVal = boolVal;
			this.hasBoolVal = true;
			return this;
		}

		public Builder setAmount(final double amount) {
			this.amount = amount;
			this.hasAmount = true;
			return this;
		}

		public Builder setFloatNum(final float floatNum) {
			this.floatNum = floatNum;
			this.hasFloatNum = true;
			return this;
		}

		public Builder setByteStringObj(final net.jarlehansen.protobuf.javame.ByteString byteStringObj) {
			this.byteStringObj = byteStringObj;
			this.hasByteStringObj = true;
			return this;
		}

		public Builder setIdOptional(final int idOptional) {
			this.idOptional = idOptional;
			this.hasIdOptional = true;
			return this;
		}

		public Builder setNumber2Optional(final long number2Optional) {
			this.number2Optional = number2Optional;
			this.hasNumber2Optional = true;
			return this;
		}

		public Builder setNameOptional(final String nameOptional) {
			this.nameOptional = nameOptional;
			this.hasNameOptional = true;
			return this;
		}

		public Builder setBoolValOptional(final boolean boolValOptional) {
			this.boolValOptional = boolValOptional;
			this.hasBoolValOptional = true;
			return this;
		}

		public Builder setAmountOptional(final double amountOptional) {
			this.amountOptional = amountOptional;
			this.hasAmountOptional = true;
			return this;
		}

		public Builder setFloatNumOptional(final float floatNumOptional) {
			this.floatNumOptional = floatNumOptional;
			this.hasFloatNumOptional = true;
			return this;
		}

		public Builder setByteStringObjOptional(final net.jarlehansen.protobuf.javame.ByteString byteStringObjOptional) {
			this.byteStringObjOptional = byteStringObjOptional;
			this.hasByteStringObjOptional = true;
			return this;
		}

		public Builder setIdList(final java.util.Vector idList) {
			if(!hasIdList) {
				hasIdList = true;
			}
			this.idList = idList;
			return this;
		}


		public Builder addElementIdList(final int element) {
			if(!hasIdList) {
				hasIdList = true;
			}
			idList.addElement(new Integer(element));
			return this;
		}

		public Builder setNumber2List(final java.util.Vector number2List) {
			if(!hasNumber2List) {
				hasNumber2List = true;
			}
			this.number2List = number2List;
			return this;
		}


		public Builder addElementNumber2List(final long element) {
			if(!hasNumber2List) {
				hasNumber2List = true;
			}
			number2List.addElement(new Long(element));
			return this;
		}

		public Builder setNameList(final java.util.Vector nameList) {
			if(!hasNameList) {
				hasNameList = true;
			}
			this.nameList = nameList;
			return this;
		}


		public Builder addElementNameList(final String element) {
			if(!hasNameList) {
				hasNameList = true;
			}
			nameList.addElement(element);
			return this;
		}

		public Builder setBoolValList(final java.util.Vector boolValList) {
			if(!hasBoolValList) {
				hasBoolValList = true;
			}
			this.boolValList = boolValList;
			return this;
		}


		public Builder addElementBoolValList(final boolean element) {
			if(!hasBoolValList) {
				hasBoolValList = true;
			}
			boolValList.addElement(new Boolean(element));
			return this;
		}

		public Builder setAmountList(final java.util.Vector amountList) {
			if(!hasAmountList) {
				hasAmountList = true;
			}
			this.amountList = amountList;
			return this;
		}


		public Builder addElementAmountList(final double element) {
			if(!hasAmountList) {
				hasAmountList = true;
			}
			amountList.addElement(new Double(element));
			return this;
		}

		public Builder setFloatNumList(final java.util.Vector floatNumList) {
			if(!hasFloatNumList) {
				hasFloatNumList = true;
			}
			this.floatNumList = floatNumList;
			return this;
		}


		public Builder addElementFloatNumList(final float element) {
			if(!hasFloatNumList) {
				hasFloatNumList = true;
			}
			floatNumList.addElement(new Float(element));
			return this;
		}

		public Builder setByteStringObjList(final java.util.Vector byteStringObjList) {
			if(!hasByteStringObjList) {
				hasByteStringObjList = true;
			}
			this.byteStringObjList = byteStringObjList;
			return this;
		}


		public Builder addElementByteStringObjList(final net.jarlehansen.protobuf.javame.ByteString element) {
			if(!hasByteStringObjList) {
				hasByteStringObjList = true;
			}
			byteStringObjList.addElement(element);
			return this;
		}

		public JunitTestLargeObject build() {
			return new JunitTestLargeObject(this);
		}
	}

	public int getId() {
		return id;
	}

	public long getNumber2() {
		return number2;
	}

	public String getName() {
		return name;
	}

	public boolean getBoolVal() {
		return boolVal;
	}

	public double getAmount() {
		return amount;
	}

	public float getFloatNum() {
		return floatNum;
	}

	public net.jarlehansen.protobuf.javame.ByteString getByteStringObj() {
		return byteStringObj;
	}

	public int getIdOptional() {
		return idOptional;
	}

	public boolean hasIdOptional() {
		return hasIdOptional;
	}

	public long getNumber2Optional() {
		return number2Optional;
	}

	public boolean hasNumber2Optional() {
		return hasNumber2Optional;
	}

	public String getNameOptional() {
		return nameOptional;
	}

	public boolean hasNameOptional() {
		return hasNameOptional;
	}

	public boolean getBoolValOptional() {
		return boolValOptional;
	}

	public boolean hasBoolValOptional() {
		return hasBoolValOptional;
	}

	public double getAmountOptional() {
		return amountOptional;
	}

	public boolean hasAmountOptional() {
		return hasAmountOptional;
	}

	public float getFloatNumOptional() {
		return floatNumOptional;
	}

	public boolean hasFloatNumOptional() {
		return hasFloatNumOptional;
	}

	public net.jarlehansen.protobuf.javame.ByteString getByteStringObjOptional() {
		return byteStringObjOptional;
	}

	public boolean hasByteStringObjOptional() {
		return hasByteStringObjOptional;
	}

	public java.util.Vector getIdList() {
		return idList;
	}

	public java.util.Vector getNumber2List() {
		return number2List;
	}

	public java.util.Vector getNameList() {
		return nameList;
	}

	public java.util.Vector getBoolValList() {
		return boolValList;
	}

	public java.util.Vector getAmountList() {
		return amountList;
	}

	public java.util.Vector getFloatNumList() {
		return floatNumList;
	}

	public java.util.Vector getByteStringObjList() {
		return byteStringObjList;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "id = " + this.id + TAB;
		retValue += "number2 = " + this.number2 + TAB;
		retValue += "name = " + this.name + TAB;
		retValue += "boolVal = " + this.boolVal + TAB;
		retValue += "amount = " + this.amount + TAB;
		retValue += "floatNum = " + this.floatNum + TAB;
		retValue += "byteStringObj = " + this.byteStringObj + TAB;
		if(hasIdOptional) retValue += "idOptional = " + this.idOptional + TAB;
		if(hasNumber2Optional) retValue += "number2Optional = " + this.number2Optional + TAB;
		if(hasNameOptional) retValue += "nameOptional = " + this.nameOptional + TAB;
		if(hasBoolValOptional) retValue += "boolValOptional = " + this.boolValOptional + TAB;
		if(hasAmountOptional) retValue += "amountOptional = " + this.amountOptional + TAB;
		if(hasFloatNumOptional) retValue += "floatNumOptional = " + this.floatNumOptional + TAB;
		if(hasByteStringObjOptional) retValue += "byteStringObjOptional = " + this.byteStringObjOptional + TAB;
		retValue += "idList = " + this.idList + TAB;
		retValue += "number2List = " + this.number2List + TAB;
		retValue += "nameList = " + this.nameList + TAB;
		retValue += "boolValList = " + this.boolValList + TAB;
		retValue += "amountList = " + this.amountList + TAB;
		retValue += "floatNumList = " + this.floatNumList + TAB;
		retValue += "byteStringObjList = " + this.byteStringObjList + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);
		totalSize += ComputeSizeUtil.computeLongSize(fieldNumberNumber2, number2);
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberName, name);
		totalSize += ComputeSizeUtil.computeBooleanSize(fieldNumberBoolVal, boolVal);
		totalSize += ComputeSizeUtil.computeDoubleSize(fieldNumberAmount, amount);
		totalSize += ComputeSizeUtil.computeFloatSize(fieldNumberFloatNum, floatNum);
		totalSize += ComputeSizeUtil.computeByteStringSize(fieldNumberByteStringObj, byteStringObj);
		if(hasIdOptional) totalSize += ComputeSizeUtil.computeIntSize(fieldNumberIdOptional, idOptional);
		if(hasNumber2Optional) totalSize += ComputeSizeUtil.computeLongSize(fieldNumberNumber2Optional, number2Optional);
		if(hasNameOptional) totalSize += ComputeSizeUtil.computeStringSize(fieldNumberNameOptional, nameOptional);
		if(hasBoolValOptional) totalSize += ComputeSizeUtil.computeBooleanSize(fieldNumberBoolValOptional, boolValOptional);
		if(hasAmountOptional) totalSize += ComputeSizeUtil.computeDoubleSize(fieldNumberAmountOptional, amountOptional);
		if(hasFloatNumOptional) totalSize += ComputeSizeUtil.computeFloatSize(fieldNumberFloatNumOptional, floatNumOptional);
		if(hasByteStringObjOptional) totalSize += ComputeSizeUtil.computeByteStringSize(fieldNumberByteStringObjOptional, byteStringObjOptional);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberIdList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_INT, idList);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberNumber2List, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_LONG, number2List);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberNameList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_STRING, nameList);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberBoolValList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_BOOLEAN, boolValList);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberAmountList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_DOUBLE, amountList);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberFloatNumList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_FLOAT, floatNumList);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberByteStringObjList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_BYTESTRING, byteStringObjList);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberId, id);
		writer.writeLong(fieldNumberNumber2, number2);
		writer.writeString(fieldNumberName, name);
		writer.writeBoolean(fieldNumberBoolVal, boolVal);
		writer.writeDouble(fieldNumberAmount, amount);
		writer.writeFloat(fieldNumberFloatNum, floatNum);
		writer.writeByteString(fieldNumberByteStringObj, byteStringObj);
		if(hasIdOptional) writer.writeInt(fieldNumberIdOptional, idOptional);
		if(hasNumber2Optional) writer.writeLong(fieldNumberNumber2Optional, number2Optional);
		if(hasNameOptional) writer.writeString(fieldNumberNameOptional, nameOptional);
		if(hasBoolValOptional) writer.writeBoolean(fieldNumberBoolValOptional, boolValOptional);
		if(hasAmountOptional) writer.writeDouble(fieldNumberAmountOptional, amountOptional);
		if(hasFloatNumOptional) writer.writeFloat(fieldNumberFloatNumOptional, floatNumOptional);
		if(hasByteStringObjOptional) writer.writeByteString(fieldNumberByteStringObjOptional, byteStringObjOptional);
		writer.writeList(fieldNumberIdList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_INT, idList);
		writer.writeList(fieldNumberNumber2List, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_LONG, number2List);
		writer.writeList(fieldNumberNameList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_STRING, nameList);
		writer.writeList(fieldNumberBoolValList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_BOOLEAN, boolValList);
		writer.writeList(fieldNumberAmountList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_DOUBLE, amountList);
		writer.writeList(fieldNumberFloatNumList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_FLOAT, floatNumList);
		writer.writeList(fieldNumberByteStringObjList, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_BYTESTRING, byteStringObjList);
		writer.writeData();
	}

	static JunitTestLargeObject parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final JunitTestLargeObject.Builder builder = JunitTestLargeObject.newBuilder();

		while (nextFieldNumber > 0) {
			populateBuilderWithField(reader, builder, nextFieldNumber);
			nextFieldNumber = getNextFieldNumber(reader);
		}

		return builder.build();
	}
	static int getNextFieldNumber(final InputReader reader) throws IOException {
		return reader.getNextFieldNumber();
	}

	static void populateBuilderWithField(final InputReader reader, final Builder builder, final int fieldNumber) throws IOException {
		switch (fieldNumber) {
			case fieldNumberId:
				builder.setId(reader.readInt(fieldNumber));
				break;
			case fieldNumberNumber2:
				builder.setNumber2(reader.readLong(fieldNumber));
				break;
			case fieldNumberName:
				builder.setName(reader.readString(fieldNumber));
				break;
			case fieldNumberBoolVal:
				builder.setBoolVal(reader.readBoolean(fieldNumber));
				break;
			case fieldNumberAmount:
				builder.setAmount(reader.readDouble(fieldNumber));
				break;
			case fieldNumberFloatNum:
				builder.setFloatNum(reader.readFloat(fieldNumber));
				break;
			case fieldNumberByteStringObj:
				builder.setByteStringObj(reader.readByteString(fieldNumber));
				break;
			case fieldNumberIdOptional:
				builder.setIdOptional(reader.readInt(fieldNumber));
				break;
			case fieldNumberNumber2Optional:
				builder.setNumber2Optional(reader.readLong(fieldNumber));
				break;
			case fieldNumberNameOptional:
				builder.setNameOptional(reader.readString(fieldNumber));
				break;
			case fieldNumberBoolValOptional:
				builder.setBoolValOptional(reader.readBoolean(fieldNumber));
				break;
			case fieldNumberAmountOptional:
				builder.setAmountOptional(reader.readDouble(fieldNumber));
				break;
			case fieldNumberFloatNumOptional:
				builder.setFloatNumOptional(reader.readFloat(fieldNumber));
				break;
			case fieldNumberByteStringObjOptional:
				builder.setByteStringObjOptional(reader.readByteString(fieldNumber));
				break;
			case fieldNumberIdList:
				builder.addElementIdList(reader.readInt(fieldNumber));
				break;
			case fieldNumberNumber2List:
				builder.addElementNumber2List(reader.readLong(fieldNumber));
				break;
			case fieldNumberNameList:
				builder.addElementNameList(reader.readString(fieldNumber));
				break;
			case fieldNumberBoolValList:
				builder.addElementBoolValList(reader.readBoolean(fieldNumber));
				break;
			case fieldNumberAmountList:
				builder.addElementAmountList(reader.readDouble(fieldNumber));
				break;
			case fieldNumberFloatNumList:
				builder.addElementFloatNumList(reader.readFloat(fieldNumber));
				break;
			case fieldNumberByteStringObjList:
				builder.addElementByteStringObjList(reader.readByteString(fieldNumber));
				break;
		default:
			reader.getPreviousTagDataTypeAndReadContent();
		}
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		JunitTestLargeObject.unknownTagHandler = unknownTagHandler;
	}

	public static JunitTestLargeObject parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static JunitTestLargeObject parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static JunitTestLargeObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}