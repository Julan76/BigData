import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
public class NoteCountMapper 
extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	private static final IntWritable one = new IntWritable(1);
	private Text word = new Text();
	
	
	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		
		
		
		System.out.println("");
		
		String[] tokens = value.toString().split("::");
		String cle = tokens[2];
		context.write(new Text(cle), one);
		
	}
}